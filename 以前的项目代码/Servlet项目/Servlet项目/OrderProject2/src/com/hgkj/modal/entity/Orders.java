package com.hgkj.modal.entity;

public class Orders {
    private  int orderId;
    private  int orderNum;
    private double orderPrice;
    private String orderTime;
    private String orderAddress;
    private int userID;


    public Orders(int i, double v, String formatDate, String ret_Introduce, int userID) {
    }

    public Orders(int orderId, int orderNum, double orderPrice, String orderTime, String orderAddress, int userID) {
        this.orderId = orderId;
        this.orderNum = orderNum;
        this.orderPrice = orderPrice;
        this.orderTime = orderTime;
        this.orderAddress = orderAddress;
        this.userID = userID;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
