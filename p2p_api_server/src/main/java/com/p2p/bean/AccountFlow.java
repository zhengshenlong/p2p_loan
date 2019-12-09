package com.p2p.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "t_account_flow")
public class AccountFlow implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer recorId;//主键id
    private BigDecimal recordDate;//动账时间
    private String recordHandletype;//操作类型
    private BigDecimal recordHandlemoney;//操作金额
    private Integer accountId;//账户id
    private BigDecimal recordSurplus;//结余
    private String recordNotes;//备注

    public void setRecorId(Integer recorId) {
        this.recorId = recorId;
    }

    public void setRecordDate(BigDecimal recordDate) {
        this.recordDate = recordDate;
    }

    public void setRecordHandletype(String recordHandletype) {
        this.recordHandletype = recordHandletype;
    }

    public void setRecordHandlemoney(BigDecimal recordHandlemoney) {
        this.recordHandlemoney = recordHandlemoney;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public void setRecordSurplus(BigDecimal recordSurplus) {
        this.recordSurplus = recordSurplus;
    }

    public void setRecordNotes(String recordNotes) {
        this.recordNotes = recordNotes;
    }

    public Integer getRecorId() {
        return recorId;
    }

    public BigDecimal getRecordDate() {
        return recordDate;
    }

    public String getRecordHandletype() {
        return recordHandletype;
    }

    public BigDecimal getRecordHandlemoney() {
        return recordHandlemoney;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public BigDecimal getRecordSurplus() {
        return recordSurplus;
    }

    public String getRecordNotes() {
        return recordNotes;
    }
}
