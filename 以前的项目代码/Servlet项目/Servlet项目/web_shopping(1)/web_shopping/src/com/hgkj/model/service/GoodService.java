package com.hgkj.model.service;

import com.hgkj.model.entity.Good;

import java.util.List;

public interface GoodService {
    public List<Good>allGoodService();
    public Good getGoodByIdService(int goodId);
    public  boolean insertService(Good good);
    public  boolean deleteService(int goodId);
    public  boolean UpdateService(Good good);
}
