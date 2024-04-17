package com.hgkj.model.dao.Impl;

import com.hgkj.model.dao.SubsidyDao;
import com.hgkj.model.dao.SubsidyLogDao;
import com.hgkj.model.entity.Staffinfo;
import com.hgkj.model.entity.Subsidy;
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
public class SubsidyLogDaoImpl implements SubsidyLogDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List <SubsidyLog> subLogLikeDao(SubsidyLog subsidyLog) {
        List<Staffinfo> staffinfos=getSession().createQuery("from Staffinfo where staffName like :name ").setParameter("name","%"+subsidyLog.getStaffinfo().getStaffName()+"%").list();
        List<SubsidyLog> subsidyLogList=new ArrayList <>();
        for (Staffinfo staffinfo:staffinfos){
            Set<SubsidyLog> subsidyLogSet=staffinfo.getSubsidyLogSet();
            for (SubsidyLog subsidyLog1:subsidyLogSet){
                subsidyLogList.add(subsidyLog1);
            }
        }
        return subsidyLogList;
    }

    @Override
    public List <SubsidyLog> allSubLogDao(SubsidyLog subsidyLog) {
        Query query=getSession().createQuery("from SubsidyLog ");
        return query.list();
    }

    @Override
    public boolean addSubLogDao(SubsidyLog subsidyLog) {
        getSession().save(subsidyLog);
        return false;
    }

    @Override
    public boolean delSubLogDao(int sublogId) {
        SubsidyLog subsidyLog=new SubsidyLog();
        subsidyLog.setSublogId(sublogId);
        getSession().delete(subsidyLog);
        return false;
    }

    @Override
    public boolean updSubLogDao(SubsidyLog subsidyLog) {
        getSession().update(subsidyLog);
        return false;
    }

    @Override
    public SubsidyLog subLogByIdDao(int sublogId) {
        SubsidyLog subsidyLog=getSession().get(SubsidyLog.class,sublogId);
        return subsidyLog;
    }
}
