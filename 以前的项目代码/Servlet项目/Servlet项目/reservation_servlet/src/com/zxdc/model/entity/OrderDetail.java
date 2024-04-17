package com.zxdc.model.entity;

public class OrderDetail {
    private Integer ordId;

    private Integer ordNum;

    @Override
    public String toString() {
        return "OrderDetail{" +
                "ordId=" + ordId +
                ", ordNum=" + ordNum +
                ", orderid=" + orderid +
                ", menusid=" + menusid +
                '}';
    }

    private Integer orderid;

    private Integer menusid;

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public Integer getOrdNum() {
        return ordNum;
    }

    public void setOrdNum(Integer ordNum) {
        this.ordNum = ordNum;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getMenusid() {
        return menusid;
    }

    public void setMenusid(Integer menusid) {
        this.menusid = menusid;
    }
}