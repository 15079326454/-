package com.hgkj.model.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Attendance {
    private int attId;
    private String attName;
    private String attPercen;
/*考勤记录表*/
    private Set<AttendanceLog> attendanceLogs=new HashSet <>();

    public Set <AttendanceLog> getAttendanceLogs() {
        return attendanceLogs;
    }

    public void setAttendanceLogs(Set <AttendanceLog> attendanceLogs) {
        this.attendanceLogs = attendanceLogs;
    }

    public int getAttId() {
        return attId;
    }

    public void setAttId(int attId) {
        this.attId = attId;
    }

    public String getAttName() {
        return attName;
    }

    public void setAttName(String attName) {
        this.attName = attName;
    }

    public String getAttPercen() {
        return attPercen;
    }

    public void setAttPercen(String attPercen) {
        this.attPercen = attPercen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Attendance that = (Attendance) o;

        if (attId != that.attId) return false;
        if (attName != null ? !attName.equals(that.attName) : that.attName != null) return false;
        if (attPercen != null ? !attPercen.equals(that.attPercen) : that.attPercen != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = attId;
        result = 31 * result + (attName != null ? attName.hashCode() : 0);
        result = 31 * result + (attPercen != null ? attPercen.hashCode() : 0);
        return result;
    }
}
