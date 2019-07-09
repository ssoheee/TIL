<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="center_page">
	<h1>User List Page</h1>
	<table>
		<tbody>
			<c:forEach var="u" items="${ulist }">
				<tr>
					<td><h4><a href="userdetail.mc?id=${u.id }">${u.id }</a> ${u.name }</h4></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>