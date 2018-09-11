package com.random.account.Test;

import com.random.account.domain.Employee;
import com.random.account.service.UserService;
import com.random.account.utils.TextUtils;
import com.random.account.utils.UserContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserService userService;


    /**
     * 测试user服务的服务层(用户注册)
     */
    @Test
    public void registerUserServceTest() {
        Employee employee = new Employee();
        employee.setUsername("admin1");
        employee.setPassword("Love1314.");
        Boolean b = userService.getUserByUsername(employee.getUsername());
        System.out.println(b);
        if (b) {
            int result = userService.registerUser(employee);
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
        employee.setPassword("Love1314.");
        int result = userService.checkLogin(employee);
        System.out.println(result);
    }


}
