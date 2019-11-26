package com.Expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Expense.dto.CategoryDto;
import com.Expense.model.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer>{

	//void save(CategoryDto categoryDto);

}
