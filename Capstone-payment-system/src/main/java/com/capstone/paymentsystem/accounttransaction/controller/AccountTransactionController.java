package com.capstone.paymentsystem.accounttransaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.paymentsystem.accounttransaction.dto.AccountTransaction;
import com.capstone.paymentsystem.accounttransaction.service.AccountTransactionService;
import com.capstone.paymentsystem.user.dto.ResponseStructure;

@RestController
@RequestMapping("/api/")
public class AccountTransactionController {
	@Autowired
	private AccountTransactionService atrservice;
	
	@PostMapping("AccountTransactions")
	public ResponseStructure<AccountTransaction> CreateRole(@RequestBody AccountTransaction at) {
		return atrservice.createAccountTransactions(at);
	}

}