package com.hgkj.modal.service;

import com.hgkj.modal.entity.Admins;

import java.util.List;

public interface AdminsService {
    public boolean AdminLogin(Admins admins);
    public List<Admins> allAdminsService();
    boolean addAdminService(Admins admins);
    boolean delAdminService(int adminId);
    boolean updateAdminService(Admins admins);
    public  Admins getAdminByIdDao(int adminId);
    public  List<Admins> getAdminByIdDao2(int adminId);
}
