package com.capstone.paymentsystem.bills.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.paymentsystem.bills.dto.Bills;
import com.capstone.paymentsystem.bills.service.BillService;
import com.capstone.paymentsystem.user.dto.ResponseStructure;

@RestController
@RequestMapping("/api/")
public class BillController {

@Autowired
public BillService billsservice;

@PostMapping("Bills")
public ResponseStructure <Bills> CreateBills( @RequestBody Bills bill){
	return billsservice.createBill(bill);
}

}