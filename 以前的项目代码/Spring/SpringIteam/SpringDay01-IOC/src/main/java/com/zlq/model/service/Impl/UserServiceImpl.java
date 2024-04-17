package com.zlq.model.service.Impl;

import com.zlq.model.dao.Impl.UserDaoImpl;
import com.zlq.model.dao.UserDao;
import com.zlq.model.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
