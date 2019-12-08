package com.p2p.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private Integer  id;//主键
    private String userUsername;//用户名
    private String userPassword;//用户密码
    private String userPhone;//用户手机号
    private String userMicroblog;//微博
    private String userPresenter;//推荐人/备注/会员名
    private String userVip;//会员种类(普通会员:0/企业会员:1)
    private String userStatus;//用户状态(可登录:0/不可登录:1)
    private String userEmail;//用户邮箱
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date userRegTime;//注册时间
    private String userAddress;//用户地址


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userUsername='" + userUsername + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userMicroblog='" + userMicroblog + '\'' +
                ", userPresenter='" + userPresenter + '\'' +
                ", userVip='" + userVip + '\'' +
                ", userStatus='" + userStatus + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userRegTime=" + userRegTime +
                ", userAddress='" + userAddress + '\'' +
                '}';
    }

    public User(String userUsername, String userPassword, String userPhone, String userMicroblog, String userPresenter, String userVip, String userStatus, String userEmail, Date userRegTime, String userAddress) {
        this.userUsername = userUsername;
        this.userPassword = userPassword;
        this.userPhone = userPhone;
        this.userMicroblog = userMicroblog;
        this.userPresenter = userPresenter;
        this.userVip = userVip;
        this.userStatus = userStatus;
        this.userEmail = userEmail;
        this.userRegTime = userRegTime;
        this.userAddress = userAddress;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public void setUserMicroblog(String userMicroblog) {
        this.userMicroblog = userMicroblog;
    }

    public void setUserPresenter(String userPresenter) {
        this.userPresenter = userPresenter;
    }

    public void setUserVip(String userVip) {
        this.userVip = userVip;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserRegTime(Date userRegTime) {
        this.userRegTime = userRegTime;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Integer getId() {
        return id;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public String getUserMicroblog() {
        return userMicroblog;
    }

    public String getUserPresenter() {
        return userPresenter;
    }

    public String getUserVip() {
        return userVip;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public Date getUserRegTime() {
        return userRegTime;
    }

    public String getUserAddress() {
        return userAddress;
    }
}
