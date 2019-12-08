package com.p2p.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Account implements Serializable {

    private Integer id;//主键,同用户表
    private BigDecimal accoubtAvbalance;//账户可用余额
    private BigDecimal accoubtFrobalance;//账户冻结资金
    private BigDecimal unreceivePrincipal;//待收本金
    private BigDecimal unreceiveInterest;//待收本息
    private BigDecimal unreceiveMoney;//待还本息
    private BigDecimal creditLimit;//授信额度
    private BigDecimal remainCreditLimit;//剩余授信额度
    private String tradePassword;//交易密码

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAccoubtAvbalance(BigDecimal accoubtAvbalance) {
        this.accoubtAvbalance = accoubtAvbalance;
    }

    public void setAccoubtFrobalance(BigDecimal accoubtFrobalance) {
        this.accoubtFrobalance = accoubtFrobalance;
    }

    public void setUnreceivePrincipal(BigDecimal unreceivePrincipal) {
        this.unreceivePrincipal = unreceivePrincipal;
    }

    public void setUnreceiveInterest(BigDecimal unreceiveInterest) {
        this.unreceiveInterest = unreceiveInterest;
    }

    public void setUnreceiveMoney(BigDecimal unreceiveMoney) {
        this.unreceiveMoney = unreceiveMoney;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setRemainCreditLimit(BigDecimal remainCreditLimit) {
        this.remainCreditLimit = remainCreditLimit;
    }

    public void setTradePassword(String tradePassword) {
        this.tradePassword = tradePassword;
    }

    public Integer getId() {
        return id;
    }

    public BigDecimal getAccoubtAvbalance() {
        return accoubtAvbalance;
    }

    public BigDecimal getAccoubtFrobalance() {
        return accoubtFrobalance;
    }

    public BigDecimal getUnreceivePrincipal() {
        return unreceivePrincipal;
    }

    public BigDecimal getUnreceiveInterest() {
        return unreceiveInterest;
    }

    public BigDecimal getUnreceiveMoney() {
        return unreceiveMoney;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public BigDecimal getRemainCreditLimit() {
        return remainCreditLimit;
    }

    public String getTradePassword() {
        return tradePassword;
    }
}
