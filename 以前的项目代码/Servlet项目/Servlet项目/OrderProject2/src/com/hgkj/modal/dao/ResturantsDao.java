package com.hgkj.modal.dao;

import com.hgkj.modal.entity.Resturants;
import com.hgkj.modal.entity.Users;

import java.util.List;

public interface ResturantsDao {
     public List<Resturants> allresturantsDao();
     boolean addResturants(Resturants resturants);
     boolean updateResturantsByIdDao(Resturants resturants);
     boolean delResturantsByIdDao(int ret_Id);
     public  Resturants getRestByIdDao(int ret_Id);

//     Resturants getResturantsByIdDao(int retId);
     Resturants getResturantByAdrName(String retName, String retAddress);
}
