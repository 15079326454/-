package com.hgkj.model.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Reward {
    private int rewId;
    private String rewName;
    private BigDecimal rewPrice;
/*获奖记录表*/
private Set<RewardLog> rewardLogs=new HashSet <>();

    public Set <RewardLog> getRewardLogs() {
        return rewardLogs;
    }

    public void setRewardLogs(Set <RewardLog> rewardLogs) {
        this.rewardLogs = rewardLogs;
    }

    public int getRewId() {
        return rewId;
    }

    public void setRewId(int rewId) {
        this.rewId = rewId;
    }

    public String getRewName() {
        return rewName;
    }

    public void setRewName(String rewName) {
        this.rewName = rewName;
    }

    public BigDecimal getRewPrice() {
        return rewPrice;
    }

    public void setRewPrice(BigDecimal rewPrice) {
        this.rewPrice = rewPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reward reward = (Reward) o;

        if (rewId != reward.rewId) return false;
        if (rewName != null ? !rewName.equals(reward.rewName) : reward.rewName != null) return false;
        if (rewPrice != null ? !rewPrice.equals(reward.rewPrice) : reward.rewPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rewId;
        result = 31 * result + (rewName != null ? rewName.hashCode() : 0);
        result = 31 * result + (rewPrice != null ? rewPrice.hashCode() : 0);
        return result;
    }
}
