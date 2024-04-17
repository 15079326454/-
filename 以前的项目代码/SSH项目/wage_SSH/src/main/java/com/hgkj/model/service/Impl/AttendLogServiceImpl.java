package com.hgkj.model.service.Impl;

import com.hgkj.model.dao.AttendanceLogDao;
import com.hgkj.model.entity.AttendanceLog;
import com.hgkj.model.service.AttendanceLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AttendLogServiceImpl implements AttendanceLogService {
    @Autowired
    private AttendanceLogDao attendanceLogDao;
    public void setAttendanceLogDao(AttendanceLogDao attendanceLogDao) {
        this.attendanceLogDao = attendanceLogDao;
    }

    @Override
    public List<AttendanceLog> allAttdenceLService(AttendanceLog attendanceLog) {
        return attendanceLogDao.allAttdenceLDao(attendanceLog);
    }

    @Override
    public boolean addAttdenceLService(AttendanceLog attendanceLog) {
        return attendanceLogDao.addAttdenceLDao(attendanceLog);
    }

    @Override
    public boolean delAttdenceLService(int attlogId) {
        return attendanceLogDao.delAttdenceLDao(attlogId);
    }

    @Override
    public boolean upAttdenceLService(AttendanceLog attendanceLog) {
        return attendanceLogDao.upAttdenceLDao(attendanceLog);
    }

    @Override
    public AttendanceLog attdenceLByIdService(int attlogId) {
        return attendanceLogDao.attdenceLByIdDao(attlogId);
    }
}
