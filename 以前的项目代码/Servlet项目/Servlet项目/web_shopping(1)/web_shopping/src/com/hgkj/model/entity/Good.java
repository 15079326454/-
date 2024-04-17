package com.hgkj.model.entity;

public class Good {
    private int goodId;
    private  String goodName;
    private  String goodAddress;
    private  double goodPrice;


    public Good(int goodId, String goodName, String goodAddress, double goodPrice) {
        this.goodId = goodId;
        this.goodName = goodName;
        this.goodAddress = goodAddress;
        this.goodPrice = goodPrice;
    }

    public Good(String goodName, String goodAddress, double goodPrice) {
        this.goodName = goodName;
        this.goodAddress = goodAddress;
        this.goodPrice = goodPrice;
    }

    public Good(){}
    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodAddress() {
        return goodAddress;
    }

    public void setGoodAddress(String goodAddress) {
        this.goodAddress = goodAddress;
    }

    public double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(double goodPrice) {
        this.goodPrice = goodPrice;
    }


}
