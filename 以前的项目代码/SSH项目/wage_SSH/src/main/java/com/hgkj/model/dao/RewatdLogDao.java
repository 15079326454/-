package com.hgkj.model.dao;

import com.hgkj.model.entity.RewardLog;
import com.hgkj.model.entity.SubsidyLog;

import java.util.List;

public interface RewatdLogDao {
    public List<RewardLog> rewLogLikeDao(RewardLog rewardLog);
    public List<RewardLog> allRewardLDao();
    public boolean addRewardLDao(RewardLog rewardLog);
    public boolean delRewardLDao(int rewlogId);
    public boolean upRewardLDao(RewardLog rewardLog);
    public RewardLog rewardLByIdDao(int rewlogId);

}
