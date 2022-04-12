package com.capstone.paymentsystem.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.paymentsystem.account.dto.Accounts;

public interface AccountRepository extends JpaRepository<Accounts,String>  {

}
