package com.zxdc.model.serviceImpl;

import com.zxdc.model.daoImpl.ResturantsDaoImpl;
import com.zxdc.model.daoInf.ResturantsDaoInf;
import com.zxdc.model.entity.Resturants;
import com.zxdc.model.serviceInf.ResturantsServiceInf;

import java.util.List;

/**
 * user@Bright Rain .
 * 2019/5/8.
 */
public class ResturantsServiceImpl implements ResturantsServiceInf {
    private ResturantsDaoInf dao = new ResturantsDaoImpl();

    @Override
    public Resturants addResturantsService(Resturants resturants) {
        return dao.addResturants(resturants);
    }

    @Override
    public List<Resturants> queryAllResturantsService(int pageNumber, int pageSize) {
        return dao.queryAllResturantsDao(pageNumber,pageSize);
    }

    @Override
    public Resturants getResturantsByIdService(int redId) {
        return dao.getResturantsByIdDao(redId);
    }

    @Override
    public boolean updateResturantsById(Resturants resturants) {
        return dao.updateResturantsByIdDao(resturants);
    }

    @Override
    public boolean delResturantsById(int redId) {
        return dao.delResturantsByIdDao(redId);
    }

    @Override
    public List<Resturants> getAllRestAdess() {
        return dao.getRestAdressDao();
    }

    @Override
    public Resturants getResturantByAdrName(String resturantName, String adress) {
        return dao.selectUserBy(resturantName,adress);
    }
}
