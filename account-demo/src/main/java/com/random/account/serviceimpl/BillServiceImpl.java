package com.random.account.serviceimpl;

import com.random.account.domain.Bill;
import com.random.account.mapper.BillMapper;
import com.random.account.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillMapper billMapper;

    @Override
    public List<Bill> getUserBills(Long userId) {
        List<Bill> bills = billMapper.getUserBills(userId);
        if(bills == null ||  bills.size() < 0){
            //  没有数据
            return new ArrayList<>();
        }
        return bills;
    }

    @Override
    public int insertBill(Bill bill) {
        int result = 0;
        try{
            int insertResult = billMapper.insertBill(bill);
            if(insertResult == 0){
                result = 1;
            }else{
                return result;
            }
        }catch (Exception e){
            e.printStackTrace();
            result = 2;
            return result;
        }
        return result;
    }
}
