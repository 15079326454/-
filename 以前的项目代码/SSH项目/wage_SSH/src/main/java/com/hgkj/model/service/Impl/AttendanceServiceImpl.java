package com.hgkj.model.service.Impl;

import com.hgkj.model.dao.AttendanceDao;
import com.hgkj.model.entity.Attendance;
import com.hgkj.model.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {
    @Autowired
    private AttendanceDao attendanceDao;

    public void setAttendanceDao(AttendanceDao attendanceDao) {
        this.attendanceDao = attendanceDao;
    }

    @Override
    public List<Attendance> allAttendService(Attendance attendance) {
        return attendanceDao.allAttendDao(attendance);
    }

    @Override
    public boolean addAttendService(Attendance attendance) {
        return attendanceDao.addAttendDao(attendance);
    }

    @Override
    public boolean deletAttendService(int attId) {
        return attendanceDao.deletAttendDao(attId);
    }

    @Override
    public boolean updateAttendService(Attendance attendance) {
        return attendanceDao.updateAttendDao(attendance);
    }

    @Override
    public Attendance AttendByIdService(int attId) {
        return attendanceDao.AttendByIdDao(attId);
    }


}
