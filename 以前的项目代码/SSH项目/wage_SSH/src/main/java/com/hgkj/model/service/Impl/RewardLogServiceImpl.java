package com.hgkj.model.service.Impl;

import com.hgkj.model.dao.RewatdLogDao;
import com.hgkj.model.entity.RewardLog;
import com.hgkj.model.service.RewardLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RewardLogServiceImpl implements RewardLogService {
    @Autowired
    private RewatdLogDao rewatdLogDao;

    public void setRewatdLogDao(RewatdLogDao rewatdLogDao) {
        this.rewatdLogDao = rewatdLogDao;
    }

    @Override
    public List <RewardLog> rewLogLikeService(RewardLog rewardLog) {
        return rewatdLogDao.rewLogLikeDao(rewardLog);
    }

    @Override
    public List<RewardLog> allRewardLService() {
        return rewatdLogDao.allRewardLDao();
    }

    @Override
    public boolean addRewardLService(RewardLog rewardLog) {
        return rewatdLogDao.addRewardLDao(rewardLog);
    }

    @Override
    public boolean delRewardLService(int rewlogId) {
        return rewatdLogDao.delRewardLDao(rewlogId);
    }

    @Override
    public boolean upRewardLService(RewardLog rewardLog) {
        return rewatdLogDao.upRewardLDao(rewardLog);
    }

    @Override
    public RewardLog rewardLByIdService(int rewlogId) {
        return rewatdLogDao.rewardLByIdDao(rewlogId);
    }
}
