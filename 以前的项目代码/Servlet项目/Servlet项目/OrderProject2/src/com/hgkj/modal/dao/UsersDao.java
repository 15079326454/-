package com.hgkj.modal.dao;

import com.hgkj.modal.entity.Users;

import java.util.List;

public interface UsersDao {
    public  boolean usersLoginDao(Users users);
    public List<Users> allUsersDao();
  public  boolean insertUsersDao(Users users);
}
