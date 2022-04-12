package com.capstone.paymentsystem.registeredbillers.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capstone.paymentsystem.registeredbillers.dto.RegisteredBillers;
import com.capstone.paymentsystem.registeredbillers.repository.RegisteredBillerRepository;

@Repository
public class RegisterBillerDao {
	@Autowired
	private RegisteredBillerRepository RBRepository;
	
	public RegisteredBillers saveRegisteredBillers(RegisteredBillers rb) {
		return RBRepository.save(rb);
	}
	
	public List<RegisteredBillers> getAll(){
		return RBRepository.findAll();
	}

}