package com.random.account.mapper;

import com.random.account.domain.Bill;

import java.util.List;

public interface BillMapper {
    /**
     * 获取用户的所有账单
     *
     * @param userId
     * @return
     */
    List<Bill> getUserBills(Long userId);

    /**
     * 添加账单
     *
     * @param bill
     * @return
     */
    int insertBill(Bill bill);
}