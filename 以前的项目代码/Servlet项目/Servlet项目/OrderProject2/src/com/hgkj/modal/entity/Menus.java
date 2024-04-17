package com.hgkj.modal.entity;

public class Menus {
         private  int menusId;
         private  String menusName;
         private  double  menusPrice;
         private String menusPhot;
         private int ret_Id;



    public Menus(){}

    public Menus(String menusName, double menusPrice, int ret_Id) {
        this.menusName = menusName;
        this.menusPrice = menusPrice;
        this.ret_Id = ret_Id;
    }

    public Menus(int menusId, String menusName, double menusPrice, int ret_Id) {
        this.menusId = menusId;
        this.menusName = menusName;
        this.menusPrice = menusPrice;
        this.ret_Id = ret_Id;
    }

    public Menus(int menusId, String menusName, double menusPrice, int ret_Id , String menusPhot) {
        this.menusId = menusId;
        this.menusName = menusName;
        this.menusPrice = menusPrice;
        this.menusPhot=menusPhot;
        this.ret_Id = ret_Id;
    }

    public int getMenusId() {
        return menusId;
    }

    public void setMenusId(int menusId) {
        this.menusId = menusId;
    }

    public String getMenusName() {
        return menusName;
    }

    public void setMenusName(String menusName) {
        this.menusName = menusName;
    }

    public double getMenusPrice() {
        return menusPrice;
    }

    public void setMenusPrice(double menusPrice) {
        this.menusPrice = menusPrice;
    }

    public String getMenusPhot() {
        return menusPhot;
    }

    public void setMenusPhot(String menusPhot) {
        this.menusPhot = menusPhot;
    }

    public int getRet_Id() {
        return ret_Id;
    }

    public void setRet_Id(int ret_Id) {
        this.ret_Id = ret_Id;
    }



    @Override
    public String toString() {
        return "Menus{" +
                "menusId=" +menusId +
                ", menusName='" + menusName + '\'' +
                ", menusPrice=" +menusPrice +
                ", ret_Id=" + ret_Id +
                '}';
    }
}
