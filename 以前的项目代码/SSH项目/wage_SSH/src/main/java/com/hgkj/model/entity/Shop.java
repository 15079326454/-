package com.hgkj.model.entity;

import java.util.HashSet;
import java.util.Set;

public class Shop {
    private int shopId;
    private String shopName;
    private String shopAddress;
    private int shopState;
    private String shopSupervisor;
    private String shopRemark;

    /*员工信息表*/
    private Set<Staffinfo> staffinfoHashSet=new HashSet <>();

    public Set <Staffinfo> getStaffinfoHashSet() {
        return staffinfoHashSet;
    }

    public void setStaffinfoHashSet(Set <Staffinfo> staffinfoHashSet) {
        this.staffinfoHashSet = staffinfoHashSet;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public int getShopState() {
        return shopState;
    }

    public void setShopState(int shopState) {
        this.shopState = shopState;
    }

    public String getShopSupervisor() {
        return shopSupervisor;
    }

    public void setShopSupervisor(String shopSupervisor) {
        this.shopSupervisor = shopSupervisor;
    }

    public String getShopRemark() {
        return shopRemark;
    }

    public void setShopRemark(String shopRemark) {
        this.shopRemark = shopRemark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shop shop = (Shop) o;

        if (shopId != shop.shopId) return false;
        if (shopState != shop.shopState) return false;
        if (shopName != null ? !shopName.equals(shop.shopName) : shop.shopName != null) return false;
        if (shopAddress != null ? !shopAddress.equals(shop.shopAddress) : shop.shopAddress != null) return false;
        if (shopSupervisor != null ? !shopSupervisor.equals(shop.shopSupervisor) : shop.shopSupervisor != null)
            return false;
        if (shopRemark != null ? !shopRemark.equals(shop.shopRemark) : shop.shopRemark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shopId;
        result = 31 * result + (shopName != null ? shopName.hashCode() : 0);
        result = 31 * result + (shopAddress != null ? shopAddress.hashCode() : 0);
        result = 31 * result + shopState;
        result = 31 * result + (shopSupervisor != null ? shopSupervisor.hashCode() : 0);
        result = 31 * result + (shopRemark != null ? shopRemark.hashCode() : 0);
        return result;
    }
}
