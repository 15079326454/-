package com.zxdc.model.entity;

public class User {
    private Integer userid;

    private String useremail;

    private String userfristname;

    private String userlastname;

    private String userpwd;

    private String usertel;

    private String useraddress;

    public User() {
    }

    public User(String useremail, String userfristname, String userpwd, String usertel, String useraddress) {
        this.useremail = useremail;
        this.userfristname = userfristname;
        this.userpwd = userpwd;
        this.usertel = usertel;
        this.useraddress = useraddress;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public String getUserfristname() {
        return userfristname;
    }

    public void setUserfristname(String userfristname) {
        this.userfristname = userfristname == null ? null : userfristname.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", useremail='" + useremail + '\'' +
                ", userfristname='" + userfristname + '\'' +
                ", userlastname='" + userlastname + '\'' +
                ", userpwd='" + userpwd + '\'' +
                ", usertel=" + usertel +
                ", useraddress='" + useraddress + '\'' +
                '}';
    }

    public String getUserlastname() {
        return userlastname;
    }

    public void setUserlastname(String userlastname) {
        this.userlastname = userlastname == null ? null : userlastname.trim();
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }
}