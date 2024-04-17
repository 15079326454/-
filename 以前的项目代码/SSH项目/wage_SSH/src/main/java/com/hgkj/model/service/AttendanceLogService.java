package com.hgkj.model.service;

import com.hgkj.model.entity.AttendanceLog;

import java.util.List;

public interface AttendanceLogService {
    public List<AttendanceLog> allAttdenceLService(AttendanceLog attendanceLog);
    public boolean addAttdenceLService(AttendanceLog attendanceLog);
    public boolean delAttdenceLService(int attlogId);
    public boolean upAttdenceLService(AttendanceLog attendanceLog);
    public AttendanceLog attdenceLByIdService(int attlogId);
}
