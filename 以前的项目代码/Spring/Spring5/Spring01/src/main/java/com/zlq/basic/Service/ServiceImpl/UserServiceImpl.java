package com.zlq.basic.Service.ServiceImpl;

import com.zlq.basic.Dao.UserDao;
import com.zlq.basic.Service.UserService;
import com.zlq.basic.entity.User;

public class UserServiceImpl implements UserService {
//    最开始时，给成员变量赋值，直接写在代码中
//    UserDao userDao = new UserDaoImpl();
    //   这是自己写的工厂模式，
//    UserDao userDao = BeenFactory.getUserDao();
//UserDao userDao = (UserDao) BeenFactory.getBean("userDAO");

    /**
     * 使用spring的工厂来声明自定义的变量
     * @param user
     */
private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void register(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void login(String name, String Password) {
        userDao.querryUserByNameAndPassword(name, Password);
    }
}
