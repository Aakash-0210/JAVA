
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Restaurant</title>
</head>
<body>

    <h2>Add a Restaurant</h2>

    <form action="result" method="post">

        <label>Restaurant Name:</label>
        <input type="text" name="restaurantName" required>
        <br><br>

        <label>Cuisine Type:</label>
        <input type="text" name="cuisineType"
               placeholder="e.g. Indian, Chinese" required>
        <br><br>

        <button type="submit">Add Restaurant</button>

    </form>

</body>
</html>
