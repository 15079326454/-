package com.zxdc.model.serviceImpl;

import com.zxdc.model.daoImpl.RootDaoImpl;
import com.zxdc.model.daoInf.RootDaoInf;
import com.zxdc.model.entity.Admin;
import com.zxdc.model.serviceInf.RootServiceInf;

/**
 * user@Bright Rain .
 * 2019/5/8.
 */
public class RootServiceImpl implements RootServiceInf {
    private RootDaoInf dao = new RootDaoImpl();
    @Override
    public Admin RootLoginService(Admin admin) {
        return dao.AdminLogin(admin);
    }
}
