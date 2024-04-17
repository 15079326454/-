package com.hgkj.modal.service;

import com.hgkj.modal.entity.Users;

import java.util.List;

public interface UsersService {
    public  boolean usersLoginService(Users users);
    public List<Users> allUsersService();
    public  boolean insertUsersService(Users users);

}
