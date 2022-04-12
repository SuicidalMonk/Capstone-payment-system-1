package com.capstone.paymentsystem.masterbiller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.paymentsystem.masterbiller.dto.MasterBiller;

public interface MasterBillerRepository  extends JpaRepository<MasterBiller,String>{
}
