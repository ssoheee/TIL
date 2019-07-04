package com.frame;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LogAdvice {
	public void printLog() {
		Date d = new Date();
		System.out.println(d + " [����α�] ����Ͻ� ���� ����...");
	}
	
	public void beforeLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object [] args = jp.getArgs(); // argument
		System.out.println(method+" : "+args[0]);
		System.out.println("[before] ����Ͻ� ���� ����...");
	}
	public void afterLog(JoinPoint jp, Object returnObj) {
		// jointpoint���� ����Ǳ��� �Լ� �̸�, �ƱԸ�Ʈ ���� �� �� �ִ�.
		System.out.println("[after] ����Ͻ� ���� ����...");
		System.out.println("Log Result: " + returnObj);
	}

	public void exLog(JoinPoint jp, Exception ex) {
		Date d = new Date();
		System.out.println(d + " [EX�α�] Exception...");
		System.out.println(ex.getMessage());
	}
	
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		System.out.println("Before Action...");
		Object obj=pjp.proceed();
		System.out.println("After Action...");
		stopWatch.stop();
		
		System.out.println("Processing Time: "+stopWatch.getTotalTimeSeconds());
		return obj;
	}
}
