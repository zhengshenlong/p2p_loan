package com.p2p.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Recharge implements Serializable {

     private Integer payId; //主键(支付单号)
     private BigDecimal payMoney; //支付金额
     private Date downOrderTime;//下单时间
     private Date payTime;//支付时间
     private String chargeType;//充值方式(0:线下1:线上)
     private String tradeCode;//交易编号
     private String payComment;//付款单备注
     private String payStatus;//支付状态
     private Integer createUserId;//用户id
     private Integer auditUserId;//审核人id
     private String auditStatus;//审核状态
     private String auditComment;//审核批注
     private Date auditTime;//审核时间

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public void setDownOrderTime(Date downOrderTime) {
        this.downOrderTime = downOrderTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public void setPayComment(String payComment) {
        this.payComment = payComment;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public void setAuditUserId(Integer auditUserId) {
        this.auditUserId = auditUserId;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public void setAuditComment(String auditComment) {
        this.auditComment = auditComment;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Integer getPayId() {
        return payId;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public Date getDownOrderTime() {
        return downOrderTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public String getChargeType() {
        return chargeType;
    }

    public String getTradeCode() {
        return tradeCode;
    }

    public String getPayComment() {
        return payComment;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public Integer getAuditUserId() {
        return auditUserId;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public String getAuditComment() {
        return auditComment;
    }

    public Date getAuditTime() {
        return auditTime;
    }
}
