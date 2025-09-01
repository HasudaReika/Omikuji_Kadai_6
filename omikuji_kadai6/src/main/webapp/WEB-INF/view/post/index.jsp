<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>郵送先登録画面</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style3.css">
</head>
<body>
	<s:form action="post">
		<label> 郵便番号 <input type="text" name="postCode" /><br>
		</label>

		<label> 住所 <input type="text" name="address" /><br>
		</label>

		<label> 宛名 <input type="text" name="name" /><br>
		</label>

		<label> 電話番号 <input type="number" name="phone" /><br>
		</label>

		<label> メールアドレス <input type="email" name="mail" /><br>
		</label>


		<input type="submit" name="submit" value="送信" />
	</s:form>

	<s:link href="javascript:history.back()">おみくじの結果に戻る</s:link>

</body>
</html>