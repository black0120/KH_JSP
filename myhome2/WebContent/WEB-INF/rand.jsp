<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>랜덤 값 생성</title>
</head>
<body>
	<h1>지정된 범위의 랜덤값 6개 생성</h1>
	<form action="./random" method="post">
		<input type="number" name="min" value="0" placeholder="최소값"> ~
		<input type="number" name="max" value="9" placeholder="최대값">
		<button type="submit">생성</button>
	</form>
</body>
</html>