package com.hgkj.model.service.impl;

import com.hgkj.model.dao.UsersDao;
import com.hgkj.model.dao.impl.UsersDaoImpl;
import com.hgkj.model.entity.Users;
import com.hgkj.model.service.UsersService;

import java.util.List;

public class UsersServiceImpl implements UsersService {
    private UsersDao ud=new UsersDaoImpl();

    @Override
    public boolean userLoginService(Users users) {
        return ud.userLoginDao(users);
    }
    public List<Users> allUsersService() {
        return ud.allUsersDao();
    }
}
