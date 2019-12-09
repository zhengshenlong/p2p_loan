package com.p2p.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "t_receive_plan")
public class ReceivePlan implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;//收款计划id
    private Integer returnId;//所属还款计划id
    private Integer borrowId;//借款标id
    private String loanName;//贷款名称
    private String phase;//第几期
    private BigDecimal receiveMoney;//收款总金额
    private String receiveInterest;//收款利率
    private BigDecimal receivePrincipal;//收款本金
    private BigDecimal interestee;//利息管理费
    private Integer receiveUserId;//回款人id
    private Date receiveDate;//回款日
    private Date actualReceiveDate;//实际回款日
    private String receiveStatus;//回款状态

    public void setId(Integer id) {
        this.id = id;
    }

    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
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

    public void setReceiveMoney(BigDecimal receiveMoney) {
        this.receiveMoney = receiveMoney;
    }

    public void setReceiveInterest(String receiveInterest) {
        this.receiveInterest = receiveInterest;
    }

    public void setReceivePrincipal(BigDecimal receivePrincipal) {
        this.receivePrincipal = receivePrincipal;
    }

    public void setInterestee(BigDecimal interestee) {
        this.interestee = interestee;
    }

    public void setReceiveUserId(Integer receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public void setActualReceiveDate(Date actualReceiveDate) {
        this.actualReceiveDate = actualReceiveDate;
    }

    public void setReceiveStatus(String receiveStatus) {
        this.receiveStatus = receiveStatus;
    }

    public Integer getId() {
        return id;
    }

    public Integer getReturnId() {
        return returnId;
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

    public BigDecimal getReceiveMoney() {
        return receiveMoney;
    }

    public String getReceiveInterest() {
        return receiveInterest;
    }

    public BigDecimal getReceivePrincipal() {
        return receivePrincipal;
    }

    public BigDecimal getInterestee() {
        return interestee;
    }

    public Integer getReceiveUserId() {
        return receiveUserId;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public Date getActualReceiveDate() {
        return actualReceiveDate;
    }

    public String getReceiveStatus() {
        return receiveStatus;
    }
}
