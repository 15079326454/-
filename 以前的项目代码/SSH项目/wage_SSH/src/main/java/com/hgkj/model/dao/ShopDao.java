package com.hgkj.model.dao;

import com.hgkj.model.entity.Shop;

import java.util.List;

public interface ShopDao {
    public List<Shop> allShopDao(Shop shop);
    public boolean addShopDao(Shop shop);
    public boolean delShopDao(int shopId);
    public boolean updateShopDao(Shop shop);
    public Shop ShopByIdDao(int shopId);
}
