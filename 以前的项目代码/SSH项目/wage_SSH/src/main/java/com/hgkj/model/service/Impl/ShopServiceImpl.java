package com.hgkj.model.service.Impl;

import com.hgkj.model.dao.ShopDao;
import com.hgkj.model.entity.Shop;
import com.hgkj.model.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopDao shopDao;

    public ShopDao getShopDao() {
        return shopDao;
    }

    public void setShopDao(ShopDao shopDao) {
        this.shopDao = shopDao;
    }

    @Override
    public List<Shop> allShopService(Shop shop) {
        return shopDao.allShopDao(shop);
    }

    @Override
    public boolean addShopService(Shop shop) {
        return shopDao.addShopDao(shop);
    }

    @Override
    public boolean delShopService(int shopId) {
        return shopDao.delShopDao(shopId);
    }

    @Override
    public boolean updateShopService(Shop shop) {
        return shopDao.updateShopDao(shop);
    }

    @Override
    public Shop ShopByIdService(int shopId) {
        return shopDao.ShopByIdDao(shopId);
    }
}
