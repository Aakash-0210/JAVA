<%@page import="com.model.Product2"%>
<%@ page import="java.util.List, com.model.Product" %>

<!DOCTYPE html>
<html>
<head>
    <title>Product List</title>
</head>
<body>


    <h2>Product List</h2>
    <%
    String error = (String) request.getAttribute("error");

    if (error != null) {
%>
    <p style="color: red; font-weight: bold;">
        <%= error %>
    </p>
<%
    } else {
%>
    <!-- Your existing product table goes here -->
<%
    }
%>

    <table border="1" cellpadding="10">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
        </tr>

        <%
            List<Product2> products2 =
                (List<Product2>) request.getAttribute("products2");

            if (products2 != null) {
                for (Product2 p : products2) {
        %>
            <tr>
                <td><%= p.getId() %></td>
                <td><%= p.getName() %></td>
                <td><%= p.getPrice() %></td>
            </tr>
        <%
                }
            }
        %>
    </table>

</body>
</html>