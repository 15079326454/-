package com.hgkj.model.service;

import com.hgkj.model.entity.Users;

import java.util.List;

public interface UsersService {
    public boolean userLoginService(Users users);
    public List<Users> allUsersService();
    public  boolean insertUsersService(Users users);
}
