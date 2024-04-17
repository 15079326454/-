package com.hgkj.modal.entity;

public class Users {
    private int userID;
    private  String userEmail;
    private  String userFirstName;
    private  String  userLastName;
    private  String  userPwd;
    private  int userTel;
    private String userAddress;


    public Users(){}

    public Users(String userEmail, String userPwd) {

        this.userEmail = userEmail;
        this.userPwd = userPwd;

    }

    public Users( String userFirstName, String userLastName,String userEmail,String userPwd) {

        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userPwd = userPwd;
        this.userEmail = userEmail;
    }

    public Users(String userFirstName, String userLastName, String userEmail, String userPwd, int userTel, String userAddress) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userPwd = userPwd;
        this.userTel = userTel;
        this.userAddress = userAddress;
        this.userEmail = userEmail;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public int getUserTel() {
        return userTel;
    }

    public void setUserTel(int userTel) {
        this.userTel = userTel;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "Users{" + "userEmail='" + userEmail + '\'' + ", userPwd='" + userPwd + '\'' + '}';
    }
}
