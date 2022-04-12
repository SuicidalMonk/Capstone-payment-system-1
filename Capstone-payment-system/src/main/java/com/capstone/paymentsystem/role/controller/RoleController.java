package com.capstone.paymentsystem.role.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.paymentsystem.role.dto.Role;
import com.capstone.paymentsystem.role.serviec.RoleService;
import com.capstone.paymentsystem.user.dto.ResponseStructure;

@RestController
@RequestMapping("/api/")
public class RoleController {

	@Autowired
	private RoleService roleservice;

	@PostMapping("Role")
	public ResponseStructure<Role> CreateRole(@RequestBody Role role) {
		return roleservice.createRole(role);
	}
}