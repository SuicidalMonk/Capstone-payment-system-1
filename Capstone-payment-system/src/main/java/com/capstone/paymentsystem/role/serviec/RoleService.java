package com.capstone.paymentsystem.role.serviec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.capstone.paymentsystem.role.dao.RoleDao;
import com.capstone.paymentsystem.role.dto.Role;
import com.capstone.paymentsystem.user.dto.ResponseStructure;

@Service
public class RoleService {

	@Autowired
	private RoleDao roleDao;

	public ResponseStructure<Role> createRole(Role role) {

		ResponseStructure<Role> responseStructure = new ResponseStructure<Role>();
		responseStructure.setStatus(HttpStatus.OK.value());
		responseStructure.setMessage("Saved data");
		Role createRole = roleDao.saveRole(role);
		responseStructure.setData(createRole);
		return responseStructure;
	}

}
