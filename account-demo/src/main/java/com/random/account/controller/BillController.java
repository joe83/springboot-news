package com.random.account.controller;

import com.random.account.domain.Bill;
import com.random.account.domain.Employee;
import com.random.account.service.BillService;
import com.random.account.utils.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BillController {

    @Autowired
    private BillService billService;

    /**
     * 获取用户所有账单
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/getBills", method = RequestMethod.GET)
    public Map<String, Object> getBills(Long id) {
        Map<String, Object> map = new HashMap<>();
        List<Bill> result = new ArrayList<>();
        try {
            result = billService.getUserBills(id);
            if (result != null && result.size() > 0) {
                map.put("result", 0);
                map.put("message", "查询成功");
                map.put("data", result);
            } else {
                map.put("result", 1);
                map.put("message", "查询失败");
                map.put("data", result);
            }
        } catch (Exception e) {
            e.printStackTrace();
            map.put("result", 3);
            map.put("message", "查询出错");
            return map;
        }

        return map;
    }

    /**
     * 新增账单
     *
     * @param bill
     * @return
     */
    @RequestMapping(value = "/insertBill", method = RequestMethod.POST)
    public Map<String, Object> insertBill(Bill bill) {
        Map<String, Object> map = new HashMap<>();
        Employee employee = UserContext.getUser();
        if (employee != null) {
            bill.setEmployeeId(employee.getId());
        }
        int result = 0;
        try {
            result = billService.insertBill(bill);
            if (result == 0) {
                map.put("result", 0);
                map.put("message", "添加成功");
            } else {
                map.put("result", 1);
                map.put("message", "添加失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            map.put("result", 3);
            map.put("message", "添加失败");
            return map;
        }
        return map;
    }


















}
