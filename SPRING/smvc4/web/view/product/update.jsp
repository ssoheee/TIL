<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="center_page">
<h1>User Update Page</h1>

<form action="userupdateimpl.mc" method="POST">
ID<input type="text" name="id" value="${userupdate.id }"><br>
PWD<input type="password" name="pwd" value="${userupdate.pwd }"><br>
NAME<input type="text" name="name" value="${userupdate.name }"><br>
<input type="submit" value="UPDATE"><br>
</form>
</div>