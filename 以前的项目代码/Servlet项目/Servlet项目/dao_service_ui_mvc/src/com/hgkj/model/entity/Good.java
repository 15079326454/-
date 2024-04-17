package com.hgkj.model.entity;

public class Good {
    private int goodId;
    private String goodName;
    private double goodPrice;
    private String goodAddress;
  public  String goodDesp;

    public String getGoodDesp() {
        return goodDesp;
    }

    public void setGoodDesp(String goodDesp) {
        this.goodDesp = goodDesp;
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

    public Good(){}
    public Good(String goodName, String goodAddress, double goodPrice) {
        this.goodName = goodName;
        this.goodAddress = goodAddress;
        this.goodPrice = goodPrice;
    }

    public Good(int goodId, String goodName, String goodAddress, double goodPrice) {
        this.goodId = goodId;
        this.goodName = goodName;
        this.goodAddress = goodAddress;
        this.goodPrice = goodPrice;
    }


}
