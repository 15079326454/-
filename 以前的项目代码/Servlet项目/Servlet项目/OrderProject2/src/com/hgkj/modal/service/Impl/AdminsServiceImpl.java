package com.hgkj.modal.service.Impl;

import com.hgkj.modal.dao.AdminsDao;
import com.hgkj.modal.dao.Impl.AdminsDaoImpl;
import com.hgkj.modal.entity.Admins;
import com.hgkj.modal.service.AdminsService;

import java.util.List;

public class AdminsServiceImpl implements AdminsService {
    AdminsDao dao=new AdminsDaoImpl();


    @Override
    public boolean AdminLogin(Admins admins) {
        return dao.AdminLogin(admins);
    }

    @Override
    public List<Admins> allAdminsService() {

        return dao.allAdminsDao();
    }

    @Override
    public boolean addAdminService(Admins admins) {
        return dao.addAdminDao(admins);
    }

    @Override
    public boolean delAdminService(int adminId) {
        return dao.delAdminDao(adminId);
    }

    @Override
    public boolean updateAdminService(Admins admins) {
        return dao.updateAdminDao(admins);
    }

    @Override
    public Admins getAdminByIdDao(int adminId) {
        return dao.getAdminByIdDao(adminId);
    }

    @Override
    public List <Admins> getAdminByIdDao2(int adminId) {
        return dao.getAdminByIdDao2(adminId);
    }
}
