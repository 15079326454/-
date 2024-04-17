package com.hgkj.modal.entity;

public class RetMenus {
    private  int ret_Id;
    private  String ret_Name;
    private  String ret_Path;
    private  String ret_Address;
    private  int menusId;
    private  String menusName;
    private double menusPrice;
    private  String menusPhot;


    public RetMenus() {
    }

    public RetMenus(String ret_Name, String ret_Path, int menusId, String menusName, double menusPrice,String menusPhot) {
        this.ret_Name = ret_Name;
        this.ret_Path = ret_Path;
        this.menusId = menusId;
        this.menusName = menusName;
        this.menusPrice = menusPrice;
        this.menusPhot=menusPhot;
    }

    public RetMenus(int ret_Id, String ret_Name, String ret_Path, String ret_Address, int menusId, String menusName, double menusPrice, String menusPhot) {
        this.ret_Id = ret_Id;
        this.ret_Name = ret_Name;
        this.ret_Path = ret_Path;
        this.ret_Address = ret_Address;
        this.menusId = menusId;
        this.menusName = menusName;
        this.menusPrice = menusPrice;
        this.menusPhot = menusPhot;
    }

    public int getRet_Id() {
        return ret_Id;
    }

    public void setRet_Id(int ret_Id) {
        this.ret_Id = ret_Id;
    }

    public String getRet_Name() {
        return ret_Name;
    }

    public void setRet_Name(String ret_Name) {
        this.ret_Name = ret_Name;
    }

    public String getRet_Path() {
        return ret_Path;
    }

    public void setRet_Path(String ret_Path) {
        this.ret_Path = ret_Path;
    }

    public String getRet_Address() {
        return ret_Address;
    }

    public void setRet_Address(String ret_Address) {
        this.ret_Address = ret_Address;
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
}
