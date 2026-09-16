package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/MovieLoginServlet")
public class MovieLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MovieLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("password");

		String username = "aakash";
		String password = "aakash1234";
		if(userName.equals(username) && userPassword.equals(password)) {
			response.sendRedirect("MovieDashboardServlet");
			
		}
	}

}
