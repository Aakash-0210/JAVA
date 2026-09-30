<%@ page session="true" %>

<%
    String username =
        (String) session.getAttribute("username");

    if (username == null) {
        response.sendRedirect("login.html");
        return;
    }
%>

<!DOCTYPE html>
<html>
<body>
    <h2>Welcome, <%= username %>!</h2>

    <p>You have successfully logged in.</p>
</body>
</html>