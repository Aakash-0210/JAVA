package com.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


//@WebServlet("/ThemeServlet")
public class ThemeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      ServletContext context = null;

    public ThemeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
@Override
public void init(ServletConfig config) throws ServletException {
	context = config.getServletContext();
}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String theme = context.getInitParameter("defaultTheme");
		String requested = request.getParameter("theme");
		if(requested != null && !requested.isEmpty()) {
			theme = requested;
		}
		out.println(theme);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		}

}
