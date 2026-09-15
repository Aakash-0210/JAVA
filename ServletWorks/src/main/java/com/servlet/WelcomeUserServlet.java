package com.servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet("/welcomeuser")
public class WelcomeUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public WelcomeUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	System.out.println("init() method is called");
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	System.out.println("service() method is called");
    	super.service(req, resp);
    	

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1> 'Welcome, User!' ");
//        String name = request.getParameter("MyWebApp");
//        out.println("your are using " + name);
        
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
@Override
public void destroy() {
	// TODO Auto-generated method stub
	System.out.println("destroy() method is called");
	super.destroy();

}

}
