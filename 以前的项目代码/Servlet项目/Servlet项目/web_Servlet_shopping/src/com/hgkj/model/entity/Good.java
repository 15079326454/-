package com.hgkj.model.entity;

public class Good {
    private int goodId;
    private  String goodName;
    private  double goodPrice;
    private  String goodAddress;


    public  Good(){}

    public Good(String goodName, double goodPrice, String goodAddress) {
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.goodAddress = goodAddress;
    }

    public Good(int goodId, String goodName, double goodPrice, String goodAddress) {
        this.goodId = goodId;
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.goodAddress = goodAddress;
    }

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

    public double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public String getGoodAddress() {
        return goodAddress;
    }

    public void setGoodAddress(String goodAddress) {
        this.goodAddress = goodAddress;
    }
}
