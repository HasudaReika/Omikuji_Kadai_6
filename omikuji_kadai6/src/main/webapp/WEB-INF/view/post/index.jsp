<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>住所入力画面</title>
</head>
<body>
	<label>
	郵便番号
	<input type="text" name="postCode"/><br>
	</label>
	
	<label>
	住所
	<input type="text" name="address"/><br>
	</label>
	
	<label>
	宛名
	<input type="text" name="name"/><br>
	</label>
	
	<s:link action="submit.do">
	<input type="submit" value="送信"/>
	</s:link>
	
</body>
</html>