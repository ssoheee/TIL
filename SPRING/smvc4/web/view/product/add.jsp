<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="center_page">
<h1>Product Add Page</h1>

<form enctype="multipart/form-data" action="productaddimpl.mc" method="POST">
NAME <input type="text" name="name"><br>
PRICE <input type="number" name="price"><br>
IMG <input type="file" name="mf"><br>
<input type="submit" value="REGISTER"><br>
</form>
</div>