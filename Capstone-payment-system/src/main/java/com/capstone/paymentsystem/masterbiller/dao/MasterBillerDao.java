package com.capstone.paymentsystem.masterbiller.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capstone.paymentsystem.masterbiller.dto.MasterBiller;
import com.capstone.paymentsystem.masterbiller.repository.MasterBillerRepository;

@Repository
public class MasterBillerDao {
	@Autowired
	private MasterBillerRepository MBRepository;
	
	public MasterBiller saveMasterBiller(MasterBiller mb) {
		return MBRepository.save(mb);
	}
	
	public List<MasterBiller> getAll(){
		return MBRepository.findAll();
	}

}