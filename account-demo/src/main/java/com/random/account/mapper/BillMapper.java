package com.random.account.mapper;

import com.random.account.domain.Bill;

import java.util.List;

public interface BillMapper {

    List<Bill> getUserBills(Long useId);

}