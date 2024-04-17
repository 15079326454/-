package com.zlq.basic.Dao.DaoImpl;

import com.zlq.basic.Dao.UserDao;
import com.zlq.basic.entity.User;

public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser(User user) {
        System.out.println("insert into user ="+user);
    }

    @Override
    public void querryUserByNameAndPassword(String name,String password) {
        System.out.println("query user name ="+name+",password="+password);
    }
}
