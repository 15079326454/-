package com.hgkj.model.dao;

import com.hgkj.model.entity.Attendance;

import java.util.List;

public interface AttendanceDao {
    public List<Attendance> allAttendDao(Attendance attendance);
    public boolean addAttendDao(Attendance attendance);
    public boolean deletAttendDao(int attId);
    public boolean updateAttendDao(Attendance attendance);
    public Attendance AttendByIdDao(int attId );
}
