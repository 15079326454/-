package com.hgkj.model.Dao;

import com.hgkj.model.entity.Users;

import java.util.List;

public interface UsersDao {
    public boolean userLoginDao(Users users);
    public List<Users> allUsersDao();
    public  boolean insertUsersDao(Users users);
}
