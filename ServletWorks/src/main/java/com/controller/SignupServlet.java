
package com.controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        String error = "";

        // Check empty fields
        if (username == null || username.trim().isEmpty() ||
            email == null || email.trim().isEmpty() ||
            password == null || password.trim().isEmpty()) {

            error = "All fields are required.";

        } else if (password.length() < 6) {
            error = "Password must be at least 6 characters.";

        } else if (!email.contains("@") || !email.endsWith(".com")) {
            error = "Email must contain '@' and end with '.com'.";
        }

        // If validation fails
        if (!error.isEmpty()) {
            request.setAttribute("error", error);
            request.getRequestDispatcher("signup.jsp")
                   .forward(request, response);
            return;
        }

        // If validation succeeds
        response.setContentType("text/html");
        response.getWriter().println("<h2>Signup Successful!</h2>");
        response.getWriter().println("Username: " + username);
        response.getWriter().println("<br>Email: " + email);
    }
}
