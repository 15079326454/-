package com.hgkj.model.entity;

import java.math.BigDecimal;

public class RewardLog {
    private int rewlogId;
    private BigDecimal rewPrice;
    private String rewlogTime;
/*员工信息表*/
    private Staffinfo staffinfo;
    /*获奖表*/
    private Reward reward;

    public Staffinfo getStaffinfo() {
        return staffinfo;
    }

    public void setStaffinfo(Staffinfo staffinfo) {
        this.staffinfo = staffinfo;
    }

    public Reward getReward() {
        return reward;
    }

    public void setReward(Reward reward) {
        this.reward = reward;
    }

    public int getRewlogId() {
        return rewlogId;
    }

    public void setRewlogId(int rewlogId) {
        this.rewlogId = rewlogId;
    }

    public BigDecimal getRewPrice() {
        return rewPrice;
    }

    public void setRewPrice(BigDecimal rewPrice) {
        this.rewPrice = rewPrice;
    }

    public String getRewlogTime() {
        return rewlogTime;
    }

    public void setRewlogTime(String rewlogTime) {
        this.rewlogTime = rewlogTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RewardLog rewardLog = (RewardLog) o;

        if (rewlogId != rewardLog.rewlogId) return false;
        if (rewPrice != null ? !rewPrice.equals(rewardLog.rewPrice) : rewardLog.rewPrice != null) return false;
        if (rewlogTime != null ? !rewlogTime.equals(rewardLog.rewlogTime) : rewardLog.rewlogTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rewlogId;
        result = 31 * result + (rewPrice != null ? rewPrice.hashCode() : 0);
        result = 31 * result + (rewlogTime != null ? rewlogTime.hashCode() : 0);
        return result;
    }
}
