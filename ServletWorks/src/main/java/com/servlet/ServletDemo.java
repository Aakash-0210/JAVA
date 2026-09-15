package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/*
Request URL
https://www.myntra.com/shop/women
Request method
GET
Status code
200 OK



flow digram
Browser
   ↓
HTTP Request
   ↓
Tomcat
   ↓
Servlet
   ↓
JDBC
   ↓
MySQL
   ↓
JDBC
   ↓
Servlet
   ↓
HTTP Response
   ↓
Browser

User → Browser: The user selects a movie, theatre, show time, and seats on the booking page, then clicks Book.
Browser → Java Servlet: The browser sends the booking details to the Java Servlet using an HTTP request (for example, a POST request).
Servlet → Database: The Servlet receives the data, validates it, and uses JDBC to connect to the database and save the booking details, such as movie, show, seat, and user information.
Database → Servlet → Browser: The database sends the result back to the Servlet. The Servlet then sends a response to the browser, such as “Ticket booked successfully” along with the booking details.


| Static                    | Dynamic                        |
| ------------------------- | ------------------------------ |
| Content is mostly fixed   | Content can change             |
| Usually HTML/CSS/JS files | Can use server-side code       |
| No database required      | Often uses a database          |
| Same content for users    | Can show different content     |
| Simple websites           | Applications/web apps          |
| Portfolio, landing page   | Amazon, Flipkart, banking apps |





*/

@WebServlet("/search")
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public ServletDemo() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String query = request.getParameter("query");
	       response.setContentType("text/html");
	       PrintWriter out = response.getWriter();
	       out.println("<h1>Search Results");
	       out.println("<p>You searched for: " + query + "</p>");
	}

}
