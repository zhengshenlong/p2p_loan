package com.p2p.service;


import com.p2p.bean.User;
import com.p2p.bean.utils.CookieUtil;
import com.p2p.bean.utils.Md5Util;
import com.p2p.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private RedisServiceImpl redisService;

    @Autowired
    private UserDao userDao;

    @Override
    public boolean dologin(String userUsername, String userPassword, HttpServletRequest request, HttpServletResponse response) {

        User user = userDao.findByUserUsername(userUsername);
        if(user==null){
            System.out.println("用户名不存在");
            return  false;
        }
        if(!Md5Util.md5(user.getUserPassword()).equals(user.getUserPassword())){
            System.out.println("用户名密码不正确");
            return false;
        }

        //2若成功执行
        // 生成UUID作为token
        String token = UUID.randomUUID().toString();
        //将token放入到redis中
        redisService.set(token,user, CookieUtil.SESSION_EXPIRE_SECONDS);
        //将USER_ToKEN-->token
        Cookie cookie=new Cookie(CookieUtil.COOKIE_NAME_TOKEN,token);
        cookie.setMaxAge(CookieUtil.SESSION_EXPIRE_SECONDS);
        //使用父包
        cookie.setDomain("com.p2p");
        cookie.setPath("/");

        response.addCookie(cookie);

        return true;
    }


}
