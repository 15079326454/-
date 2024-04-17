package com.zxdc.model.entity;

public class Menus {
    private Integer menusid;

    @Override
    public String toString() {
        return "Menus{" +
                "menusid=" + menusid +
                ", menusname='" + menusname + '\'' +
                ", menusprice=" + menusprice +
                ", retId=" + retId +
                '}';
    }

    private String menusname;

    private Double menusprice;

    private Integer retId;

    public Integer getMenusid() {
        return menusid;
    }

    public void setMenusid(Integer menusid) {
        this.menusid = menusid;
    }

    public String getMenusname() {
        return menusname;
    }

    public void setMenusname(String menusname) {
        this.menusname = menusname == null ? null : menusname.trim();
    }

    public Double getMenusprice() {
        return menusprice;
    }

    public void setMenusprice(Double menusprice) {
        this.menusprice = menusprice;
    }

    public Integer getRetId() {
        return retId;
    }

    public void setRetId(Integer retId) {
        this.retId = retId;
    }
}