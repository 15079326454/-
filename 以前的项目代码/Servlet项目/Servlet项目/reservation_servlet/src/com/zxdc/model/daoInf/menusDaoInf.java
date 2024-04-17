package com.zxdc.model.daoInf;

import com.zxdc.model.entity.Menus;
import com.zxdc.model.entity.RestMenus;

import java.util.List;

/**
 * user@Bright Rain .
 * 2019/5/8.
 */
public interface menusDaoInf {
    List<Menus> queryMenusById(int retId);

     boolean delMenusByRetIdDao(int retId);

    boolean addMenusDao(Menus menus);

    RestMenus queryRsetMenusByIdDao(int parseInt);

    List<Menus> getMenusAll();
}
