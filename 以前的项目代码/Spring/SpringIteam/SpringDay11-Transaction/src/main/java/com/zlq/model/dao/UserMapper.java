package com.zlq.model.dao;

import com.zlq.model.entity.User;

import java.util.List;

public interface UserMapper {
//    查询用户
    public List<User> selectUser();
//    添加用户
public int addUser(User user);
//    删除用户
    public int deleteUser(int id);
}
