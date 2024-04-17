package com.hgkj.model.dao.Impl;

import com.hgkj.model.dao.AttendanceDao;
import com.hgkj.model.entity.Attendance;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class AttendanceDaoImp implements AttendanceDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    @Override
    public List<Attendance> allAttendDao(Attendance attendance) {
        Query query=getSession().createQuery("from Attendance ");
        return query.list();
    }

    @Override
    public boolean addAttendDao(Attendance attendance) {
        getSession().save(attendance);
        return false;
    }

    @Override
    public boolean deletAttendDao(int attId) {
        Attendance attendance=new Attendance();
        attendance.setAttId(attId);
        getSession().delete(attendance);
        return false;
    }

    @Override
    public boolean updateAttendDao(Attendance attendance) {
        getSession().update(attendance);
        return false;
    }

    @Override
    public Attendance AttendByIdDao(int attId) {
        Attendance attendance=getSession().get(Attendance.class,attId);
        return attendance;
    }
}
