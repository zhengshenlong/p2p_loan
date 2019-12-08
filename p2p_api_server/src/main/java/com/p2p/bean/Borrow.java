package com.p2p.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Borrow implements Serializable {

    private Integer id;//审核id
    private Integer borrowId;//借款标id
    private String auditType;//审核类型（0:发标前审核    1：满标审核）
    private String auditStatus;//审核结果状态（0:待审核   1：审核通过   2:审核不通过）
    private String auditComment;//审核批注
    private Integer auditUserId;//审核人id
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date auditTime;//审核时间


    public void setId(Integer id) {
        this.id = id;
    }

    public void setBorrowId(Integer borrowId) {
        this.borrowId = borrowId;
    }

    public void setAuditType(String auditType) {
        this.auditType = auditType;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public void setAuditComment(String auditComment) {
        this.auditComment = auditComment;
    }

    public void setAuditUserId(Integer auditUserId) {
        this.auditUserId = auditUserId;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Integer getId() {
        return id;
    }

    public Integer getBorrowId() {
        return borrowId;
    }

    public String getAuditType() {
        return auditType;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public String getAuditComment() {
        return auditComment;
    }

    public Integer getAuditUserId() {
        return auditUserId;
    }

    public Date getAuditTime() {
        return auditTime;
    }
}
