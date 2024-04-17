package com.zxdc.model.serviceImpl;

import com.zxdc.model.daoImpl.UserDaoImpl;
import com.zxdc.model.daoInf.UserDaoInf;
import com.zxdc.model.entity.User;
import com.zxdc.model.serviceInf.UserServiceInf;

/**
 * user@Bright Rain .
 * 2019/5/8.
 */
public class UserServiceImpl implements UserServiceInf {
    private UserDaoInf dao = new UserDaoImpl();
    @Override
    public User userLoginService(User user) {
        return dao.userLoginDao(user);
    }

    @Override
    public boolean userRegistService(User user) {
        return dao.userRegistDao(user);
    }
}
