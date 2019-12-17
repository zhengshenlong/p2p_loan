package com.p2p.bean.Vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class BidVo implements Serializable {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
       private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
       private Date endDate;

    //分页的功能
      private Integer pageNum; //当前页
      private Integer pageSize; //每一页展示多少条数据

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}
