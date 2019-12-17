package com.p2p.service;

import com.p2p.bean.Borrow;
import com.p2p.bean.Loan;
import com.p2p.bean.Vo.LoanVo;
import org.springframework.data.domain.Page;

import java.math.BigDecimal;
import java.util.List;

public interface LoanService {

    //列表展示借款项目
    Page<Loan> selectAll(LoanVo loanVo);

    //添加借款功能
    boolean save(Loan loan);

    //根据转态查询数据
    List<Loan> findByStatusIs(Integer status);

    //审核
    boolean updateStatus(Borrow borrow);

    //根据借款编号进行数据查询
    Loan getLoanById(Integer borrowSignId);

}
