package com.hgkj.model.service.impl;

import com.hgkj.model.dao.GoodDao;
import com.hgkj.model.dao.impl.GoodDaoImpl;
import com.hgkj.model.entity.Good;
import com.hgkj.model.service.GoodService;

import java.util.List;

public class GoodServiceImpl  implements GoodService {
    private GoodDao gd=new GoodDaoImpl();

    @Override
    public List<Good> allGoodService() {
        return gd.allGoodDao();
    }

    @Override
    public Good getGoodByIdService(int goodId) {
        return gd.getGoodByIdDao(goodId);
    }

    @Override
    public boolean insertService(Good good) {

        return gd.insertDao(good);
    }

    @Override
    public boolean deleteService(int goodId) {
        return gd.deleteDao(goodId);
    }

    @Override
    public boolean UpdateService(Good good) {
        return gd.UpdateDao(good);
    }
}
