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
<script src="${pageContext.request.contextPath}/js/post.js"></script>
</head>
<body>

	<s:form action="/post/submit" method="post">
		<h1>郵送先を入力してください</h1>
		<div class="error">
			<html:errors />
		</div>
		<label> 郵便番号 <input type="text" id="postCode"
			styleId="postCode" autocomplete="postal-code" /><br>
		</label>

		<label> 住所 <input type="text" id="address" styleId="address"
			autocomplete="street-address" /> 
			<input type="button" value="〒↔︎住所" class="btn" id="addressBtn"><br>
		</label>
		<div id="dropdown"></div>

		<label> 宛名 <input type="text" id="name" autocomplete="name" /><br>
		</label>

		<label> 電話番号 <input type="text" id="phone" autocomplete="tel" /><br>
		</label>

		<label> メールアドレス <input type="text" id="mail"
			autocomplete="email" /><br>
		</label>


		<input type="submit" value="送信" />
		<div style="text-align: right">
			<s:link href="javascript:history.back()">おみくじの結果に戻る</s:link>
		</div>
	</s:form>



</body>
</html>