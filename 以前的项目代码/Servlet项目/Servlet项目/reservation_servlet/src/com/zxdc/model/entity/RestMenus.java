package com.zxdc.model.entity;

/**
 * user@Bright Rain .
 * 2019/5/9.
 */
public class RestMenus {
    private  int retId;
    private String retName;
    private String retPic;
    private String adress;
    private int menusId;
    private String menusName;
    private double menusPrice;


    public RestMenus(int retId, String retName, String retPic, String adress, int menusId, String menusName, double menusPrice) {
        this.retId = retId;
        this.retName = retName;
        this.retPic = retPic;
        this.adress = adress;
        this.menusId = menusId;
        this.menusName = menusName;
        this.menusPrice = menusPrice;
    }

    public RestMenus(String retName, String retPic, int menusId, String menusName, double menusPrice) {
        this.retName = retName;
        this.retPic = retPic;
        this.menusId = menusId;
        this.menusName = menusName;
        this.menusPrice = menusPrice;
    }

    public RestMenus() {
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getRetId() {
        return retId;
    }

    public void setRetId(int retId) {
        this.retId = retId;
    }

    public String getRetName() {
        return retName;
    }

    public void setRetName(String retName) {
        this.retName = retName;
    }

    public String getRetPic() {
        return retPic;
    }

    public void setRetPic(String retPic) {
        this.retPic = retPic;
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

    @Override
    public String toString() {
        return "RestMenus{" +
                "retId=" + retId +
                ", retName='" + retName + '\'' +
                ", retPic='" + retPic + '\'' +
                ", menusId=" + menusId +
                ", menusName='" + menusName + '\'' +
                ", menusPrice='" + menusPrice + '\'' +
                '}';
    }
}
