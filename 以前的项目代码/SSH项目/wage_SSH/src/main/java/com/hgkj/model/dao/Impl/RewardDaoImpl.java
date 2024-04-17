package com.hgkj.model.dao.Impl;

import com.hgkj.model.dao.RewardDao;
import com.hgkj.model.entity.Reward;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class RewardDaoImpl implements RewardDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    @Override
    public List<Reward> allRewardDao(Reward reward) {
        Query query=getSession().createQuery("from Reward ");
        return query.list();

    }

    @Override
    public boolean addRewardDao(Reward reward) {
        getSession().save(reward);
        return false;
    }

    @Override
    public boolean deletRewardDao(int rewId) {
        Reward reward=new Reward();
        reward.setRewId(rewId);
        getSession().delete(reward);
        return false;
    }

    @Override
    public boolean updateRewardDao(Reward reward) {
        getSession().update(reward);
        return false;
    }

    @Override
    public Reward rewardByIdDao(int rewId) {
        Reward reward=getSession().get(Reward.class,rewId);
        return reward;
    }
}
