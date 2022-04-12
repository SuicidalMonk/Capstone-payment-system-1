package com.capstone.paymentsystem.bills.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.capstone.paymentsystem.bills.dao.BillDao;
import com.capstone.paymentsystem.bills.dto.Bills;
import com.capstone.paymentsystem.user.dto.ResponseStructure;

public class BillService {

	
	@Autowired
	private BillDao billDao;

	public ResponseStructure<Bills> createBill(Bills bill) {

		ResponseStructure<Bills> responseStructure = new ResponseStructure<Bills>();
		responseStructure.setStatus(HttpStatus.OK.value());
		responseStructure.setMessage("Saved data");
		Bills createRole = billDao.saveBill(bill);
		responseStructure.setData(createRole);
		return responseStructure;
	}
	
	
}
