package com.hgkj.model.service.Impl;

import com.hgkj.model.dao.LoginDao;
import com.hgkj.model.entity.Staffinfo;
import com.hgkj.model.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;

    public LoginDao getLoginDao() { return loginDao; }

    public void setLoginDao(LoginDao loginDao) { this.loginDao = loginDao; }


    @Override
    public Staffinfo LoginService(Staffinfo staffinfo) {
        return loginDao.LoginDao(staffinfo);
    }

    @Override
    public boolean updateService(Staffinfo staffinfo) {
        return loginDao.updateDao(staffinfo);
    }


}
