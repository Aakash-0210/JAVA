package com.controller;

import com.Dao.RegisterExpense;

public class ExpenseController {

	
	public ExpenseController(){
		RegisterExpense registerExpense = new RegisterExpense();
		int x = registerExpense.addExpnese();
		if(x > 0) {
			System.out.println("Expense add to wallet");
		} else {
			System.out.println("Error while adding expense to wallet");
		}
	}
	
	public static void main(String[] args) {
		
		ExpenseController controller = new ExpenseController();
	}
	
}


