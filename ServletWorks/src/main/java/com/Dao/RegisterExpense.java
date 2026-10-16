package com.Dao;


import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.model.Expense;
import com.util.DButil;

public class RegisterExpense {
	Scanner sc = new Scanner(System.in);
	private int Id;
	private String userId;
	private BigDecimal amount;
	private String date;
	private int categoryId;
	private String description;

	
	public int addExpnese(){
		int x=0;
		System.out.println("enter your userId: ");
		userId = sc.next();
		
		
		System.out.println("Enter amount: ");
		amount = sc.nextBigDecimal();
		
		sc.nextLine(); 
		
		System.out.println("Enter the date: ");
		date = sc.nextLine();
		
		
		System.out.println("Enter catagory number: ");
		categoryId = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("short description about expense: ");
		description = sc.nextLine();
		
		
		Expense ex = new Expense();
		ex.setUserId(userId);
		ex.setAmount(amount);
		ex.setDate(date);
		ex.setCategoryId(categoryId);
		
		Connection con = new DButil().getConnection();
		
		String query = "insert into expense(userId, amount, date, categoryId, description) values (?,?,?,?,?)";
		try {
			PreparedStatement pr = con.prepareStatement(query);
			pr.setString(1, userId);
			pr.setBigDecimal(2, amount);
			pr.setString(3, date);
			pr.setInt(4, categoryId);
			pr.setString(5, description);
			x = pr.executeUpdate();
			pr.close();
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		

	
		
		return x;
	}
	
	
}
