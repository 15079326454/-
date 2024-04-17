package com.hgkj.modal.service.Impl;

import com.hgkj.modal.dao.Impl.UsersDaoImpl;
import com.hgkj.modal.dao.UsersDao;
import com.hgkj.modal.entity.Users;
import com.hgkj.modal.service.UsersService;

import java.util.List;

public class UsersServiceImpl implements UsersService {
    private UsersDao ud=new UsersDaoImpl();
    @Override
    public boolean usersLoginService(Users users) {
        return ud.usersLoginDao(users);
    }

    @Override
    public List<Users> allUsersService() {
        return ud.allUsersDao();
    }

    @Override
    public boolean insertUsersService(Users users) {
        return ud.insertUsersDao(users);
    }
}
