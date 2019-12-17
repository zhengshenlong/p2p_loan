package com.p2p.controller;

import com.p2p.bean.Borrow;
import com.p2p.bean.Loan;
import com.p2p.bean.Vo.LoanVo;
import com.p2p.bean.utils.CaculatorUtil;
import com.p2p.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(allowCredentials = "true")
@RequestMapping("/loan/")
public class LoanController {

      @Autowired
    private LoanService loanService;

      //列表的展示
      @GetMapping("list")
    public Page<Loan> zhan(LoanVo loanVo){
          return  loanService.selectAll(loanVo);
      }

      @PostMapping("save")
    public boolean save(@RequestBody Loan loan){
          //借款的时候吧当前时间存进去
          loan.setPublishTime(new Date());
          return  loanService.save(loan);
      }


    @GetMapping("getLoanStatus")
    public List<Loan> getLoanStatus(Integer status){
        return loanService.findByStatusIs(status);
    }

    @PostMapping("updateStatus")
    public void updateStatus(@RequestBody  Borrow borrow ){
        loanService.updateStatus(borrow);
    }

    //根据借款标的id进行数据 查询
    @GetMapping("selectLoanById")
    public Loan selectLoanMarkById(Integer borrowSignId){
        return loanService.getLoanById(borrowSignId);
    }

    //根据借款标的id进行数据 查询
    @GetMapping("getLoanById")
    public Map getLoanMarkById(Integer borrowSignId , Integer userId){

        Map<String,Object> map = new HashMap<>();
        Loan loan = loanService.getLoanById(borrowSignId);
        //查询可得总利息
        BigDecimal totalInterest = CaculatorUtil.caculateTotalInterest(loan.getBorrowMoney(),loan.getYearRate(),loan.getReturnMonthes(), loan.getPaymentMethod());
        //计算还需多少钱  保留两位小数
        BigDecimal needMoney = loan.getBorrowMoney().subtract(loan.getAccessMoney());

        //存值
        map.put("loan",loan);
        map.put("totalInterest",totalInterest);
        map.put("needMoney",needMoney);


        return map;
    }

      //添加利息计算
      @GetMapping("interest")
     public BigDecimal interests(Loan loanVo){
          BigDecimal s = CaculatorUtil.caculateTotalInterest(loanVo.getBorrowMoney(), loanVo.getYearRate(),
                  loanVo.getPaymentMethod(), loanVo.getReturnMonthes());
            return s;
      }
}
