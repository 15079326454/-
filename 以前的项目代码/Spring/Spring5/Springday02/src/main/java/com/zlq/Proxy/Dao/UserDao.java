package com.zlq.Proxy.Dao;


import com.zlq.Proxy.Entity.User;

public interface UserDao {
    public void saveUser(User user);

    public void querryUserByNameAndPassword(String name, String Password);
}

