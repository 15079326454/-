package com.hgkj.model.service;

import com.hgkj.model.entity.Reward;
import com.hgkj.model.entity.Staffinfo;

import java.util.List;

public interface RewardService {
    public List<Reward> allRewardService(Reward reward);
    public boolean addRewardService(Reward reward);
    public boolean deletRewardService(int rewId);
    public boolean updateRewardService(Reward reward);
    public Reward rewardByIdService(int rewId);
}
