package com.zlq.basic.Service;

import com.zlq.basic.entity.User;

public interface UserService {
    public void register(User user);

    public void login(String name,String Password);
}
