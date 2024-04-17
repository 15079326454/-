package com.hgkj.model.service.Impl;

import com.hgkj.model.dao.RewardDao;
import com.hgkj.model.entity.Reward;
import com.hgkj.model.entity.Staffinfo;
import com.hgkj.model.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RewardServiceImpl implements RewardService {
    @Autowired
    private RewardDao rewardDao;

    public void setRewardDao(RewardDao rewardDao) {
        this.rewardDao = rewardDao;
    }

    public RewardDao getRewardDao() {
        return rewardDao;
    }

    @Override
    public List<Reward> allRewardService(Reward reward) {
        return rewardDao.allRewardDao(reward);
    }

    @Override
    public boolean addRewardService(Reward reward) {
        return rewardDao.addRewardDao(reward);
    }

    @Override
    public boolean deletRewardService(int rewId) {
        return rewardDao.deletRewardDao(rewId);
    }

    @Override
    public boolean updateRewardService(Reward reward) {
        return rewardDao.updateRewardDao(reward);
    }

    @Override
    public Reward rewardByIdService(int rewId) {
        return rewardDao.rewardByIdDao(rewId);
    }
}
