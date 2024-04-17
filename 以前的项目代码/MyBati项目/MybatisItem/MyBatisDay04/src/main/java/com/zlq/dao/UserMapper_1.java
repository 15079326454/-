package com.zlq.dao;


import com.zlq.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> getUser();
//    @Param:方法存在多个参数，所在的参数前面必须加上@Param
    @Select("select * from user where id=#{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into User values(#{id},#{name},#{password},#{address},#{phone})")
    User addUser(User user);

    @Update("update user set name=#{name},password=#{password},address=#{address},phone=#{phone} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from user where id=#{id}")
    int deleteUser(int id);


}