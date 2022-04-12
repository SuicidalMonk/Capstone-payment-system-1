package com.capstone.paymentsystem.account.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capstone.paymentsystem.account.dto.Accounts;
import com.capstone.paymentsystem.account.repository.AccountRepository;

@Repository
public class AccountDao {

	@Autowired
	private AccountRepository paymentSystemRepository;
	
	public Accounts CreateAccount(Accounts account) {
		return paymentSystemRepository.save(account);
	}
	
}
