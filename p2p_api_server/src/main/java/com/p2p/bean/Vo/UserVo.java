package com.p2p.bean.Vo;

import java.io.Serializable;

public class UserVo implements Serializable {

    private String userUsername; //用户名
    private String  userPassword; //密码
    private String  rePassword;//再次输入密码

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getRePassword() {
        return rePassword;
    }
}
