<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%=request.getParameter("min")%> ~ <%=request.getParameter("max")%> 까지의 RANDOM 값 출력</h1>
	<%
		ArrayList<Integer> res = (ArrayList)request.getAttribute("randlist");
	%>
	<% for(int v: res) { %>
		<span><%=v %></span>
	<% } %>
</body>
</html>