package com.capstone.paymentsystem.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.capstone.paymentsystem.account.dao.AccountDao;
import com.capstone.paymentsystem.account.dto.Accounts;
import com.capstone.paymentsystem.user.dto.ResponseStructure;

@Service
public class AccountService {

	@Autowired
	private AccountDao accountDao;

	public ResponseStructure<Accounts> createAccount(Accounts account) {
		ResponseStructure<Accounts> responseStructure = new ResponseStructure<Accounts>();
		responseStructure.setStatus(HttpStatus.OK.value());
		responseStructure.setMessage("Created account");
		Accounts savedUser = accountDao.CreateAccount(account);
		responseStructure.setData(savedUser);
		return responseStructure;
	}

}
