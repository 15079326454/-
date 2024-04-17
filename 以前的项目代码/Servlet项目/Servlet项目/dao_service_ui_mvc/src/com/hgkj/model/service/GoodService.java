package com.hgkj.model.service;

import com.hgkj.model.entity.Good;

import java.util.List;

public interface GoodService {
    public List <Good> allGoodService();
    public Good getGoodByIdService(int goodId);

}
