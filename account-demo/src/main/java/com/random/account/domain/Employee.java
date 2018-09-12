package com.random.account.domain;

public class Employee {
    private Long id;

    private String username;

    private String password;

    private String nickname;

    private String phone;

    private String qq_nbr;

    private String wechat;

    private String email;

    private String salt;

    private String role;

    private String last_login_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getQq_nbr() {
        return qq_nbr;
    }

    public void setQq_nbr(String qq_nbr) {
        this.qq_nbr = qq_nbr == null ? null : qq_nbr.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(String last_login_time) {
        this.last_login_time = last_login_time == null ? null : last_login_time.trim();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phone='" + phone + '\'' +
                ", qq_nbr='" + qq_nbr + '\'' +
                ", wechat='" + wechat + '\'' +
                ", email='" + email + '\'' +
                ", salt='" + salt + '\'' +
                ", role='" + role + '\'' +
                ", last_login_time='" + last_login_time + '\'' +
                '}';
    }
}