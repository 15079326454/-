package com.zxdc.model.entity;

import java.util.Date;

public class Order {
    private Integer orderid;

    public Order() {
    }

    public Order(Integer orderid, Integer ordernum, Double orderprice, String ordertime, String orderadress, Integer userid) {
        this.orderid = orderid;
        this.ordernum = ordernum;
        this.orderprice = orderprice;
        this.ordertime = ordertime;
        this.orderadress = orderadress;
        this.userid = userid;
    }

    public Order(Integer ordernum, Double orderprice, String ordertime, String orderadress, Integer userid) {
        this.ordernum = ordernum;
        this.orderprice = orderprice;
        this.ordertime = ordertime;
        this.orderadress = orderadress;
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderid=" + orderid +
                ", ordernum=" + ordernum +
                ", orderprice=" + orderprice +
                ", ordertime=" + ordertime +
                ", orderadress='" + orderadress + '\'' +
                ", userid=" + userid +
                '}';
    }

    private Integer ordernum;

    private Double orderprice;

    private String ordertime;

    private String orderadress;

    private Integer userid;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public Double getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(Double orderprice) {
        this.orderprice = orderprice;
    }

    public String getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime;
    }

    public String getOrderadress() {
        return orderadress;
    }

    public void setOrderadress(String orderadress) {
        this.orderadress = orderadress == null ? null : orderadress.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}