package com.p2p.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "t_loan_mark")
public class Loan implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer borrowSignId;//主键id
    private String borrowName;//借款标名称
    private Integer borrowUserId;//贷款人id
    private BigDecimal borrowMoney;//贷款金额
    private BigDecimal yearRate;//年化利率
    private Integer returnMonthes;//还款期数
    private String borrowUse;//借款用途
    private Integer paymentMethod;//还款方式(等额本息,等额本金,按月到期)
    private String borrowDays;//招标天数
    private BigDecimal accessMoney;//募集到的资金金额
    private Date publishTime;//发布时间
    private Integer status;//借款标状态

    public void setBorrowSignId(Integer borrowSignId) {
        this.borrowSignId = borrowSignId;
    }

    public void setBorrowName(String borrowName) {
        this.borrowName = borrowName;
    }

    public void setBorrowUserId(Integer borrowUserId) {
        this.borrowUserId = borrowUserId;
    }

    public void setBorrowMoney(BigDecimal borrowMoney) {
        this.borrowMoney = borrowMoney;
    }

    public void setYearRate(BigDecimal yearRate) {
        this.yearRate = yearRate;
    }

    public void setReturnMonthes(Integer returnMonthes) {
        this.returnMonthes = returnMonthes;
    }

    public void setBorrowUse(String borrowUse) {
        this.borrowUse = borrowUse;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setBorrowDays(String borrowDays) {
        this.borrowDays = borrowDays;
    }

    public void setAccessMoney(BigDecimal accessMoney) {
        this.accessMoney = accessMoney;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBorrowSignId() {
        return borrowSignId;
    }

    public String getBorrowName() {
        return borrowName;
    }

    public Integer getBorrowUserId() {
        return borrowUserId;
    }

    public BigDecimal getBorrowMoney() {
        return borrowMoney;
    }

    public BigDecimal getYearRate() {
        return yearRate;
    }

    public Integer getReturnMonthes() {
        return returnMonthes;
    }

    public String getBorrowUse() {
        return borrowUse;
    }

    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    public String getBorrowDays() {
        return borrowDays;
    }

    public BigDecimal getAccessMoney() {
        return accessMoney;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public Integer getStatus() {
        return status;
    }
}
