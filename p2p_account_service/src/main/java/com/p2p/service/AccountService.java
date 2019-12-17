package com.p2p.service;

import com.p2p.bean.Account;

import java.util.Optional;

//账户service业务层
public interface AccountService {

    //添加账户
    void addAccount(Account account);

    //查询用户的账户
    Account  selectAccount(Integer id);
}
