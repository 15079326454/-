package com.zxdc.model.serviceInf;

import com.zxdc.model.entity.Resturants;

import java.util.List;

/**
 * user@Bright Rain .
 * 2019/5/8.
 */
public interface ResturantsServiceInf {

    Resturants addResturantsService(Resturants resturants);
    List<Resturants> queryAllResturantsService(int pageNumber, int pageSize);
    Resturants getResturantsByIdService(int redId);
    boolean updateResturantsById(Resturants resturants);
    boolean delResturantsById(int redId);
    List<Resturants> getAllRestAdess();

    Resturants getResturantByAdrName( String resturantName, String adress);
}
