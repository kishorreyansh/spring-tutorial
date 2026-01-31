<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h3>Model And View Page Concept</h3>
	<%
		String name = (String)request.getAttribute("name");
		String team = (String)request.getAttribute("iplteam");
	%>
	<h1><%= name %> plays for <%= team %></h1>
</body>
</html>