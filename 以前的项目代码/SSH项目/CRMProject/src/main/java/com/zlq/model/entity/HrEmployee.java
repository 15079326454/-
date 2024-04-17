package com.zlq.model.entity;

import javax.persistence.*;
import java.sql.Date;

public class HrEmployee {
    private int id;
    private String uid;
    private String pwd;
    private String name;
    private String idcard;
    private Date birthday;
    private String email;
    private String sex;
    private String telephone;
    private String status;
    private Integer sort;
    private Date entrydate;
    private String address;
    private String remarks;
    private String education;
    private String professional;
    private String schools;
    private String title;
    private Integer isdelete;
    private Date deleteTime;
    private String portal;
    private String theme;
    private Integer canlogin;
    private String layout;
    private Date loginoutdate;
    private Integer ispost;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "uid", nullable = true, length = 50)
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "pwd", nullable = true, length = 50)
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "idcard", nullable = true, length = 50)
    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    @Basic
    @Column(name = "birthday", nullable = true)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "sex", nullable = true, length = 50)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "telephone", nullable = true, length = 50)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 50)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "sort", nullable = true)
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "entrydate", nullable = true)
    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "remarks", nullable = true, length = 255)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "education", nullable = true, length = 50)
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Basic
    @Column(name = "professional", nullable = true, length = 50)
    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    @Basic
    @Column(name = "schools", nullable = true, length = 50)
    public String getSchools() {
        return schools;
    }

    public void setSchools(String schools) {
        this.schools = schools;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 50)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "isdelete", nullable = true)
    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    @Basic
    @Column(name = "delete_time", nullable = true)
    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Basic
    @Column(name = "portal", nullable = true, length = 250)
    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    @Basic
    @Column(name = "theme", nullable = true, length = 250)
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Basic
    @Column(name = "canlogin", nullable = true)
    public Integer getCanlogin() {
        return canlogin;
    }

    public void setCanlogin(Integer canlogin) {
        this.canlogin = canlogin;
    }

    @Basic
    @Column(name = "layout", nullable = true, length = 255)
    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    @Basic
    @Column(name = "loginoutdate", nullable = true)
    public Date getLoginoutdate() {
        return loginoutdate;
    }

    public void setLoginoutdate(Date loginoutdate) {
        this.loginoutdate = loginoutdate;
    }

    @Basic
    @Column(name = "ispost", nullable = true)
    public Integer getIspost() {
        return ispost;
    }

    public void setIspost(Integer ispost) {
        this.ispost = ispost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass ( ) != o.getClass ( )) return false;

        HrEmployee that = (HrEmployee) o;

        if (id != that.id) return false;
        if (uid != null ? !uid.equals (that.uid) : that.uid != null) return false;
        if (pwd != null ? !pwd.equals (that.pwd) : that.pwd != null) return false;
        if (name != null ? !name.equals (that.name) : that.name != null) return false;
        if (idcard != null ? !idcard.equals (that.idcard) : that.idcard != null) return false;
        if (birthday != null ? !birthday.equals (that.birthday) : that.birthday != null) return false;
        if (email != null ? !email.equals (that.email) : that.email != null) return false;
        if (sex != null ? !sex.equals (that.sex) : that.sex != null) return false;
        if (telephone != null ? !telephone.equals (that.telephone) : that.telephone != null) return false;
        if (status != null ? !status.equals (that.status) : that.status != null) return false;
        if (sort != null ? !sort.equals (that.sort) : that.sort != null) return false;
        if (entrydate != null ? !entrydate.equals (that.entrydate) : that.entrydate != null) return false;
        if (address != null ? !address.equals (that.address) : that.address != null) return false;
        if (remarks != null ? !remarks.equals (that.remarks) : that.remarks != null) return false;
        if (education != null ? !education.equals (that.education) : that.education != null) return false;
        if (professional != null ? !professional.equals (that.professional) : that.professional != null) return false;
        if (schools != null ? !schools.equals (that.schools) : that.schools != null) return false;
        if (title != null ? !title.equals (that.title) : that.title != null) return false;
        if (isdelete != null ? !isdelete.equals (that.isdelete) : that.isdelete != null) return false;
        if (deleteTime != null ? !deleteTime.equals (that.deleteTime) : that.deleteTime != null) return false;
        if (portal != null ? !portal.equals (that.portal) : that.portal != null) return false;
        if (theme != null ? !theme.equals (that.theme) : that.theme != null) return false;
        if (canlogin != null ? !canlogin.equals (that.canlogin) : that.canlogin != null) return false;
        if (layout != null ? !layout.equals (that.layout) : that.layout != null) return false;
        if (loginoutdate != null ? !loginoutdate.equals (that.loginoutdate) : that.loginoutdate != null) return false;
        if (ispost != null ? !ispost.equals (that.ispost) : that.ispost != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (uid != null ? uid.hashCode ( ) : 0);
        result = 31 * result + (pwd != null ? pwd.hashCode ( ) : 0);
        result = 31 * result + (name != null ? name.hashCode ( ) : 0);
        result = 31 * result + (idcard != null ? idcard.hashCode ( ) : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode ( ) : 0);
        result = 31 * result + (email != null ? email.hashCode ( ) : 0);
        result = 31 * result + (sex != null ? sex.hashCode ( ) : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode ( ) : 0);
        result = 31 * result + (status != null ? status.hashCode ( ) : 0);
        result = 31 * result + (sort != null ? sort.hashCode ( ) : 0);
        result = 31 * result + (entrydate != null ? entrydate.hashCode ( ) : 0);
        result = 31 * result + (address != null ? address.hashCode ( ) : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode ( ) : 0);
        result = 31 * result + (education != null ? education.hashCode ( ) : 0);
        result = 31 * result + (professional != null ? professional.hashCode ( ) : 0);
        result = 31 * result + (schools != null ? schools.hashCode ( ) : 0);
        result = 31 * result + (title != null ? title.hashCode ( ) : 0);
        result = 31 * result + (isdelete != null ? isdelete.hashCode ( ) : 0);
        result = 31 * result + (deleteTime != null ? deleteTime.hashCode ( ) : 0);
        result = 31 * result + (portal != null ? portal.hashCode ( ) : 0);
        result = 31 * result + (theme != null ? theme.hashCode ( ) : 0);
        result = 31 * result + (canlogin != null ? canlogin.hashCode ( ) : 0);
        result = 31 * result + (layout != null ? layout.hashCode ( ) : 0);
        result = 31 * result + (loginoutdate != null ? loginoutdate.hashCode ( ) : 0);
        result = 31 * result + (ispost != null ? ispost.hashCode ( ) : 0);
        return result;
    }
}
