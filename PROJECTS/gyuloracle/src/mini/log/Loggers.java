package mini.log;



import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
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
	private Logger product_log = 
			Logger.getLogger("product"); 
	
	
	// before
	@After("execution(* mini.controller..ProductController.*(..))")
	public void logging(JoinPoint jp) {
     
		
        product_log.debug(jp.getSignature().getName());
		Object [] args = jp.getArgs();
		
	
		//work_log.debug(jp.getArgs()[0].toString());
	}
	// after
//	@AfterReturning(
//		pointcut="execution(* com.sds.component..*Service.*(..))"	
//		,returning="obj"
//	)
//	public void logger(JoinPoint jp,Object obj) {
//		System.out.println(jp.getSignature().getName());
//		System.out.println(jp.getArgs()[0].toString());
//		System.out.println("RESULT:"+obj.toString());
//	}
//	@Around("execution(* mini.controller..*Controller.*(..))")
//	public Object aroundLogger(ProceedingJoinPoint pjp) throws Throwable {
//		System.out.println("함수 실행 전");
//		System.out.println(pjp.getSignature().getName());
//		System.out.println(pjp.getArgs()[0].toString());
//		Object returnObj = pjp.proceed();
//		System.out.println(returnObj.toString());
//		System.out.println("함수 실행 후");
//	
//		return returnObj;
//	}
}





