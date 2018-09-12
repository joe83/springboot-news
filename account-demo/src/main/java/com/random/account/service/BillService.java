package com.random.account.service;

import com.random.account.domain.Bill;

import java.util.List;

public interface BillService {

    /**
     * 获取用户的所有账单
     *
     * @param userId
     * @return
     */
    List<Bill> getUserBills(Long userId);

    /**
     * 新添账单
     *
     * @param bill
     * @return
     */
    int insertBill(Bill bill);


}
