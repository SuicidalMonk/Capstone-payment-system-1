package com.capstone.paymentsystem.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.paymentsystem.user.dto.ResponseStructure;
import com.capstone.paymentsystem.user.dto.Users;
import com.capstone.paymentsystem.user.serviec.UserService;

@RestController
@RequestMapping("/api/")
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@PostMapping("user")
	public ResponseStructure<Users> saveStudent(@RequestBody  Users users) {
		return userService.saveUser(users);
	}
	
	@PutMapping("user")
	public ResponseStructure<Users> updateStudent(@RequestBody Users student) {
		return userService.updateStudent(student);
	}
	
	@GetMapping("user")
	public  ResponseStructure<Users> getStudentById(@RequestParam String id) {
		return userService.getStudentById(id);
	}
	
	@GetMapping("user/all")
	public ResponseStructure<List<Users>> getALl() {
		return userService.getAllStudnet();
	}
	
	
	@DeleteMapping("user/{id}")
	public ResponseStructure<Users> deleteStudent(@PathVariable  String id) {
		return userService.deleteStudentById(id);
	}
}


