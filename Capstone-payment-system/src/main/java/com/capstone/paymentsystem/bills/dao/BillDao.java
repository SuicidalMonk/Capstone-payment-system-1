package com.capstone.paymentsystem.bills.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capstone.paymentsystem.bills.dto.Bills;
import com.capstone.paymentsystem.bills.repository.BillRepository;

@Repository
public class BillDao {

	
	@Autowired
	private BillRepository billsrepository;
	
	public Bills saveBill(Bills bill) {
		return billsrepository.save(bill);
	}
	
	
}
