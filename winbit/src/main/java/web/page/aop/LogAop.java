package web.page.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAop {
	  private static final Logger logger = LoggerFactory.getLogger(LogAop.class);
	 
	
	  
@Before("execution(* web.page.Service.BoardService*.*(*))")
	public void log(JoinPoint jp) {
	
	logger.info("=========================");
	System.out.println("Before aop start");
}
}

