<%@page import="omikuji6.dbflute.exentity.Omikuji"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib prefix="f" uri="http://sastruts.seasar.org/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>おみくじ結果</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
	<div class="container">
		<div class="box">
			<p>
				今日の運勢は ${f:h(omikujiEntity.fortuneName)} です<br>
				願い事：${f:h(omikujiEntity.negaigoto)}<br> 商い：
				${f:h(omikujiEntity.akinai)}<br> 学問：
				${f:h(omikujiEntity.gakumon)}
			</p>

		</div>
		<p>おみくじを続けますか？</p>
		<s:link action="omikuji.do">
		<input type="button" value="続ける"/><br>
		</s:link>
 		<div align="right">
		<s:link action="post.do">
		<input type="button" value="郵送"/></s:link>
		</div>

		<s:link action="/stats">過去半年の統計を見る</s:link>
		<s:link action="/list" paramId="birthday" paramProperty="birthday">誕生日の過去半年の結果を見る</s:link>
	</div>
</body>
</html>