<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit a artifact</title>
</head>
<body>
<form action = "editArtifactServlet" method="post">
President Name:<input type = "hidden" name = "id" value = ${artifactToEdit.president.id }>
Artifact Name <input type = "text" name = "num" value= "${artifactToEdit.label}">
<input type = "hidden" name = "id" value="${itemToEdit.id}">
<input type = "submit" value="Save Edited Item">
</form>
</body>
</html>