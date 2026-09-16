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
import java.util.ArrayList;



@WebServlet("/TrendingSearchServlet")
public class TrendingSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext context = null;
  
    public TrendingSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
@Override
public void init(ServletConfig config) throws ServletException {
	// TODO Auto-generated method stub
	context = config.getServletContext();
	
	
	
}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
	    		
		ArrayList<String> trending = (ArrayList<String>) context.getAttribute("trendingKeywords");
		
		if(trending == null) {
			trending = new  ArrayList<String>();

			trending.add("iphone 16");
			trending.add("Nike Shoes");
			trending.add("Laptop");
			context.setAttribute("trendingKeywords", trending);
			
			}
	    
	
		if(trending != null) {
			for (String string : trending) {
				out.println("<h2>" + string + "</h2>");
			}
		}
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
