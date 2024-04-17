package com.zlq.Proxy.Service.ServiceImpl;

import com.zlq.Proxy.Entity.User;
import com.zlq.Proxy.Service.UserService;

/**
 * 代理类，实现额外功能
 */
public class UserServiceProxy implements UserService {
private UserServiceImpl userService = new UserServiceImpl();
    @Override
    public void register(User user) {
        System.err.println("------------log-------");
        userService.register(user);
    }

    @Override
    public boolean login(String name, String Password) {
        System.err.println("------------log-------");
        return userService.login(name, Password);
    }
}
