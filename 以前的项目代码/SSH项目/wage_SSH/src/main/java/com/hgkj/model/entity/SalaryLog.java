package com.hgkj.model.entity;

import java.math.BigDecimal;

public class SalaryLog {
    private int sallogId;
    private String staffName;
    private String shopName;
    private String levelName;
    private String salTime;
    private BigDecimal levelPrice;
    private BigDecimal attPercent;
    private BigDecimal totalSubsidy;
    private BigDecimal totalReward;
    private BigDecimal salaryOld;
    private BigDecimal salaryTrue;
    private String sallogRemark;
/*员工表*/
    private Staffinfo staffinfo;


    public Staffinfo getStaffinfo() {
        return staffinfo;
    }

    public void setStaffinfo(Staffinfo staffinfo) {
        this.staffinfo = staffinfo;
    }

    public int getSallogId() {
        return sallogId;
    }

    public void setSallogId(int sallogId) {
        this.sallogId = sallogId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getSalTime() {
        return salTime;
    }

    public void setSalTime(String salTime) {
        this.salTime = salTime;
    }

    public BigDecimal getLevelPrice() {
        return levelPrice;
    }

    public void setLevelPrice(BigDecimal levelPrice) {
        this.levelPrice = levelPrice;
    }

    public BigDecimal getAttPercent() {
        return attPercent;
    }

    public void setAttPercent(BigDecimal attPercent) {
        this.attPercent = attPercent;
    }

    public BigDecimal getTotalSubsidy() {
        return totalSubsidy;
    }

    public void setTotalSubsidy(BigDecimal totalSubsidy) {
        this.totalSubsidy = totalSubsidy;
    }

    public BigDecimal getTotalReward() {
        return totalReward;
    }

    public void setTotalReward(BigDecimal totalReward) {
        this.totalReward = totalReward;
    }

    public BigDecimal getSalaryOld() {
        return salaryOld;
    }

    public void setSalaryOld(BigDecimal salaryOld) {
        this.salaryOld = salaryOld;
    }

    public BigDecimal getSalaryTrue() {
        return salaryTrue;
    }

    public void setSalaryTrue(BigDecimal salaryTrue) {
        this.salaryTrue = salaryTrue;
    }

    public String getSallogRemark() {
        return sallogRemark;
    }

    public void setSallogRemark(String sallogRemark) {
        this.sallogRemark = sallogRemark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalaryLog salaryLog = (SalaryLog) o;

        if (sallogId != salaryLog.sallogId) return false;
        if (staffName != null ? !staffName.equals(salaryLog.staffName) : salaryLog.staffName != null) return false;
        if (shopName != null ? !shopName.equals(salaryLog.shopName) : salaryLog.shopName != null) return false;
        if (levelName != null ? !levelName.equals(salaryLog.levelName) : salaryLog.levelName != null) return false;
        if (salTime != null ? !salTime.equals(salaryLog.salTime) : salaryLog.salTime != null) return false;
        if (levelPrice != null ? !levelPrice.equals(salaryLog.levelPrice) : salaryLog.levelPrice != null) return false;
        if (attPercent != null ? !attPercent.equals(salaryLog.attPercent) : salaryLog.attPercent != null) return false;
        if (totalSubsidy != null ? !totalSubsidy.equals(salaryLog.totalSubsidy) : salaryLog.totalSubsidy != null)
            return false;
        if (totalReward != null ? !totalReward.equals(salaryLog.totalReward) : salaryLog.totalReward != null)
            return false;
        if (salaryOld != null ? !salaryOld.equals(salaryLog.salaryOld) : salaryLog.salaryOld != null) return false;
        if (salaryTrue != null ? !salaryTrue.equals(salaryLog.salaryTrue) : salaryLog.salaryTrue != null) return false;
        if (sallogRemark != null ? !sallogRemark.equals(salaryLog.sallogRemark) : salaryLog.sallogRemark != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sallogId;
        result = 31 * result + (staffName != null ? staffName.hashCode() : 0);
        result = 31 * result + (shopName != null ? shopName.hashCode() : 0);
        result = 31 * result + (levelName != null ? levelName.hashCode() : 0);
        result = 31 * result + (salTime != null ? salTime.hashCode() : 0);
        result = 31 * result + (levelPrice != null ? levelPrice.hashCode() : 0);
        result = 31 * result + (attPercent != null ? attPercent.hashCode() : 0);
        result = 31 * result + (totalSubsidy != null ? totalSubsidy.hashCode() : 0);
        result = 31 * result + (totalReward != null ? totalReward.hashCode() : 0);
        result = 31 * result + (salaryOld != null ? salaryOld.hashCode() : 0);
        result = 31 * result + (salaryTrue != null ? salaryTrue.hashCode() : 0);
        result = 31 * result + (sallogRemark != null ? sallogRemark.hashCode() : 0);
        return result;
    }
}
