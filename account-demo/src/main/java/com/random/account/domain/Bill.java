package com.random.account.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Bill {
    private Long id;

    private Long employeeId;

    private BigDecimal billMoney;

    private Date billTime;

    private String billRecord;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public BigDecimal getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(BigDecimal billMoney) {
        this.billMoney = billMoney;
    }

    public Date getBillTime() {
        return billTime;
    }

    public void setBillTime(Date billTime) {
        this.billTime = billTime;
    }

    public String getBillRecord() {
        return billRecord;
    }

    public void setBillRecord(String billRecord) {
        this.billRecord = billRecord == null ? null : billRecord.trim();
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", billMoney=" + billMoney +
                ", billTime=" + billTime +
                ", billRecord='" + billRecord + '\'' +
                '}';
    }
}