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
<form method = "post" action = "navigationServlet">


<table>
<c:forEach items="${requestScope.allPresidents}" var="currentitem">
<tr>
 <td><input type="radio" name="id" value="${currentitem.id}"></td>
 <td>${currentitem.presidencyNumber}</td>
 <td>${currentitem.name}</td>
 </tr>
</c:forEach>
</table>
<br>
<hr>
<input type = "submit" value = "edit" name="doThisToItem"> <br>
<input type = "submit" value = "delete" name="doThisToItem"> <br>
<input type = "submit" value = "add artifact for this President" name = "doThisToItem"> <br>
<input type = "submit" value = "view President Artifacts" name = "doThisToItem">
</form>
<a href="index.html">Add a president</a>
</body>
</html>