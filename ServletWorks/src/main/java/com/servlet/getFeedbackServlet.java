package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/getFeedbackServlet")
public class getFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 public getFeedbackServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String userName = request.getParameter("userName");
		 String orederId = request.getParameter("order_Id");
		 String feedback = request.getParameter("feedback");

		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 if(userName.isBlank() ) {
			 out.println("fileds should not be empty");
		 }else {
			 out.println("<h3> Name is :" + userName);
			 out.println("<h3> Order Id is :" + orederId);
			 out.println("<span> feedback is :" + feedback);
		 }
		 
	}

}
