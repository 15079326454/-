package com.zlq.dynamic;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Before implements MethodBeforeAdvice {
    /**
     * 作用：需要把运行在原始方法执行前运行的额外功能，书写在before方法中。
     * @param method:额外功能所增加给的那个原始方法
     * @param args：额外功能所增加给的那个原始方法的参数。String name，String Password
     * @param target：额外功能所增加给的那个原始对像，UserServiceImpl , OrderServiceImpl
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.err.println("---------Method before advice log-------------");
    }
}
