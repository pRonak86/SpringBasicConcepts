package com.bean;

//import org.aspectj.lang.JoinPoint
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestOperations {
	@Pointcut("execution(* Test.msg(..))")
	public void t() {

	}
	//@after,@before,@around
//	@AfterReturning("execution(* Test.msg(..))")
//	//@After("t()")
//	
//	//@AfterThrowing("t()")
//	//@Around("execution(* Test.msg(..))")
//	public void dec(JoinPoint joinPoint) {
//		System.out.println("Method from TestOperations");
//	}
	@Around("t()")
	public void myaround(ProceedingJoinPoint point) throws Throwable
	{
		
		//Database connectivity-- Database connection Before 
		//Query execution-- Place another file
		//Connection close-- After define method execution 
		System.out.println("Before Method");
		point.proceed();
		System.out.println("Around Method");
	}
}
