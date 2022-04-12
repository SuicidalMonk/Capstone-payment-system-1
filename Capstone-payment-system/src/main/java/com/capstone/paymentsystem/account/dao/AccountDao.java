package com.capstone.paymentsystem.account.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capstone.paymentsystem.account.dto.Accounts;
import com.capstone.paymentsystem.account.repository.AccountRepository;

@Repository
public class AccountDao {

	@Autowired
	private AccountRepository accountRepository;

	public Accounts CreateAccount(Accounts account) {
		return accountRepository.save(account);
	}

	public boolean deleteUserById(String id) {
		Accounts account = getUserById(id);
		if (account != null) {
			accountRepository.delete(account);
			return true;
		}
		return false;
	}

	public Accounts getUserById(String id) {
		Optional<Accounts> optional = accountRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
	
	
	public Accounts updateAccount(Accounts account) {
		return accountRepository.save(account);
	}

	public List<Accounts> getAll() {
		return accountRepository.findAll();
	}

	public Accounts getAccountById(String id) {
		Optional<Accounts> optional = accountRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
}
