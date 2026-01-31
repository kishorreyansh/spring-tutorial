<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>Model Page View</h1>
	<%
		String name = (String)request.getAttribute("name");
		String team = (String)request.getAttribute("iplteam");
		List<String> players = (List<String>)request.getAttribute("players");
	%>
	<h1><%= name %> plays for <%= team %></h1>
	
	<h2> Players:</h2>
	<% 
		for(String p: players){
	%>
	<h2> Player Names: <%= p %></h2>
	<%	
		}
	%>
	
</body>
</html>