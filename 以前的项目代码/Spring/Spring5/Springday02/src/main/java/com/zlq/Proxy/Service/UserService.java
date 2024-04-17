package com.zlq.Proxy.Service;


import com.zlq.Proxy.Entity.User;

public interface UserService {
    public void register(User user);

    public boolean login(String name, String Password);
}
