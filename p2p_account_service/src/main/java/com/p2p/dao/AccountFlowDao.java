package com.p2p.dao;

import com.p2p.bean.AccountFlow;
import org.springframework.data.jpa.repository.JpaRepository;

//动账记录
public interface AccountFlowDao extends JpaRepository<AccountFlow,Integer> {
}
