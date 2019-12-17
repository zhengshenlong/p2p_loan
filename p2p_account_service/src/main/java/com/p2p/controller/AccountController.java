package com.p2p.controller;

import com.p2p.bean.Account;
import com.p2p.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@CrossOrigin(allowCredentials = "true")
@RestController
@RequestMapping("/account/")
public class AccountController {


    @Autowired
    private AccountService accountService;


    //添加账户数据
    @PostMapping("addAccount")
    public void addAccount(@RequestBody Account account){
         accountService.addAccount(account);
    }



    //查询我的账户  根据前台传来的数据
    @GetMapping("selectAccount")
    public Account selectAccount(@RequestParam(name = "userId") Integer id){
        return accountService.selectAccount(id);
    }

}
