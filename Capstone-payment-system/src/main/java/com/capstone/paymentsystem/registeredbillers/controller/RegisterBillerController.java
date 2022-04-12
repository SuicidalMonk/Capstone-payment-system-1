package com.capstone.paymentsystem.registeredbillers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.paymentsystem.registeredbillers.dto.RegisteredBillers;
import com.capstone.paymentsystem.registeredbillers.service.RegisterBillerService;
import com.capstone.paymentsystem.user.dto.ResponseStructure;

@RestController
@RequestMapping("/api/")

public class RegisterBillerController {
	
	@Autowired
	private RegisterBillerService registeredbillerservice;
	
	@PostMapping("RegisteredBillers")
	public ResponseStructure<RegisteredBillers> CreateRole(@RequestBody RegisteredBillers rb) {
		return registeredbillerservice.createRegisteredBiller(rb);
	}

}