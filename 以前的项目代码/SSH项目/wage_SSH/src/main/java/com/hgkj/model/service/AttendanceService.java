package com.hgkj.model.service;

import com.hgkj.model.entity.Attendance;

import java.util.List;

public interface AttendanceService {
    public List<Attendance> allAttendService(Attendance attendance);
    public boolean addAttendService(Attendance attendance);
    public boolean deletAttendService(int attId);
    public boolean updateAttendService(Attendance attendance);
    public Attendance AttendByIdService(int attId );
}
