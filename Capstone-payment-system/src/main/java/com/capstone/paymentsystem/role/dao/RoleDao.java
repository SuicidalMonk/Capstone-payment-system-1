package com.capstone.paymentsystem.role.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capstone.paymentsystem.role.dto.Role;
import com.capstone.paymentsystem.role.repository.RoleRepository;
import com.capstone.paymentsystem.user.dto.Users;

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

	public Role updateRole(Role role) {
		return roleRepository.save(role);
	}


	public Role getRoleById(String id) {
		Optional<Role> optional = roleRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	public boolean deleteUserById(String id) {
		Role role = getRoleById(id);
		if (role != null) {
			roleRepository.delete(role);
			return true;
		}
		return false;
	}
	
	
	
}
