<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script>
	$(document).ready(function() {
		var container = document.getElementById('map');
		var options = {
			center : new kakao.maps.LatLng(33.450701, 126.570667),
			level : 3
		};
		var map = new kakao.maps.Map(container, options);
	});
</script>

<body>
	<div class="center_page">
		<h1>REGISTER PAGE</h1>
		<div id="map" style="width: 500px; height: 400px;"></div>
	</div>
</body>