package com.random.account.test;

import com.random.account.domain.Employee;
import com.random.account.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private EmployeeService employeeService;


    /**
     * 测试user服务的服务层(用户注册)
     */
    @Test
    public void registerUserServceTest() {
        Employee employee = new Employee();
        employee.setUsername("admin2");
        employee.setPassword("66666");
        Boolean b = employeeService.getUserByUsername(employee.getUsername());
        System.out.println(b);
        if (b) {
            int result = employeeService.registerUser(employee);
            System.out.println(result);
        }
    }

    /**
     * 测试user服务的服务层(用户登录)
     */
    @Test
    public void checkLoginServceTest() {
        Employee employee = new Employee();
        employee.setUsername("admin2");
        employee.setPassword("66666");
        int result = employeeService.checkLogin(employee);
        System.out.println(result);
    }


}
