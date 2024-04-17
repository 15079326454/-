package com.hgkj.modal.service.Impl;

import com.hgkj.modal.dao.Impl.MenusDaoImpl;
import com.hgkj.modal.dao.MenusDao;
import com.hgkj.modal.entity.Menus;
import com.hgkj.modal.entity.RetMenus;
import com.hgkj.modal.service.MenusService;

import java.util.List;

public class MenusSeriviceImpl implements MenusService {
    private MenusDao dao =new MenusDaoImpl();
    @Override
    public List<Menus> MenusByIdService(int retId) {
        return dao.MenusByIdDao(retId);
    }

    @Override
    public List <Menus> getMenusAllService() {
        return dao.getMenusAllDao();
    }

    @Override
    public RetMenus RestMenusByIdService(int parseInt) {
        return dao.RestMenusByIdDao(parseInt);
    }

    @Override
    public boolean addMenussService(Menus menus) {
        return dao.addMenussDao(menus);
    }

    @Override
    public boolean updateMenusService(Menus menus) {
        return dao.updateMenusDao(menus);
    }

    @Override
    public boolean delMenusByIdService(int menusId) {
        return dao.delMenusByIdDao(menusId);
    }

    @Override
    public boolean delMenusAllByIdService(int ret_Id) {
        return dao.delMenusAllByIdDao(ret_Id);
    }


    @Override
    public Menus getMenusByIdService(int menudId) {
        return dao.getMenusByIdDao(menudId);
    }

    @Override
    public Menus getByNameService(String menuName) {
        return dao.getByName(menuName);
    }
}
