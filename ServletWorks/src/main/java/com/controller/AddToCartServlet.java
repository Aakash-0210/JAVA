package com.controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AddToCartServlet")
public class AddToCartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String item = request.getParameter("item");

        if (item == null || item.trim().isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST,
                               "Item is required");
            return;
        }

        String cart = "";

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("cart".equals(cookie.getName())) {
                    cart = cookie.getValue();
                    break;
                }
            }
        }

        // Append the newly selected item.
        if (cart.isEmpty()) {
            cart = item;
        } else {
            cart = cart + "," + item;
        }

        Cookie cartCookie = new Cookie("cart", cart);

        // Keep the cookie for 10 minutes.
        cartCookie.setMaxAge(10 * 60);

        // Make the cookie available throughout this application.
        cartCookie.setPath(request.getContextPath().isEmpty()
                ? "/" : request.getContextPath());

        response.addCookie(cartCookie);

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(
            "<h2>Item added to cart: " + item + "</h2>"
        );
        response.getWriter().println(
            "<a href='viewCart.jsp'>View Cart</a>"
        );
    }
}
