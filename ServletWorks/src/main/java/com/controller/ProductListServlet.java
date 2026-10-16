
package com.controller;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;
import com.model.Product2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ProductListServlet")
public class ProductListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        List<Product2> products = new ArrayList<>();
        String name = request.getParameter("name");

        String url = "jdbc:mysql://localhost:3306/shopdb";
        String dbUser = "root";
        String dbPassword = "your_password";

        String sql;

        if (name != null && !name.trim().isEmpty()) {
            sql = "SELECT id, name, price FROM products "
                + "WHERE LOWER(name) LIKE ?";
        } else {
            sql = "SELECT id, name, price FROM products";
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con =
                     DriverManager.getConnection(url, dbUser, dbPassword);
                 PreparedStatement ps = con.prepareStatement(sql)) {

                if (name != null && !name.trim().isEmpty()) {
                    ps.setString(1, "%" + name.trim().toLowerCase() + "%");
                }

                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        Product2 p = new Product2(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getDouble("price")
                        );

                        products.add(p);
                    }
                }
            }

            request.setAttribute("products", products);

        } catch (SQLException | ClassNotFoundException e) {
            request.setAttribute(
                "error",
                "Sorry, we could not find the products. Please try again later."
            );
        }

        request.getRequestDispatcher("products.jsp")
               .forward(request, response);
    }
}
