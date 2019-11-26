package com.Expense.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Expense.dao.IUserDao;
import com.Expense.exception.UserNotFoundException;
import com.Expense.model.User;
import com.Expense.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService{

	
	@Autowired
	private IUserDao userDao;
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public String resgisterUser(User user) {
		// TODO Auto-generated method stub
		return userDao.registerUser(user);
	}

	@Override
	public User loginUser(String emailId, String password) {
		User userData = userDao.loginUser(emailId, password);
		if(userData==null) {
			throw new UserNotFoundException("please register before login");
		}
		return userData;
		//return userDao.loginUser(emailId,password);
	}
	
	

	@Override
	public List<User> usersList() {
		// TODO Auto-generated method stub
		return userDao.getusersList();
	}

	
}
