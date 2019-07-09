<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="center_page">
	<h1>Product Detail Page</h1>
<h1>${productdetail.id }</h1>
<h1>${productdetail.name }</h1>
<h1>${productdetail.price }</h1>
<h1>${productdetail.regdate }</h1>
<img src="img/${productdetail.imgname }"><br>
<a href="productdelete.mc?id=${productdetail.id }">DELETE</a>
<a href="productupdate.mc?id=${productdetail.id }">UPDATE</a>
</div>