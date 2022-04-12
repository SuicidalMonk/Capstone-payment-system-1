package com.capstone.paymentsystem.role.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.paymentsystem.role.dto.Role;

public interface RoleRepository extends JpaRepository<Role,String> {

}
