package com.random.account.service;

import com.random.account.domain.Employee;

public interface UserService {

    /**
     * 通过用户名查找用户是否存在
     *
     * @param username
     * @return
     */
    boolean getUserByUsername(String username);

    /**
     * 注册用户
     *
     * @param employee
     * @return
     */
    int registerUser(Employee employee);

    /**
     * 用户登录
     *
     * @param employee
     * @return
     */
    int checkLogin(Employee employee);

}
