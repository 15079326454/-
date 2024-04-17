package com.hgkj.modal.entity;

public class Order_detail {
    private  int ord_Id;
    private  int ord_Num;
    private  int orderId;
    private int menusId;

    public Order_detail() {
    }

    public Order_detail(int ord_Id, int ord_Num, int orderId, int menusId) {
        this.ord_Id = ord_Id;
        this.ord_Num = ord_Num;
        this.orderId = orderId;
        this.menusId = menusId;
    }

    public int getOrd_Id() {
        return ord_Id;
    }

    public void setOrd_Id(int ord_Id) {
        this.ord_Id = ord_Id;
    }

    public int getOrd_Num() {
        return ord_Num;
    }

    public void setOrd_Num(int ord_Num) {
        this.ord_Num = ord_Num;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getMenusId() {
        return menusId;
    }

    public void setMenusId(int menusId) {
        this.menusId = menusId;
    }
}
