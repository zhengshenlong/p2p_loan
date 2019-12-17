package com.p2p.service.impl;

import com.p2p.bean.Account;
import com.p2p.dao.AccountDao;
import com.p2p.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    //添加账户
    @Override
    public void addAccount(Account account) {

            accountDao.save(account);

    }

    //查询用户的账户
    @Override
    public Account selectAccount(Integer id) {
        Optional<Account> byId = accountDao.findById(id);
        if (byId.isPresent()){
         return  byId.get();
        }
        return null;
    }


}
