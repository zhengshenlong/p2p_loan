package com.p2p.dao;

import com.p2p.bean.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LoanAuditDao extends JpaRepository<Borrow,Integer>, JpaSpecificationExecutor<Borrow> {

}
