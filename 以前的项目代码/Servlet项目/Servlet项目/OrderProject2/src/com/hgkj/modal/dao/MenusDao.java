package com.hgkj.modal.dao;

import com.hgkj.modal.entity.Admins;
import com.hgkj.modal.entity.Menus;
import com.hgkj.modal.entity.Resturants;
import com.hgkj.modal.entity.RetMenus;

import java.util.List;

public interface MenusDao {
    List<Menus> MenusByIdDao(int retId);
    List<Menus> getMenusAllDao();
    RetMenus RestMenusByIdDao(int parseInt);
    boolean addMenussDao(Menus menus);
    boolean updateMenusDao(Menus menus);
    boolean delMenusByIdDao(int menusId);
    boolean delMenusAllByIdDao(int ret_Id);
    public Menus getMenusByIdDao(int menusId);
    Menus getByName(String menuName);
}
