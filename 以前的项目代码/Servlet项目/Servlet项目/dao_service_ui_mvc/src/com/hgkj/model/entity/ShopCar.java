package com.hgkj.model.entity;

import java.util.HashMap;
import java.util.Map;

public class ShopCar {
private Map<Integer,GoodItem> itemMap;
private  double totalMoney;

public  ShopCar(){
     itemMap= new HashMap();
}
public  void clearCar(){//删除方法
    itemMap.clear();
}
public void deleteCar(int goodId){//清空购物车的方法
    itemMap.remove(goodId);
}



public void buygood(Good good) {//购买物品的方法
    GoodItem goodItem = new GoodItem();
    if (itemMap.containsKey(good.getGoodId())) {
        goodItem = itemMap.get(good.getGoodId());
        goodItem.setGetCount(goodItem.getGetCount() + 1);
    } else {
        goodItem.setGoodId(goodItem.getGoodId());
        goodItem.setGoodName(goodItem.getGoodName());
        goodItem.setGoodPrice(goodItem.getGoodPrice());
        goodItem.setGetCount(1);
    }

             itemMap.put(good.getGoodId(),goodItem);
}
    public Map <Integer, com.hgkj.model.entity.GoodItem> getGoodItem() {
        return itemMap;
    }

    public void setGoodItem(Map <Integer, com.hgkj.model.entity.GoodItem> goodItem) {
        itemMap = goodItem;
    }

    public double getTotalMoney() {
        totalMoney=0;
        for (GoodItem item:itemMap.values()){
            totalMoney+=item.getGoodPrice()*item.getGetCount();
        }
        return totalMoney;
    }

    public Map<Integer,GoodItem> getItemMap(){
        return getItemMap();
    }
    public void setItemMap(Map <Integer, GoodItem> itemMap) {
        this.itemMap = itemMap;
    }
    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }



}