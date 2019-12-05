package com.p2p.controller;

import com.p2p.bean.User;
import com.p2p.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin(allowCredentials = "true")
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;


      @RequestMapping("login")
      @ResponseBody
    public User login(@RequestBody User user
      , HttpServletRequest request, HttpServletResponse response){

          return userService.dologin(user,request,response);
      }
}
