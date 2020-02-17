package com.brainmentors.aopdemo;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
	Logger logger = Logger.getLogger(LoggerAspect.class);
	
	
	long startTime ;
	@Pointcut("execution(* p*())")
	public void myPointCut() {
		
	}
	@Before("myPointCut()")
	public void start(JoinPoint p) {
		logger.debug("Inside Start of "+p.getSignature());
		System.out.println("Start Call "+p.getSignature());
		
		System.out.println("Method "+p.getStaticPart().getSignature().getName());
		startTime = System.currentTimeMillis();
	}
	@After("myPointCut()")
	public void end(JoinPoint p) {
		logger.debug("Going to end "+p.getSignature());
	System.out.println("End call");
	long endTime = System.currentTimeMillis();
	System.out.println("Total Time Taken "+(endTime-startTime)+"ms");
	}
	@AfterThrowing(pointcut="myPointCut()",throwing = "ex")
	public void excep(JoinPoint p, Exception ex) {
		ex.printStackTrace();
		logger.error("Exception Occured "+ex);
	System.out.println("End call");
	long endTime = System.currentTimeMillis();
	System.out.println("Total Time Taken "+(endTime-startTime)+"ms");
	}

}
