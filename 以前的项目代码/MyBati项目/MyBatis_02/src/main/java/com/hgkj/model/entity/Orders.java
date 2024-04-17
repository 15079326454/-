package com.hgkj.model.entity;

public class Orders {
    private Integer id;

    private String orderNumber;
    private String orderPrice;
    private Tcustomer tcustomer;

    public Orders() {
    }

    public Orders(String orderNumber, String orderPrice, Tcustomer tcustomer) {
        this.orderNumber = orderNumber;
        this.orderPrice = orderPrice;
        this.tcustomer = tcustomer;
    }
    public Tcustomer getTcustomer() {
        return tcustomer;
    }

    public void setTcustomer(Tcustomer tcustomer) {
        this.tcustomer = tcustomer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice == null ? null : orderPrice.trim();
    }


}