package com.p2p.bean;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ReturnPlan implements Serializable {

       private Integer  id;//编号
       private Integer borrowId;//借款标id
       private String loanName;//贷款名称
       private String phase;//第几期
       private Integer returnUserId;//还款人id
       private BigDecimal returnMoney;//还款本息
       private BigDecimal returnPrincipal;//还款本金
       private BigDecimal returnInterest;//还款利息
    @DateTimeFormat(pattern = "yyyy-MM-dd")
       private Date returnDeadline;//还款截止日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
       private Date returnTime;//还款时间
       private String returnStatus;//还款状态

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBorrowId(Integer borrowId) {
        this.borrowId = borrowId;
    }

    public void setLoanName(String loanName) {
        this.loanName = loanName;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public void setReturnUserId(Integer returnUserId) {
        this.returnUserId = returnUserId;
    }

    public void setReturnMoney(BigDecimal returnMoney) {
        this.returnMoney = returnMoney;
    }

    public void setReturnPrincipal(BigDecimal returnPrincipal) {
        this.returnPrincipal = returnPrincipal;
    }

    public void setReturnInterest(BigDecimal returnInterest) {
        this.returnInterest = returnInterest;
    }

    public void setReturnDeadline(Date returnDeadline) {
        this.returnDeadline = returnDeadline;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    public Integer getId() {
        return id;
    }

    public Integer getBorrowId() {
        return borrowId;
    }

    public String getLoanName() {
        return loanName;
    }

    public String getPhase() {
        return phase;
    }

    public Integer getReturnUserId() {
        return returnUserId;
    }

    public BigDecimal getReturnMoney() {
        return returnMoney;
    }

    public BigDecimal getReturnPrincipal() {
        return returnPrincipal;
    }

    public BigDecimal getReturnInterest() {
        return returnInterest;
    }

    public Date getReturnDeadline() {
        return returnDeadline;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public String getReturnStatus() {
        return returnStatus;
    }
}
