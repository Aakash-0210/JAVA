package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class OrderSummaryServlet
 */
@WebServlet("/OrderSummaryServlet")
public class OrderSummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderSummaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		request.setAttribute("itemName", "Laptop");
		request.setAttribute("quantity", 2);
		request.setAttribute("price", 50000);
		request.getRequestDispatcher("orderSummary.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		// TODO Auto-generated method stub
	
		
		/*
  **JSP:** Uses `${username}` or `<%= username %>` to display dynamic content on the **server side**.
- **React:** Uses JSX syntax like `{username}` inside components to render dynamic content.
- **Data flow:** JSP usually gets data from a **Servlet/request**, while React gets data through **props and state**.
- **Use case:** JSP is commonly used for **server-rendered pages**, while React is mainly used for **interactive, component-based UIs**.
				
		*/
	}

}
