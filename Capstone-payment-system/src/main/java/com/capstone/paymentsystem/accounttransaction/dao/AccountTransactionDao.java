package com.capstone.paymentsystem.accounttransaction.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capstone.paymentsystem.accounttransaction.dto.AccountTransaction;
import com.capstone.paymentsystem.accounttransaction.repository.AccountTransactionRepository;

@Repository
public class AccountTransactionDao {
	@Autowired
	private AccountTransactionRepository ATRepository;
	
	public AccountTransaction saveAccountTransactions(AccountTransaction at) {
		return ATRepository.save(at);
	}
	
	public List<AccountTransaction> getAll(){
		return ATRepository.findAll();
	}

}