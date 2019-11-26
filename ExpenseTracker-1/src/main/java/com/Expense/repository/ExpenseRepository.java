package com.Expense.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Expense.model.Expense;


@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer>{

	

}
