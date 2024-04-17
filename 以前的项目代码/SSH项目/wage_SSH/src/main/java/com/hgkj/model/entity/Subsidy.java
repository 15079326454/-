package com.hgkj.model.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Subsidy {
    private int subsidyId;
    private String subsidyName;
    private BigDecimal subsidyMoney;
    /*补贴记录表*/
private Set<SubsidyLog> subsidyLogs=new HashSet <>();


    public Set <SubsidyLog> getSubsidyLogs() {
        return subsidyLogs;
    }

    public void setSubsidyLogs(Set <SubsidyLog> subsidyLogs) {
        this.subsidyLogs = subsidyLogs;
    }

    public int getSubsidyId() {
        return subsidyId;
    }

    public void setSubsidyId(int subsidyId) {
        this.subsidyId = subsidyId;
    }

    public String getSubsidyName() {
        return subsidyName;
    }

    public void setSubsidyName(String subsidyName) {
        this.subsidyName = subsidyName;
    }

    public BigDecimal getSubsidyMoney() {
        return subsidyMoney;
    }

    public void setSubsidyMoney(BigDecimal subsidyMoney) {
        this.subsidyMoney = subsidyMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subsidy subsidy = (Subsidy) o;

        if (subsidyId != subsidy.subsidyId) return false;
        if (subsidyName != null ? !subsidyName.equals(subsidy.subsidyName) : subsidy.subsidyName != null) return false;
        if (subsidyMoney != null ? !subsidyMoney.equals(subsidy.subsidyMoney) : subsidy.subsidyMoney != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subsidyId;
        result = 31 * result + (subsidyName != null ? subsidyName.hashCode() : 0);
        result = 31 * result + (subsidyMoney != null ? subsidyMoney.hashCode() : 0);
        return result;
    }
}
