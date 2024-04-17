package com.zlq.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
    @Pointcut("execution(* *..UserServiceImpl.*(..))")
    public void myPointcut(){}
    @Around(value = "myPointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.err.println("----------aspect log------------");
        Object ret =joinPoint.proceed();
        return ret;
    }

    @Around(value = "myPointcut()")
    public Object around1(ProceedingJoinPoint joinPoint) throws Throwable {
        System.err.println("----------aspect tx------------");
        Object ret =joinPoint.proceed();
        return ret;
    }

}
