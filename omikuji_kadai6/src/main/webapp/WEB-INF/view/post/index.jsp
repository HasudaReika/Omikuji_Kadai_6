<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>郵送先登録画面</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style3.css">
<script src="https://code.jquery.com/jquery-3.0.0.min.js"></script>
<script src="${pageContext.request.contextPath}/post.js"></script>
</head>
<body>
	<s:form action="/post/submit" method="post">
		<div class="error">
			<html:errors />
		</div>
		<label> 郵便番号 <html:text property="postCode" id="postCode" /><br>
		</label>

		<label> 住所 <html:text property="address" /> 
		<input type="button" value="〒↔︎住所" class="btn" id="address"><br>
		</label>

		<label> 宛名 <html:text property="name" /><br>
		</label>

		<label> 電話番号 <html:text property="phone" /><br>
		</label>

		<label> メールアドレス <html:text property="mail" /><br>
		</label>


		<input type="submit" value="送信" />
	</s:form>

	<s:link href="javascript:history.back()">おみくじの結果に戻る</s:link>

</body>
</html>