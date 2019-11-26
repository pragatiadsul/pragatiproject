package com.Expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Expense.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
