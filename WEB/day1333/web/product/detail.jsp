<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$('button:eq(0)').click(function() {
			var c = confirm('삭제 하시겠습니까?');
			if (c == true) {
				location.href ='req?type=product&cmd=delete&id=${pd.id}';
			}
		});
		$('button:eq(1)').click(function() {
			var c = confirm('업데이트 하시겠습니까?');
			if (c == true) {
			location.href = 'req?type=product&cmd=update&id=${pd.id}';
			}
		});
	});
</script>
</head>
<body>
	<h1>Product Detail Page</h1>
	<button>DELETE</button>
	<button>UPDATE</button>
	
	<h5>${pd.id }</h5>
	<h5>${pd.name }</h5>
	<h5>${pd.price }</h5>
	<h5>${pd.regdate }</h5>
	<img src="img/${pd.imgname }">
	
</body>
</html>