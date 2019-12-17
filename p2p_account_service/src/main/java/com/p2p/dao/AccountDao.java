package com.p2p.dao;

import com.p2p.bean.Account;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountDao extends JpaRepository<Account,Integer> {

}
