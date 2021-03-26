<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 결과</title>
</head>
<body>
	<h1>회원가입이 완료되었습니다.</h1>
	<p>id : <%=request.getParameter("id")%></p>
	<p>pw : <%=request.getParameter("pw")%></p>
	<p>email : <%=request.getParameter("email")%></p>
</body>
</html>