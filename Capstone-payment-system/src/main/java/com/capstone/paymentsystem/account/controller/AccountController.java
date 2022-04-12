package com.capstone.paymentsystem.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.paymentsystem.account.dto.Accounts;
import com.capstone.paymentsystem.account.service.AccountService;
import com.capstone.paymentsystem.user.dto.ResponseStructure;

@RestController
@RequestMapping("/api/")
public class AccountController {

	@Autowired
	public AccountService accountservices;

	@PostMapping("Accounts")
	public ResponseStructure<Accounts> CreateAccount(@RequestBody Accounts account) {
		return accountservices.createAccount(account);
	}
	
	@DeleteMapping("Accounts/{id}")
	public ResponseStructure<Accounts> deleteAccount(@PathVariable  String id) {
		return accountservices.deleteAccountById(id);
	}
	
	@PutMapping("Accounts")
	public ResponseStructure<Accounts> updateAccount(@RequestBody Accounts account) {
		return accountservices.updateAccount(account);
	}
	
	@GetMapping("Accounts")
	public  ResponseStructure<Accounts> getAccountById(@RequestParam String id) {
		return accountservices.getAccountById(id);
	}
	
	@GetMapping("Accounts/all")
	public ResponseStructure<List<Accounts>> getALlAccount() {
		return accountservices.getALlAccount();
	}
	
	
}
