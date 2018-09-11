package com.random.account.mapper;

import com.random.account.domain.Employee;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface EmployeeMapper {

    /**
     * 通过用户名查询用户是否被注册
     *
     * @param username
     * @return
     */
    Employee selectUserByUsername(@Param("username") String username);

    /**
     * 用户注册
     *
     * @param record
     * @return
     */
    int registerUser(Employee record);

    /**
     * 用户登录
     *
     * @param employee
     * @return
     */
    Employee checkLogin(Employee employee);

    /**
     * 通过用户名获取用户的随机盐
     *
     * @param username
     * @return
     */
    String getSaltByUsername(@Param("username") String username);

}