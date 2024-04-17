package com.zlq.dynamic;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Around implements MethodInterceptor {
    /**
     * 作用，额外功能书写在invoke方法中
     * 可运行在原始方法之前、之后、执行前，后
     *
     * @param invocation：额外功能所增加给的那个原始方法
     * @return ：原始方法执行后的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.err.println("---------额外功能运行在原始方法之前 log---------");
        Object ret =invocation.proceed();


//        Object ret = null;//原始方法的运行
//        try {
//            ret = invocation.proceed();
//        } catch (Throwable throwable) {
//            System.err.println("------原始方法抛出异常  执行的额外功能---------");
//            throwable.printStackTrace();
//        }
//        System.out.println("---------额外功能运行在原始方法之后 log---------");

        return ret;
    }
}
