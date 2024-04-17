package com.hgkj.model.dao;

import com.hgkj.model.entity.Good;

import java.util.List;

public interface GoodDao {
    public  List<Good> allGoodDao();
 public Good getGoodByIdDao(int goodId);


}

