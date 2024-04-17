package com.zxdc.model.daoInf;

import com.zxdc.model.entity.Resturants;

import java.util.List;

/**
 * user@Bright Rain .
 * 2019/5/8.
 */
public interface ResturantsDaoInf {
    Resturants addResturants(Resturants resturants);
    List<Resturants> queryAllResturantsDao(int pageNumber, int pageSize);
    Resturants getResturantsByIdDao(int retId);

    boolean updateResturantsByIdDao(Resturants resturants);

    boolean delResturantsByIdDao(int redId);
    Resturants selectUserBy(String resturantName, String adress);
    List<Resturants> getRestAdressDao();
}
