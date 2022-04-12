package com.capstone.paymentsystem.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.paymentsystem.account.dto.Accounts;
import com.capstone.paymentsystem.account.service.AccountService;
import com.capstone.paymentsystem.user.dto.ResponseStructure;

@RestController
@RequestMapping("/api/")
public class AccountController {

	@Autowired
	public AccountService paymentservices;

	@PostMapping("Accounts")
	public ResponseStructure<Accounts> CreateAccount(@RequestBody Accounts account) {
		return paymentservices.createAccount(account);
	}
}
