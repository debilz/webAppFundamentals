<%@page import="com.ServletJsp.web.model.Alien"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="main.css">
</head>
<body>
<div class="split left">
	<div class="centered text">
		<%  
			Alien a1 = (Alien)request.getAttribute("alien");
			out.println("<span class=\"alienspan\">"+ a1 +"</span>");
		%>
	</div>
</div>
<div class="split right">
	<div class="centered">
		<img src="webPictures/split_right.jpg" alt="">
	</div>
</div>
</body>
</html>