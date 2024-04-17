package com.zxdc.model.serviceInf;

import com.zxdc.model.entity.Menus;
import com.zxdc.model.entity.RestMenus;

import java.util.List;

/**
 * user@Bright Rain .
 * 2019/5/8.
 */
public interface MenusServiceInf {
    List<Menus> queryMenusAllByRetId(int retId);
    boolean delMenusByRetId(int retId);
    List<Menus> queryMenusAll();
    boolean addMenusService(Menus menus);
    RestMenus queryMenusByRetId(int parseInt);
}
