package com.hgkj.model.entity;

public class AttendanceLog {
    private int attlogId;
    private int attlogCount;
    private String attlogTime;

    /*员工信息表*/
private Staffinfo staffinfo;
/*考勤表*/
private Attendance attendance;

    public Staffinfo getStaffinfo() {
        return staffinfo;
    }

    public void setStaffinfo(Staffinfo staffinfo) {
        this.staffinfo = staffinfo;
    }

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    public int getAttlogId() {
        return attlogId;
    }

    public void setAttlogId(int attlogId) {
        this.attlogId = attlogId;
    }

    public int getAttlogCount() {
        return attlogCount;
    }

    public void setAttlogCount(int attlogCount) {
        this.attlogCount = attlogCount;
    }

    public String getAttlogTime() {
        return attlogTime;
    }

    public void setAttlogTime(String attlogTime) {
        this.attlogTime = attlogTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttendanceLog that = (AttendanceLog) o;

        if (attlogId != that.attlogId) return false;
        if (attlogCount != that.attlogCount) return false;
        if (attlogTime != null ? !attlogTime.equals(that.attlogTime) : that.attlogTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = attlogId;
        result = 31 * result + attlogCount;
        result = 31 * result + (attlogTime != null ? attlogTime.hashCode() : 0);
        return result;
    }
}
