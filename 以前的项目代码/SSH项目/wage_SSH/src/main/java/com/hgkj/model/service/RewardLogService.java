package com.hgkj.model.service;

import com.hgkj.model.entity.RewardLog;

import java.util.List;

public interface RewardLogService{
        public List<RewardLog> rewLogLikeService(RewardLog rewardLog);
        public List<RewardLog> allRewardLService();
        public boolean addRewardLService(RewardLog rewardLog);
        public boolean delRewardLService(int rewlogId);
        public boolean upRewardLService(RewardLog rewardLog);
        public RewardLog rewardLByIdService(int rewlogId);

}
