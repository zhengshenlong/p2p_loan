package com.p2p.dao;

import com.p2p.bean.Borrow;
import com.p2p.bean.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface LoanDao extends JpaRepository<Loan,Integer>, JpaSpecificationExecutor<Loan> {

    //根据修改状态
    List<Loan> findByStatusIs(Integer status);

    //根据审核id查询
    Loan findByBorrowSignId(Integer id);
}
