package com.hgkj.model.service.Impl;

import com.hgkj.model.Dao.Impl.UsersDaoImpl;
import com.hgkj.model.Dao.UsersDao;
/*import com.hgkj.model.dao.UsersDao;
import com.hgkj.model.dao.impl.UsersDaoImpl;*/
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

    @Override
    public boolean insertUsersService(Users users) {
        return ud.insertUsersDao(users);
    }
}
