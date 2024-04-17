package com.hgkj.model.service;

import com.hgkj.model.entity.Shop;

import java.util.List;

public interface ShopService {
    public List<Shop> allShopService(Shop shop);
    public boolean addShopService(Shop shop);
    public boolean delShopService(int shopId);
    public boolean updateShopService(Shop shop);
    public Shop ShopByIdService(int shopId);
}
