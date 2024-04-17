package com.zlq.model.demo04;

import com.zlq.model.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//我们会用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
//    被代理的接口
    private Object target;
    public void setRent(Rent rent) {
        this.target = rent;
    }

    //生成得到代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        动态代理的本质，就是使用反射机制实现
        Object result = method.invoke(target, args);
        return result;
    }
}
