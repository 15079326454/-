package com.hgkj.model.dao;

import com.hgkj.model.entity.AttendanceLog;

import java.util.List;

public interface AttendanceLogDao {
    public List<AttendanceLog> allAttdenceLDao(AttendanceLog attendanceLog);
    public boolean addAttdenceLDao(AttendanceLog attendanceLog);
    public boolean delAttdenceLDao(int attlogId);
    public boolean upAttdenceLDao(AttendanceLog attendanceLog);
    public AttendanceLog attdenceLByIdDao(int attlogId);
}
