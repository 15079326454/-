package com.hgkj.modal.service.Impl;

import com.hgkj.modal.dao.Impl.ResturantsDaoImpl;
import com.hgkj.modal.dao.ResturantsDao;
import com.hgkj.modal.entity.Resturants;
import com.hgkj.modal.service.ResturantsService;

import java.util.List;

public class ResturantsServiceImpl implements ResturantsService {
    private ResturantsDao resturantsDao=new ResturantsDaoImpl();

    @Override
    public List<Resturants> allresturantsService() {
        return resturantsDao.allresturantsDao();
    }

//    @Override
//    public Resturants getResturantsByIdService(int redId) {
//        return resturantsDao.getResturantsByIdDao(redId);
//    }

    @Override
    public Resturants getResturantByAdrName(String retName, String retAddress) {
        return resturantsDao.getResturantByAdrName(retName,retAddress);
    }

    @Override
    public boolean addResturantsService(Resturants resturants) {
        return resturantsDao.addResturants(resturants);
    }

    @Override
    public boolean updateResturantsByIdService(Resturants resturants) {
        return resturantsDao.updateResturantsByIdDao(resturants);
    }

    @Override
    public boolean delResturantsByIdService(int ret_Id) {
        return resturantsDao.delResturantsByIdDao(ret_Id);
    }

    @Override
    public Resturants getRestByIdService(int ret_Id) {
        return resturantsDao.getRestByIdDao(ret_Id);
    }
}
