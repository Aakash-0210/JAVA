<!DOCTYPE html>
<html>
<head>
    <title>Signup Form</title>
</head>
<body>
<%
    String error = (String) request.getAttribute("error");
    if (error != null) {
%>
    <p style="color: red; font-weight: bold;"><%= error %></p>
<%
    }
%>
    <h2>Signup Form</h2>

    <form action="SignupServlet" method="post">

        Username: <input type="text" name="username" required>
        <br><br>

        Email: <input type="email" name="email" required>
        <br><br>

        Password: <input type="password" name="password" required>
        <br><br>

        <input type="submit" value="Sign Up">

    </form>

</body>
</html>