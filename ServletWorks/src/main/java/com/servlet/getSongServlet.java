package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/getSongServlet")
public class getSongServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public getSongServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String songName = request.getParameter("songName");
	 String artist = request.getParameter("artist");

	 response.setContentType("text/html");
	 PrintWriter out = response.getWriter()
;
	 out.println("<h1>song you searched for : " + songName + " by  " + artist);
	 }

	
}
