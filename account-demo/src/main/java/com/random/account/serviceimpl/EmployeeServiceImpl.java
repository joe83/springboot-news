package com.random.account.serviceimpl;

import com.random.account.domain.Employee;
import com.random.account.mapper.EmployeeMapper;
import com.random.account.service.EmployeeService;
import com.random.account.utils.TextUtils;
import com.random.account.utils.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public int checkLogin(Employee employee) {
        int result = 0;
        if (TextUtils.isEmpty(employee.getUsername()) || TextUtils.isEmpty(employee.getPassword())) {
            //  账号或密码为空
            result = 1;
            return result;
        }
        try {
            String salt = employeeMapper.getSaltByUsername(employee.getUsername());
            String password = TextUtils.EncoderByMd5(employee.getPassword() + salt);
            employee.setPassword(password);
            Employee emp = employeeMapper.checkLogin(employee);
            if (emp != null) {
                // 登录成功,存入session
                UserContext.setUser(emp);
                result = 0;
            } else {
                //  账号或密码错误
                result = 2;
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = 3;
            return result;
        }
        return result;
    }

    @Override
    public int registerUser(Employee employee) {
        int result = 0;
        if (TextUtils.isEmpty(employee.getUsername()) || TextUtils.isEmpty(employee.getPassword())) {
            //  账号或密码为空
            result = 1;
            return result;
        }
        try {
            String salt = TextUtils.getSalt();
            //  获取随机盐, 以及用户密码加随机盐MD5加密
            employee.setSalt(salt);
            employee.setPassword(TextUtils.EncoderByMd5(employee.getPassword() + salt));
            int insertResult = employeeMapper.registerUser(employee);
            if (insertResult == 1) {
                //  注册成功
                return result;
            } else {
                //  注册失败
                result = 2;
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = 3;
            return result;
        }
        return result;
    }

    @Override
    public boolean getUserByUsername(String username) {
        boolean result = false;
        if (TextUtils.isEmpty(username)) {
            return result;
        }
        try {
            Employee employee = employeeMapper.selectUserByUsername(username);
            if (employee == null) {
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return result;
        }
        return result;
    }

}
