package com.Expense.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Expense.dto.ExpenseDto;
import com.Expense.model.Category;
import com.Expense.model.Expense;
import com.Expense.service.IExpenseService;


@RestController
@RequestMapping("/expense")
public class ExpenseController {
	
@Autowired
private IExpenseService expenseService;



/**
 * Method used for add Expense 
 * @param object 
 * @return status string
 */ 

@PostMapping("/addExpense")
public ResponseEntity<?> addExpense(@RequestBody ExpenseDto expenseDto)
{
	System.err.println("in controller");
	return new ResponseEntity<String>(expenseService.addExpense(expenseDto),HttpStatus.OK);
	}
	
/**
 * Method is used to find monthy expense
 * @param List of object
 * @return
 */

@GetMapping("/getMonthyExpense")
public ResponseEntity<List<Object>> getListOfExpenses (){
	return new ResponseEntity<List<Object>>(expenseService.getListOfExpenses(),HttpStatus.OK);
}



/**
 * Method used to fetch ExpenseList 
 * @param No any parameter pass
 * @return Expense List
 */

@GetMapping("/getExpenses")
public ResponseEntity<List<Expense>> getAllExpenses(){
	return new ResponseEntity<List<Expense>>(expenseService.getAllExpenses(),HttpStatus.OK);	
}


}





