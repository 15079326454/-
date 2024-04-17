package com.hgkj.model.service.impl;

import com.hgkj.model.dao.UsersDao;
import com.hgkj.model.dao.impl.UsersDaoImpl;
import com.hgkj.model.entity.Users;
import com.hgkj.model.service.UsersService;

import java.util.List;
public class UsersServicelmpl implements UsersService {
    private UsersDao usersDao=new UsersDaoImpl();
    @Override
    public boolean userLoginService(Users users) {
        return usersDao.userLoginDao(users);
    }

    @Override
    public List <Users> allGoodService() {
        return null;
    }


}
