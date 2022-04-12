package com.capstone.paymentsystem.accounttransaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.paymentsystem.accounttransaction.dto.AccountTransaction;

public interface AccountTransactionRepository extends JpaRepository<AccountTransaction,String>{

}
