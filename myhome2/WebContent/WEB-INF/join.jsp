<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action="./join" method="post">
		<div>
			<label for="id">아이디</label>
			<input type="text" name="id" id="id" value="userid" required>
		</div>
		<div>
			<label for="pw">패스워드</label>
			<input type="text" name="pw" id="pw" value="userpw" required>
		</div>
		<div>
			<label for="pwc">패스워드 확인</label>
			<input type="text" name="pwc" id="pwc" value="userpw" required>
		</div>
		<div>
			<label for="email">이메일</label>
			<input type="email" name="email" id="email" value="email@user.com" required>
		</div>
		<button type="submit">회원가입</button>
	</form>
</body>
</html>