package com.hgkj.model.dao;

import com.hgkj.model.entity.Reward;

import java.util.List;

public interface RewardDao {
    public List<Reward> allRewardDao(Reward reward);
    public boolean addRewardDao(Reward reward);
    public boolean deletRewardDao(int rewId);
    public boolean updateRewardDao(Reward reward);
    public Reward rewardByIdDao(int rewId);
}
