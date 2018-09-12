package com.random.account.controller;

import com.random.account.domain.Employee;
import com.random.account.service.EmployeeService;
import com.random.account.utils.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 关于用户的操作
 */
@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 通过用户名查询用户是否存在
     *
     * @param username
     * @return
     */
    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public Map<String, Object> getUserByUsername(@PathVariable String username) {
        Map<String, Object> map = new HashMap<String, Object>(16);
        if (!TextUtils.isEmpty(username)) {
            try {
                Boolean result = employeeService.getUserByUsername(username);
                if (result == true) {
                    map.put("result", 0);
                    map.put("message", "查询成功,不存在该用户,可以注册");
                } else {
                    map.put("result", 1);
                    map.put("message", "存在该用户,不可以注册");
                }
            } catch (Exception e) {
                map.put("result", 3);
                map.put("message", "未知错误");
                return map;
            }
        } else {
            map.put("result", 2);
            map.put("message", "参数有误");
        }
        return map;
    }

    /**
     * 用户注册
     *
     * @param employee
     * @return
     */
    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public Map<String, Object> registerUser(Employee employee) {
        Map<String, Object> map = new HashMap<String, Object>(16);
        try {
            int result = employeeService.registerUser(employee);
            if (result == 0) {
                map.put("result", 0);
                map.put("message", "注册成功");
            } else {
                map.put("result", 1);
                map.put("message", "注册失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            map.put("result", 3);
            map.put("message", "未知错误");
            return map;
        }
        return map;
    }

    /**
     * 用户登录
     *
     * @param employee
     * @return
     */
    @RequestMapping(value = "/checkLogin", method = RequestMethod.GET)
    public Map<String, Object> checkLogin(Employee employee) {
        Map<String, Object> map = new HashMap<String, Object>(16);
        try {
            int result = employeeService.checkLogin(employee);
            if (result == 0) {
                map.put("result", 0);
                map.put("message", "登录成功");
            } else {
                map.put("result", 1);
                map.put("message", "登录失败,账号或密码错误");
            }
        } catch (Exception e) {
            e.printStackTrace();
            map.put("result", 3);
            map.put("message", "未知错误");
            return map;
        }
        return map;
    }


}
