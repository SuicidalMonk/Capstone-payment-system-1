package com.capstone.paymentsystem.bills.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.paymentsystem.bills.dto.Bills;

public interface BillRepository extends JpaRepository<Bills,String> {

}
