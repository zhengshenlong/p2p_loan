package com.p2p.service;


import com.p2p.bean.Account;
import com.p2p.bean.User;
import com.p2p.bean.utils.CookieUtil;
import com.p2p.bean.utils.Md5Util;
import com.p2p.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.UUID;

@Service
@Transactional
public class UserServiceImpl implements  UserService{


    @Autowired
    private UserDao userDao;

    @Override
    public User findByUserUsername(String userUsername) {
        User user = userDao.findByUserUsername(userUsername);
        return user;
    }

    @Override
    public boolean save(User user) {
          //添加用的数据
        try {
            userDao.save(user);
            /*
            * 添加用户的同时也会添加账户表
            * new 一个账户表
            * */
            Account account = new Account(user.getId(),new BigDecimal(0),new BigDecimal(0),new BigDecimal(0)
                    ,new BigDecimal(0),new BigDecimal(0),new BigDecimal(0),new BigDecimal(0),"123456");
           //同时吧数据初始值为0
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }


}
