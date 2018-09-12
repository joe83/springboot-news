package com.random.account.domain;

import java.util.Date;

public class IntegralType {
    private Integer id;

    private String type_name;

    private String explain;

    private Integer grade;

    private Integer day_count;

    private Date inputTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public Integer getDay_count() {
        return day_count;
    }

    public void setDay_count(Integer day_count) {
        this.day_count = day_count;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    @Override
    public String toString() {
        return "IntegralType{" +
                "id=" + id +
                ", type_name='" + type_name + '\'' +
                ", explain='" + explain + '\'' +
                ", grade=" + grade +
                ", day_count=" + day_count +
                ", inputTime=" + inputTime +
                '}';
    }
}