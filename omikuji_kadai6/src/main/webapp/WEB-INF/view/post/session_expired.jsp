<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>セッション切れ</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style3.css">
</head>
<body>
<div class="box">
	<p>セッションが切れました。<br>
	初めからやり直してください。</p>
	<s:link action="omikuji.do">トップに戻る</s:link></div>

</body>
</html>