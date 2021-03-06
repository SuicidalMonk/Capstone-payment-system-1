package com.capstone.paymentsystem.user.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capstone.paymentsystem.user.dto.Users;
import com.capstone.paymentsystem.user.repository.UserRepository;

@Repository
public class UserDao {

	@Autowired
	private UserRepository userRepository;

	public Users saveUser(Users user) {
		return userRepository.save(user);
	}

	public Users updateUser(Users user) {
		return userRepository.save(user);
	}

	public List<Users> getAll() {
		return userRepository.findAll();
	}

	public Users getUserById(String id) {
		Optional<Users> optional = userRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	public boolean deleteUserById(String id) {
		Users student = getUserById(id);
		if (student != null) {
			userRepository.delete(student);
			return true;
		}
		return false;
	}
}
