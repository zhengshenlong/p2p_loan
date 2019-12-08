package com.p2p.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Bid implements Serializable {

     private  Integer bidId;//投标记录主键
    private  Integer borrowId;//借款标id
    private  String  borrowName;//借款标名称
    private BigDecimal bidMoney;//投资金额
    private String yerRate;//年化利率
    @DateTimeFormat(pattern = "yyyy-MM-dd")
     private Date bidTime;//投标时间
    private Integer bidUserId;//投标人id
    private Integer borrowUserId;//借款人id

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    public void setBorrowId(Integer borrowId) {
        this.borrowId = borrowId;
    }

    public void setBorrowName(String borrowName) {
        this.borrowName = borrowName;
    }

    public void setBidMoney(BigDecimal bidMoney) {
        this.bidMoney = bidMoney;
    }

    public void setYerRate(String yerRate) {
        this.yerRate = yerRate;
    }

    public void setBidTime(Date bidTime) {
        this.bidTime = bidTime;
    }

    public void setBidUserId(Integer bidUserId) {
        this.bidUserId = bidUserId;
    }

    public void setBorrowUserId(Integer borrowUserId) {
        this.borrowUserId = borrowUserId;
    }

    public Integer getBidId() {
        return bidId;
    }

    public Integer getBorrowId() {
        return borrowId;
    }

    public String getBorrowName() {
        return borrowName;
    }

    public BigDecimal getBidMoney() {
        return bidMoney;
    }

    public String getYerRate() {
        return yerRate;
    }

    public Date getBidTime() {
        return bidTime;
    }

    public Integer getBidUserId() {
        return bidUserId;
    }

    public Integer getBorrowUserId() {
        return borrowUserId;
    }
}
