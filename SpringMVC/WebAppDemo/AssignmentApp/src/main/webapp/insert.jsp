<%@page import="in.mindcraft.AddLaptopServlet,org.hibernate.Query,org.hibernate.Session,java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>====================================================================</h1>
	<br>
	<%	
		int Id = (int)session.getAttribute("Id");
		String Make = (String)session.getAttribute("Make");
		int Cost = (int)session.getAttribute("Cost");
		out.println("Record:<br>");
		out.println("Laptop Id: "+Id+"<br>Laptop Make: "+Make+"<br>Laptop Cost: "+Cost+"<br>");
		out.println("<br>Inserted Successfully<br>");
	%>
	<br><input type="button" value="Add New" onclick="window.history.go(-1)">
</body>
</html>