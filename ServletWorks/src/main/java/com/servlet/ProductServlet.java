package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String productId = request.getParameter("productId");

        if (productId == null || productId.isEmpty()) {

response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            out.println("<h1>Product not found</h1>");

        } else {

            response.setStatus(HttpServletResponse.SC_OK);

            out.println("<h1>Product details for " + productId + "</h1>");
        }
    }
}