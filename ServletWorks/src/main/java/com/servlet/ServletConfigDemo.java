package com.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/ServletConfigDemo")
public class ServletConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ServletConfig config = null;
   
    public ServletConfigDemo() {
        super();
        // TODO Auto-generated constructor stub
    }
@Override
public void init(ServletConfig config) throws ServletException {
	this.config = config;
}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String genra = config.getInitParameter("defaultGenre");
		out.println("<h1>user default genra is " + genra);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
