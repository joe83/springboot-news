package com.random.account.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Bill {
    private Long id;

    private Long employee_id;

    private BigDecimal bill_money;

    private Date bill_time;

    private String bill_record;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public BigDecimal getBill_money() {
        return bill_money;
    }

    public void setBill_money(BigDecimal bill_money) {
        this.bill_money = bill_money;
    }

    public Date getBill_time() {
        return bill_time;
    }

    public void setBill_time(Date bill_time) {
        this.bill_time = bill_time;
    }

    public String getBill_record() {
        return bill_record;
    }

    public void setBill_record(String bill_record) {
        this.bill_record = bill_record == null ? null : bill_record.trim();
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", employee_id=" + employee_id +
                ", bill_money=" + bill_money +
                ", bill_time=" + bill_time +
                ", bill_record='" + bill_record + '\'' +
                '}';
    }
}