<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="p1" class="com.model.Product">
</jsp:useBean>

<jsp:setProperty property="price" name="p1" param="price"/>
<jsp:setProperty property="name" name="p1" param="name"/>


<p>Name: ${p1.name}</p>
<p>Price: ${p1.price}</p>

 
</body>
</html>