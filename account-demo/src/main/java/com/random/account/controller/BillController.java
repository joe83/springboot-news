package com.random.account.controller;

import com.random.account.domain.Bill;
import com.random.account.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BillController {

    @Autowired
    private BillService billService;

    @RequestMapping(value = "/getBills", method = RequestMethod.GET)
    public Map<String, Object> getBills(Long id) {
        Map<String, Object> map = new HashMap<>();
        List<Bill> result = billService.getUserBills(id);
        if (result.size() > 0) {
            map.put("result", 0);
            map.put("message", "查询成功");
            map.put("data", result);
        }
        return map;
    }
}
