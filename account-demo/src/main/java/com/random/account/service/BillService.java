package com.random.account.service;

import com.random.account.domain.Bill;

import java.util.List;

public interface BillService {

    List<Bill> getUserBills(Long userId);


}
