package com.hgkj.model.dao.Impl;

import com.hgkj.model.dao.RewatdLogDao;
import com.hgkj.model.entity.RewardLog;
import com.hgkj.model.entity.Staffinfo;
import com.hgkj.model.entity.SubsidyLog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Repository
@Transactional
public class RewatdLogDaoImpl implements RewatdLogDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List <RewardLog> rewLogLikeDao(RewardLog rewardLog) {
        List<Staffinfo> staffinfos=getSession().createQuery("from Staffinfo where staffName like :name ").setParameter("name","%"+rewardLog.getStaffinfo().getStaffName()+"%").list();
        List<RewardLog> rewardLogList=new ArrayList <>();
        for (Staffinfo staffinfo:staffinfos){
            Set<RewardLog> rewardLogSet=staffinfo.getRewardLogSet();
            for (RewardLog rewardLog1:rewardLogSet){
                rewardLogList.add(rewardLog1);
            }
        }
        return rewardLogList;
    }
    @Override
    public List<RewardLog> allRewardLDao() {
        Query query=getSession().createQuery("from RewardLog ");
        return query.list();
    }

    @Override
    public boolean addRewardLDao(RewardLog rewardLog) {
        getSession().save(rewardLog);
        return false;
    }

    @Override
    public boolean delRewardLDao(int rewlogId) {
        RewardLog rewardLog=new RewardLog();
        rewardLog.setRewlogId(rewlogId);
        getSession().delete(rewardLog);
        return false;
    }

    @Override
    public boolean upRewardLDao(RewardLog rewardLog) {
        getSession().update(rewardLog);
        return false;
    }

    @Override
    public RewardLog rewardLByIdDao(int rewlogId) {
        RewardLog rewardLog=getSession().get(RewardLog.class,rewlogId);
        return rewardLog;
    }
}
