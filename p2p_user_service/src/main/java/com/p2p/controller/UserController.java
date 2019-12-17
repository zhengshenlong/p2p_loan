package com.p2p.controller;

import com.p2p.bean.User;
import com.p2p.bean.Vo.UserVo;
import com.p2p.bean.service.RedisServiceImpl;
import com.p2p.bean.utils.CookieUtil;
import com.p2p.bean.utils.Md5Util;
import com.p2p.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@CrossOrigin(allowCredentials = "true")
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private RedisServiceImpl redisService;

    @Autowired
    private UserService userService;



    @GetMapping("login")
    public Object login(@RequestParam(name = "username")String userUsername , @RequestParam(name = "password")String userPassword,
                         HttpServletRequest request, HttpServletResponse response){
        Map<Object, Object> map = new HashMap<>();
        User user = userService.findByUserUsername(userUsername);
         map.put("user",user);
        //判断用户名是否正确
        if(user == null){
            //用户名错误
            return false;
        }
        //判断密码是否正确
        if(!user.getUserPassword().equals(Md5Util.md5(userPassword))){
            //密码登录失败
            return false;
        }
        //密码正确,存入redis中
        //① 生成UUID作为token
        String token = UUID.randomUUID().toString();
        //② 将token -->userJosn 存入redis中
        redisService.set(token,user, CookieUtil.SESSION_EXPIRE_SECONDS);
        //将数据存入cookie中
        Cookie cookie = new Cookie(CookieUtil.COOKIE_NAME_TOKEN,token);
        cookie.setMaxAge(CookieUtil.SESSION_EXPIRE_SECONDS);//cookie过期时间
        cookie.setDomain("p2p.com");//可以利用request获取域名进行处理得到一级域名
        cookie.setPath("/");//对于所有的请求都可以携带cookie
        response.addCookie(cookie);
        Cookie[] cookies = request.getCookies();
        if(cookies!=null){
            for (Cookie c:   cookies) {
                if(c.getName().equals("user_token")){
                    System.out.println("找到啦");
                    break;
                }
            }
        }
        return map;
    }

      @PostMapping("save")
    public boolean zhu(@RequestBody UserVo userVo){
             if(userVo.getUserUsername()!=null){
                 //判断如果用户名为空 就 提示
                 System.out.println("用户名不能为空");
             }
             if(!userVo.getUserPassword().equals(userVo.getRePassword())){
                 //判断密码 两次输入的是否一致若不一致 提示
                 System.out.println("两次输入的密码不一致,请重新输入");
             }
             //创建一个user对象
          User user = new User();
             //进user对象中的userPassword密码加密
          user.setUserPassword(Md5Util.md5(userVo.getUserPassword()));
          user.setUserUsername(userVo.getUserUsername());
          //添加到数据库中
         return userService.save(user);
      }
}
