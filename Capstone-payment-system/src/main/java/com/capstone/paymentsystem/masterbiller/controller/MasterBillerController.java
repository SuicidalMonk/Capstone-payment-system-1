package com.capstone.paymentsystem.masterbiller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.paymentsystem.masterbiller.dto.MasterBiller;
import com.capstone.paymentsystem.masterbiller.service.MasterBillerService;
import com.capstone.paymentsystem.user.dto.ResponseStructure;

@RestController
@RequestMapping("/api/")
public class MasterBillerController {

	@Autowired
	private MasterBillerService masterbillerservice;

	@PostMapping("MasterBiller")
	public ResponseStructure<MasterBiller> CreateMasterBiller(@RequestBody MasterBiller mb) {
		return masterbillerservice.createMasterBiller(mb);
	}
}