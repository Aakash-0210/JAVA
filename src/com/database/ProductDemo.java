package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ProductDemo {
public static void main(String[] args) {
	 String url = "jdbc:mysql://localhost:3306/SpotifyDB";
     String username = "root";
     String password = "aakash7654";
     String sql = "SELECT name, price FROM products WHERE category = ?";
    
try {
	  Connection con = DriverManager.getConnection(
              url, username, password
          );

          PreparedStatement ps = con.prepareStatement(sql);
          Scanner sc = new Scanner(System.in);
          String category = sc.nextLine();
          System.out.println("Enter you category");
          ps.setString(1, category);

          ResultSet rs = ps.executeQuery();
          System.out.println("Proudct name | " + "Price" );
          System.out.println("------------------------------");
          while(rs.next()) {
        	  String name = rs.getString("name");
              double price = rs.getDouble("price");
        	  
        	  System.out.println(name  + " |  " + price);
          }
          rs.close();
          ps.close();
          con.close();
          sc.close();
          String allOrders = "SELECT * FROM products ORDER BY ID LIMIT ? OFFSET ?";
          
          
          PreparedStatement fetchData = con.prepareStatement(allOrders);
          int limit = 5;
          fetchData.setInt(1, limit);
          int pageNumber = 1;
          int offSet = (pageNumber - 1) * limit;
          fetchData.setInt(2, offSet);
          ResultSet result = fetchData.executeQuery();
          while(result.next()) {
        	  System.out.println(result.getInt("Id"));
        	  System.out.println(result.getString("name"));
          }

          String sortBy = "Price";
          PreparedStatement ascOrder = con.prepareStatement(
        		  "SELECT * FROM Orders ORDER BY" +sortBy + "ASC"
        		  );
          
          ResultSet row = ascOrder.executeQuery();

	
} catch (Exception e) {
	// TODO: handle exception
}
}
}
