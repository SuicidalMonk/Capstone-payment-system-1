package com.capstone.paymentsystem.registeredbillers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.paymentsystem.registeredbillers.dto.RegisteredBillers;

public interface RegisteredBillerRepository extends JpaRepository<RegisteredBillers,String> {

}
