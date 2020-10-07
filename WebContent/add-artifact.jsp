<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "addArtifactServlet" method="post">
President ID: ${presID}<input type ="hidden" name = "presID" value= "${presID}">
Name:  <input type = "text" name = "label">
Price: <input type = "text" name = "price">
<input type = "submit" value="Add Artifact">
</form> <br />
<a href = "viewAllArtifactsServlet">View the complete database of artifacts</a>
</body>
</html>