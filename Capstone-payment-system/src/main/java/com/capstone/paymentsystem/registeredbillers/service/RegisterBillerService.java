package com.capstone.paymentsystem.registeredbillers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.capstone.paymentsystem.registeredbillers.dao.RegisterBillerDao;
import com.capstone.paymentsystem.registeredbillers.dto.RegisteredBillers;
import com.capstone.paymentsystem.user.dto.ResponseStructure;

@Service
public class RegisterBillerService {
	@Autowired
	private RegisterBillerDao rbDao;

	public ResponseStructure<RegisteredBillers> createRegisteredBiller(RegisteredBillers rb) {

		ResponseStructure<RegisteredBillers> responseStructure = new ResponseStructure<RegisteredBillers>();
		responseStructure.setStatus(HttpStatus.OK.value());
		responseStructure.setMessage("Saved data");
		RegisteredBillers createRegisteredBiller = rbDao.saveRegisteredBillers(rb);
		responseStructure.setData(createRegisteredBiller);
		return responseStructure;
	}

}