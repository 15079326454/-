package com.hgkj.modal.dao;

import com.hgkj.modal.entity.Admins;
import com.hgkj.modal.entity.Users;

import java.util.List;

public interface AdminsDao {
   public boolean AdminLogin(Admins admins);
    public List<Admins> allAdminsDao();
    boolean addAdminDao(Admins admins);
    boolean delAdminDao(int adminId);
    boolean updateAdminDao(Admins admins);
    public  Admins getAdminByIdDao(int adminId);
    public  List<Admins> getAdminByIdDao2(int adminId);
}

