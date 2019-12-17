package com.p2p.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "t_account")
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;//主键,同用户表
    private BigDecimal accoubtAvbalance;//账户可用余额
    private BigDecimal accoubtFrobalance;//账户冻结资金
    private BigDecimal unreceivePrincipal;//待收本金
    private BigDecimal unreceiveInterest;//待收本息
    private BigDecimal unreceiveMoney;//待还本息
    private BigDecimal creditLimit;//授信额度
    private BigDecimal remainCreditLimit;//剩余授信额度
    private String tradePassword;//交易密码

    public Account() {

    }

    public Account(Integer id, BigDecimal accoubtAvbalance, BigDecimal accoubtFrobalance, BigDecimal unreceivePrincipal, BigDecimal unreceiveInterest, BigDecimal unreceiveMoney, BigDecimal creditLimit, BigDecimal remainCreditLimit, String tradePassword) {
        this.id = id;
        this.accoubtAvbalance = accoubtAvbalance;
        this.accoubtFrobalance = accoubtFrobalance;
        this.unreceivePrincipal = unreceivePrincipal;
        this.unreceiveInterest = unreceiveInterest;
        this.unreceiveMoney = unreceiveMoney;
        this.creditLimit = creditLimit;
        this.remainCreditLimit = remainCreditLimit;
        this.tradePassword = tradePassword;
    }

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
