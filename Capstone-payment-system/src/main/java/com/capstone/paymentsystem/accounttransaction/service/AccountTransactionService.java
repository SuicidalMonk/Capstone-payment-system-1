package com.capstone.paymentsystem.accounttransaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.capstone.paymentsystem.accounttransaction.dao.AccountTransactionDao;
import com.capstone.paymentsystem.accounttransaction.dto.AccountTransaction;
import com.capstone.paymentsystem.user.dto.ResponseStructure;

@Service
public class AccountTransactionService {
	@Autowired
	private AccountTransactionDao atDao;

	public ResponseStructure<AccountTransaction> createAccountTransactions(AccountTransaction at) {

		ResponseStructure<AccountTransaction> responseStructure = new ResponseStructure<AccountTransaction>();
		responseStructure.setStatus(HttpStatus.OK.value());
		responseStructure.setMessage("Saved data");
		AccountTransaction createAccountTransactions = atDao.saveAccountTransactions(at);
		responseStructure.setData(createAccountTransactions);
		return responseStructure;
	}

}