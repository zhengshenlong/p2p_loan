package com.p2p.service;


import com.p2p.bean.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserService {

     public User dologin(User user, HttpServletRequest request, HttpServletResponse response);


}
