<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib prefix="f" uri="http://sastruts.seasar.org/functions" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>おみくじ占い</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

</head>
<body>
	<div class="container">
	<h1>おみくじ占い</h1>
	<s:form action="/omikuji" method="post">
	
	<div class="error"><html:errors/></div>
		<p>
			誕生日を入力してください 例:20011009<br>
			 <html:text property="birthday"/><br>
			 <s:submit property="submit" value="送信"/>
		</p>
	</s:form>
	</div>
</body>
</html>