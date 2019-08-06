package mini.log;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
@Service
@Aspect
public class Loggers {
	private Logger work_log = 
			Logger.getLogger("work"); 
	private Logger user_log = 
			Logger.getLogger("user"); 
	private Logger data_log = 
			Logger.getLogger("data"); 
	
	
	
	// before
	@Before("execution(* mini.controller..*Controller.*(..))")
	public void logging(JoinPoint jp) {
//		HttpSession session = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
		work_log.debug(jp.getSignature().getName());
		Object [] args = jp.getArgs();
		
		data_log.debug(args[0]);
	
		//work_log.debug(jp.getArgs()[0].toString());
	}
	// after
//	@AfterReturning(
//		pointcut="execution(* com.sds.component..*Service.*(..))"	
//		,returning="obj"
//	)
	public void logger(JoinPoint jp,Object obj) {
		System.out.println(jp.getSignature().getName());
		System.out.println(jp.getArgs()[0].toString());
		System.out.println("RESULT:"+obj.toString());
	}
	@Around("execution(* mini.component..*Service.*(..))")
	public Object aroundLogger(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("함수 실행 전");
		System.out.println(pjp.getSignature().getName());
		System.out.println(pjp.getArgs()[0].toString());
		Object returnObj = pjp.proceed();
		System.out.println(returnObj.toString());
		System.out.println("함수 실행 후");
		return returnObj;
	}
}





