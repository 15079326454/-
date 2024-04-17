package com.zlq.model.dao.Impl;

import com.zlq.model.dao.UserDao;

public class MySqlDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.err.println("MySql的实现类");
    }
}
