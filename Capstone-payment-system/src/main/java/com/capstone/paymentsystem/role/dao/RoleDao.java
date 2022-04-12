package com.capstone.paymentsystem.role.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capstone.paymentsystem.role.dto.Role;
import com.capstone.paymentsystem.role.repository.RoleRepository;

@Repository
public class RoleDao {

	
	@Autowired
	private RoleRepository roleRepository;
	
	public Role saveRole(Role role) {
		return roleRepository.save(role);
	}
	
	public List<Role> getAll(){
		return roleRepository.findAll();
	}

	
	
}
