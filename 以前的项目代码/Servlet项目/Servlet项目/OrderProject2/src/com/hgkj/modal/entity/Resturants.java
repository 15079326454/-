package com.hgkj.modal.entity;

public class Resturants {
    private  int ret_Id;
    private  String ret_Name;
    private  String ret_Address;
    private  String ret_Path;
private  String ret_Introduce;
    public Resturants(){}

    public Resturants(String ret_Name, String ret_Address, String ret_Path,String ret_Introduce) {
        this.ret_Name = ret_Name;
        this.ret_Address = ret_Address;
        this.ret_Path = ret_Path;
        this.ret_Introduce=ret_Introduce;
    }

    public Resturants(int ret_Id, String ret_Name, String ret_Address, String ret_Path,String ret_Introduce) {
        this.ret_Id = ret_Id;
        this.ret_Name = ret_Name;
        this.ret_Address = ret_Address;
        this.ret_Path = ret_Path;
        this.ret_Introduce=ret_Introduce;
    }

    public String getRet_Introduce() {
        return ret_Introduce;
    }

    public void setRet_Introduce(String ret_Introduce) {
        this.ret_Introduce = ret_Introduce;
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

    public String getRet_Address() {
        return ret_Address;
    }

    public void setRet_Address(String ret_Address) {
        this.ret_Address = ret_Address;
    }

    public String getRet_Path() {
        return ret_Path;
    }

    public void setRet_Path(String ret_Path) {
        this.ret_Path = ret_Path;
    }



}
