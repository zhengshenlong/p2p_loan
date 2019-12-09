package com.p2p.service;


import com.p2p.bean.User;
import org.apache.ibatis.annotations.Param;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserService {

     //登录的方法
     User findByUserUsername(String userUsername);

     //注册
     boolean save(User user);
}
