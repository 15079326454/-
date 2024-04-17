package com.hgkj.model.entity;

import java.util.HashMap;
import java.util.Map;
public class ShopCar {
    private  Map<Integer,GoodItem>itemMap;
    private double totalPrice;
    public ShopCar(){itemMap=new HashMap<>();}
    public void  clearCar(){itemMap.clear();}
    public void deleteCarById(int goodId){itemMap.remove(goodId);}
    public Map<Integer,GoodItem>getItemMap(){return itemMap;}
    public void buyGood(Good good){
        GoodItem goodItem=new GoodItem();
        if (itemMap.containsKey(good.getGoodId())){
            goodItem=itemMap.get(good.getGoodId());
            goodItem.setCount(goodItem.getCount()+1);
        }else {
            goodItem.setGoodId(good.getGoodId());
            goodItem.setGoodName(good.getGoodName());
            goodItem.setGoodPrice(good.getGoodPrice());

            goodItem.setCount(1);
        }
        itemMap.put(good.getGoodId(),goodItem);
    }
    public void setItemMap(Map<Integer,GoodItem>itemMap){this.itemMap=itemMap;}

    public double getTotalPrice() {
        totalPrice=0;
        for (GoodItem item:itemMap.values()){
            totalPrice+=item.getGoodPrice()*item.getCount();
        }
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice){this.totalPrice = totalPrice;}
}

