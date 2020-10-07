<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Artifact List</title>
</head>
<body>
<h2>Table of Artifacts</h2>
<table border="1"> 
<tr><td>ID</td><td>Price</td><td>Name of Artifact</td><td>Presidents name</td> </tr>
 
<c:forEach items="${requestScope.allArtifacts}" var="currentArtifact">
<tr>
 <td>${currentArtifact.id}</td>
 <td>${currentArtifact.price}</td>
 <td>${currentArtifact.label}</td>
 <td>${currentArtifact.president.name}</td>
 </tr>
</c:forEach>
</table>


<a href = "viewAllPresidentsServlet">View the complete database of presidents</a>
</body>
</html>