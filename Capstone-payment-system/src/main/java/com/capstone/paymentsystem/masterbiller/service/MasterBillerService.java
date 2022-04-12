package com.capstone.paymentsystem.masterbiller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.capstone.paymentsystem.masterbiller.dao.MasterBillerDao;
import com.capstone.paymentsystem.masterbiller.dto.MasterBiller;
import com.capstone.paymentsystem.user.dto.ResponseStructure;

@Service
public class MasterBillerService {
	@Autowired
	private MasterBillerDao masterbillerdao;

	public ResponseStructure<MasterBiller> createMasterBiller(MasterBiller masterbillerdao) {

		ResponseStructure<MasterBiller> responseStructure = new ResponseStructure<MasterBiller>();
		responseStructure.setStatus(HttpStatus.OK.value());
		responseStructure.setMessage("Saved data");
		MasterBiller createMasterBiller = masterbillerdao;
		responseStructure.setData(createMasterBiller);
		return responseStructure;
	}
}