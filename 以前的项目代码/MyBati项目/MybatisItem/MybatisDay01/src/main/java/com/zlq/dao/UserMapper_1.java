package com.zlq.dao;


import com.zlq.entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //    获取全部用户
    List<User> getUserList();

    //    根据id查询
    User getUserById(int id);
    User getUserById2(Map<String,Object> map);

//    模糊查询
    List<User> selectLike(String s);


    //添加用户
    int addUser(User user);
//万能的map
    int addUser2(Map<String,Object> map);

    //    修改用户
    int updateUser(User user);

    //    删除用户
    int deleteUser(int id);
}