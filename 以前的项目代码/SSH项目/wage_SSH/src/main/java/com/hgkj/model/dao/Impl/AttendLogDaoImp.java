package com.hgkj.model.dao.Impl;

import com.hgkj.model.dao.AttendanceLogDao;
import com.hgkj.model.entity.AttendanceLog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class AttendLogDaoImp implements AttendanceLogDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    @Override
    public List<AttendanceLog> allAttdenceLDao(AttendanceLog attendanceLog) {
        Query query=getSession().createQuery("from AttendanceLog ");
        return query.list();
    }

    @Override
    public boolean addAttdenceLDao(AttendanceLog attendanceLog) {
        getSession().save(attendanceLog);
        return false;
    }

    @Override
    public boolean delAttdenceLDao(int attlogId) {
        AttendanceLog attendanceLog=new AttendanceLog();
        attendanceLog.setAttlogId(attlogId);
        getSession().delete(attendanceLog);
        return false;
    }

    @Override
    public boolean upAttdenceLDao(AttendanceLog attendanceLog) {
        getSession().update(attendanceLog);
        return false;
    }

    @Override
    public AttendanceLog attdenceLByIdDao(int attlogId) {
        AttendanceLog attendanceLog=getSession().get(AttendanceLog.class,attlogId);
        return attendanceLog;
    }
}
