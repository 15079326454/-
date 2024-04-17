package com.zlq.basic.Dao;

import com.zlq.basic.entity.User;

public interface UserDao {
    public void saveUser(User user);

    public void querryUserByNameAndPassword(String name,String Password);
}

