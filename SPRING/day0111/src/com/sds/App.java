package com.sds;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");
		System.out.println("Spring Started");

		/*
		 * TV tv = (TV)factory.getBean("ltv"); // 인터페이스 안의 함수만 호출 가능 // ltv만의 고유한 함수는 호출
		 * 불가 tv.turnOn(); TV tv2 = (TV)factory.getBean("ltv"); tv2.turnOn(); // xml에서
		 * scope="prototype" 바꾸면 미리 만들어놓지 않고 하나씩 생성해냄 if (tv==tv2) {
		 * System.out.println("ok"); }
		 */
		// Spring의 의존성 주입은 모두 xml로 한다
		TV tv = (TV)factory.getBean("stv");
		tv.up();
		System.out.println(tv);
		
		TV tv2 = (TV)factory.getBean("ltv");
		tv2.up();
		System.out.println(tv2);
	}
}
