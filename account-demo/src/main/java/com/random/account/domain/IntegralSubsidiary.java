package com.random.account.domain;

public class IntegralSubsidiary {
    private Long id;

    private Integer employee_id;

    private Integer integral_type_id;

    private Integer grade;

    private String explain;

    private String input_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public Integer getIntegral_type_id() {
        return integral_type_id;
    }

    public void setIntegral_type_id(Integer integral_type_id) {
        this.integral_type_id = integral_type_id;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
    }

    public String getInput_time() {
        return input_time;
    }

    public void setInput_time(String input_time) {
        this.input_time = input_time == null ? null : input_time.trim();
    }

    @Override
    public String toString() {
        return "IntegralSubsidiary{" +
                "id=" + id +
                ", employee_id=" + employee_id +
                ", integral_type_id=" + integral_type_id +
                ", grade=" + grade +
                ", explain='" + explain + '\'' +
                ", input_time='" + input_time + '\'' +
                '}';
    }
}