package com.zxdc.model.serviceImpl;

import com.zxdc.model.daoImpl.menusDaoImpl;
import com.zxdc.model.daoInf.menusDaoInf;
import com.zxdc.model.entity.Menus;
import com.zxdc.model.entity.RestMenus;
import com.zxdc.model.serviceInf.MenusServiceInf;

import java.util.List;

/**
 * user@Bright Rain .
 * 2019/5/8.
 */
public class MenusServiceImpl implements MenusServiceInf {
    private menusDaoInf dao = new menusDaoImpl();
    @Override
    public List<Menus> queryMenusAllByRetId(int retId) {
        return dao.queryMenusById(retId);
    }

    @Override
    public boolean delMenusByRetId(int retId) {
        return dao.delMenusByRetIdDao( retId);
    }

    @Override
    public List<Menus> queryMenusAll() {
        return dao.getMenusAll();
    }

    @Override
    public boolean addMenusService(Menus menus) {
        return dao.addMenusDao(menus);
    }

    @Override
    public  RestMenus queryMenusByRetId(int parseInt) {
        return dao.queryRsetMenusByIdDao(parseInt);
    }
}
