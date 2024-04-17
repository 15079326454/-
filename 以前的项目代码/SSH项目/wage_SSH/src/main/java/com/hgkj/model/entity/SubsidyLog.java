package com.hgkj.model.entity;

import java.math.BigDecimal;

public class SubsidyLog {
    private int sublogId;
    private BigDecimal subsidyMoney;
    private String sublogTime;
    private Staffinfo staffinfo;
    private Subsidy subsidy;
/*员工信息表*/
    public Staffinfo getStaffinfo() {
        return staffinfo;
    }

    public void setStaffinfo(Staffinfo staffinfo) {
        this.staffinfo = staffinfo;
    }
/*补贴表*/
    public Subsidy getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(Subsidy subsidy) {
        this.subsidy = subsidy;
    }

    public int getSublogId() {
        return sublogId;
    }

    public void setSublogId(int sublogId) {
        this.sublogId = sublogId;
    }

    public BigDecimal getSubsidyMoney() {
        return subsidyMoney;
    }

    public void setSubsidyMoney(BigDecimal subsidyMoney) {
        this.subsidyMoney = subsidyMoney;
    }

    public String getSublogTime() {
        return sublogTime;
    }

    public void setSublogTime(String sublogTime) {
        this.sublogTime = sublogTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubsidyLog that = (SubsidyLog) o;

        if (sublogId != that.sublogId) return false;
        if (subsidyMoney != null ? !subsidyMoney.equals(that.subsidyMoney) : that.subsidyMoney != null) return false;
        if (sublogTime != null ? !sublogTime.equals(that.sublogTime) : that.sublogTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sublogId;
        result = 31 * result + (subsidyMoney != null ? subsidyMoney.hashCode() : 0);
        result = 31 * result + (sublogTime != null ? sublogTime.hashCode() : 0);
        return result;
    }
}
