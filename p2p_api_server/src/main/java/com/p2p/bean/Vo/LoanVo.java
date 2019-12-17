package com.p2p.bean.Vo;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LoanVo implements Serializable {

    private Date startDate; //开始时间
    private Date endDate;   //结束时间
    private Integer pageNum; //当前页
    private Integer pageSize; //当前一共有多少条数据
    private String status; //状态
    private BigDecimal borrowAmount;
    private BigDecimal yearRate;
    private int returnMonthNum;
    private int returnType;

    public void setBorrowAmount(BigDecimal borrowAmount) {
        this.borrowAmount = borrowAmount;
    }

    public void setYearRate(BigDecimal yearRate) {
        this.yearRate = yearRate;
    }

    public void setReturnMonthNum(int returnMonthNum) {
        this.returnMonthNum = returnMonthNum;
    }

    public void setReturnType(int returnType) {
        this.returnType = returnType;
    }

    public BigDecimal getBorrowAmount() {
        return borrowAmount;
    }

    public BigDecimal getYearRate() {
        return yearRate;
    }

    public int getReturnMonthNum() {
        return returnMonthNum;
    }

    public int getReturnType() {
        return returnType;
    }



    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public String getStatus() {
        return status;
    }
}
