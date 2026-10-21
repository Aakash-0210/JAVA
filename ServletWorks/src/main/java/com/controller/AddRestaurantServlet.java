package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AddRestaurantServlet")
public class AddRestaurantServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private static final String URL =
            "jdbc:mysql://localhost:3306/restaurant_db";
    private static final String USER = "root";
    private static final String PASSWORD = "your_mysql_password";

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        String restaurantName =
                request.getParameter("restaurantName");

        String cuisineType =
                request.getParameter("cuisineType");

        String sql = "INSERT INTO restaurants(restaurant_name, cuisine_type) VALUES (?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(
                        URL, USER, PASSWORD);
                 PreparedStatement ps = con.prepareStatement(sql);
                 PrintWriter out = response.getWriter()
                		 
            		
            ) {

                ps.setString(1, restaurantName);
                ps.setString(2, cuisineType);

                int rows = ps.executeUpdate();

                if (rows > 0) {
                    out.println("<h2>Restaurant added successfully!</h2>");
                    out.println("<p>Name: " + restaurantName + "</p>");
                    out.println("<p>Cuisine: " + cuisineType + "</p>");
                    out.println("<a href='AddRestaurant.jsp'>Add another restaurant</a>");
                } else {
                    out.println("<h2>Failed to add restaurant.</h2>");
                }
            }

        } catch (Exception e) {
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().println(
                    "<h2>Unable to add restaurant. Please try again.</h2>");
        }
    }

  
}
