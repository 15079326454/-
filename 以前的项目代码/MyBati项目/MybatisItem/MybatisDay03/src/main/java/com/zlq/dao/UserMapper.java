package com.zlq.dao;


import com.zlq.entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //    根据id查询
    User getUserById(int id);
//分页
    List<User> getUserByLimit(Map<String,Integer> map);

//    使用RowBounds实现分页
    List<User> getUserByRowBounds();

}