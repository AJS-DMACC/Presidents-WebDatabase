<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Edit This PRESIDENT </h2>

<form action = "editPresidentServlet" method="post">
Name: <input type ="text" name = "name" value="${itemToEdit.name}">
Number: <input type = "text" name = "num" value= "${itemToEdit.presidencyNumber}">
<input type = "hidden" name = "id" value="${itemToEdit.id}">
<input type = "submit" value="Save Edited Item">
</form>
</body>
</html>