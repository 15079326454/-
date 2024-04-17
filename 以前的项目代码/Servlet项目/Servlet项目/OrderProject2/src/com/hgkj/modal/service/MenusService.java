package com.hgkj.modal.service;

import com.hgkj.modal.entity.Admins;
import com.hgkj.modal.entity.Menus;
import com.hgkj.modal.entity.RetMenus;

import java.util.List;

public interface MenusService {
    List<Menus> MenusByIdService(int retId);
    List<Menus> getMenusAllService();
    RetMenus RestMenusByIdService(int parseInt);
    boolean addMenussService(Menus menus);
    boolean updateMenusService(Menus menus);
    boolean delMenusByIdService(int menusId);
    boolean delMenusAllByIdService(int ret_Id);
    public Menus getMenusByIdService(int menudId);
    Menus getByNameService(String menuName);
}
