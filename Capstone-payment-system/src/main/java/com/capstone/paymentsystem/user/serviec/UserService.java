package com.capstone.paymentsystem.user.serviec;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.capstone.paymentsystem.user.dao.UserDao;
import com.capstone.paymentsystem.user.dto.ResponseStructure;
import com.capstone.paymentsystem.user.dto.Users;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public ResponseStructure<Users> saveUser(Users users) {

		ResponseStructure<Users> responseStructure = new ResponseStructure<Users>();
		responseStructure.setStatus(HttpStatus.OK.value());
		responseStructure.setMessage("Saved data");
		Users savedUser = userDao.saveUser(users);
		responseStructure.setData(savedUser);
		return responseStructure;
	}

	public ResponseStructure<Users> updateStudent(Users users) {

		Users existStudent = userDao.getUserById(users.getLoginId());
		ResponseStructure<Users> responseStructure = new ResponseStructure<Users>();
		if (existStudent != null) {
			Users updatedStudent = userDao.updateUser(users);
			responseStructure.setData(updatedStudent);
			responseStructure.setStatus(HttpStatus.OK.value());
			responseStructure.setMessage("Student data updated");
		} else {
			responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
			responseStructure.setMessage("Student ID does not exist to updated");
		}

		return responseStructure;
	}

	public ResponseStructure<Users> getStudentById(String id) {
		Users existStudent = userDao.getUserById(id);
		ResponseStructure<Users> responseStructure = new ResponseStructure<Users>();
		if (existStudent != null) {
			responseStructure.setData(existStudent);
			responseStructure.setStatus(HttpStatus.OK.value());
			responseStructure.setMessage("Student data updated");
		} else {
			responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
			responseStructure.setMessage("Student ID does not exist");
		}
		return responseStructure;
	}

	public ResponseStructure<Users> deleteStudentById(String id) {
		ResponseStructure<Users> responseStructure = new ResponseStructure<Users>();
		boolean res = userDao.deleteUserById(id);
		if (res) {
			responseStructure.setStatus(HttpStatus.OK.value());
			responseStructure.setMessage("Student data deleted");
		} else {
			responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
			responseStructure.setMessage("Student ID does not exist to delete");
		}
		return responseStructure;
	}

	public ResponseStructure<List<Users>> getAllStudnet() {
		ResponseStructure<List<Users>> responseStructure = new ResponseStructure<List<Users>>();
		responseStructure.setStatus(HttpStatus.OK.value());
		responseStructure.setData(userDao.getAll());
		responseStructure.setMessage("all student data");
		return responseStructure;
	}

}