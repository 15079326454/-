package com.hgkj.modal.service;

import com.hgkj.modal.entity.Resturants;

import java.util.List;

public interface ResturantsService {
    public List<Resturants> allresturantsService();
//    Resturants getResturantsByIdService(int redId);
    Resturants getResturantByAdrName(String retName, String retAddress);
    boolean addResturantsService(Resturants resturants);
    boolean updateResturantsByIdService(Resturants resturants);
    boolean delResturantsByIdService(int ret_Id);
    public  Resturants getRestByIdService(int ret_Id);
}
