<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
</head>
<body>
<h1>Product Add Page</h1>
<form action="req?type=product&cmd=addimpl" method="POST" enctype="multipart/form-data"> <!-- 이래야지만 "파일"이 서버로 전송된다 -->
NAME <input type="text" name="name"><br>
PRICE <input type="number" name="price"><br>
IMG <input type="file" name="imgname"><br>
<input type="submit" value="REGISTER"><br>
</form>
</body>
</html>