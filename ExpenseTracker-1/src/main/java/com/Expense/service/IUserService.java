package com.Expense.service;

import java.util.List;

import com.Expense.model.User;

public interface IUserService {

	User loginUser(String emailId, String password);


	List<User> usersList();

	String resgisterUser(User user);

}
