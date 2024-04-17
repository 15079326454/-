package com.zlq.Aspect;
import com.zlq.Log;
import com.zlq.Proxy.Entity.User;
import com.zlq.Proxy.Service.UserService;

public class UserServiceImpl implements UserService {
    /**
     * 使用spring的工厂来声明自定义的变量
     * @param user
     */
    @Log
    @Override
    public void register(User user) {
        System.out.println("UserServiceImpl调用了register方法  业务运算+Dao");
//        throw new RuntimeException("测试 异常");
    }

    @Override
    public boolean login(String name, String Password) {
        System.out.println("UserServiceImpl调用了login方法");
        return true;
    }
}
