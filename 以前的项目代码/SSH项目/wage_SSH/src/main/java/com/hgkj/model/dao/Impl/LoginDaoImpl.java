package com.hgkj.model.dao.Impl;

import com.hgkj.model.dao.LoginDao;
import com.hgkj.model.entity.Staffinfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class LoginDaoImpl implements LoginDao {
    @Autowired
private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }


    @Override
    public Staffinfo LoginDao(Staffinfo staffinfo) {
        String hql="from Staffinfo where staffName=? and staffPwd=?";
        staffinfo= (Staffinfo) getSession().createQuery(hql).setParameter(0,staffinfo.getStaffName()).setParameter(1,staffinfo.getStaffPwd()).uniqueResult();
        return staffinfo;
    }

    @Override
    public boolean updateDao(Staffinfo staffinfo) {
        getSession().createQuery("update Staffinfo set staffPwd=:pwd where staffId=:stfId")
                .setParameter("pwd",staffinfo.getStaffPwd()).setParameter("stfId",staffinfo.getStaffId()).executeUpdate();
        return true;
    }

}
