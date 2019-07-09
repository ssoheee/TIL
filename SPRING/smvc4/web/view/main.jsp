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
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/data.js"></script>
<script src="https://code.highcharts.com/modules/drilldown.js"></script>
<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=6aa6c11f183d05f3c7006fec6522d483"></script>
<style>
* {
	margin: 0;
	padding: 0;
}

a {
	text-decoration: none;
	color: black;
}

header, nav, section, footer {
	margin: 0 auto;
}

header {
	width: 900px;
	height: 150px;
	background: #B2EBF4;
	text-align: center;
}

nav {
	width: 900px;
	height: 30px;
	background: #D5D5D5;
}

section {
	width: 900px;
	height: 600px;
	background: white;
}

footer {
	width: 900px;
	height: 50px;
	background: #A6A6A6;
}

.center_page {
	margin: 0 auto;
	width: 880px;
	height: 580px;
	background: white;
}

header>h3 {
	line-height: 60px;
}

header>h1 {
	line-height: 50px;
}

nav>a {
	margin: 5px 5px;
}
</style>

</head>
<body>
	<header>

		<h3>
			<c:choose>
				<c:when test="${loginuser != null }">
					<a href="">${loginuser.id} 님</a>
					<a href="logout.mc">LOGOUT</a>
					<a href="aboutus.mc">ABOUT US</a>
				</c:when>
				<c:otherwise>
					<a href="login.mc">LOGIN</a>
					<a href="register.mc">REGISTER</a>
					<a href="aboutus.mc">ABOUT US</a>
				</c:otherwise>
			</c:choose>
		</h3>

		<h1>
			<a href="useradd.mc">USERADD</a> <a href="userlist.mc">USERLIST</a> <a
				href="productadd.mc">PRODUCTADD</a> <a href="productlist.mc">PRODUCTLIST</a>
		</h1>

	</header>
	<nav>
		<c:choose>
			<c:when test="${navi==null }">
				<a href="main.mc">HOME</a>
			</c:when>
			<c:otherwise>
		${navi }
		</c:otherwise>
		</c:choose>
	</nav>
	<section>
		<c:choose>
			<c:when test="${center == null }">
				<jsp:include page="center.jsp"></jsp:include>
			</c:when>
			<c:otherwise>
				<jsp:include page="${center }.jsp"></jsp:include>
			</c:otherwise>
		</c:choose>
	</section>
	<footer></footer>
</body>
</html>