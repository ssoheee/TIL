<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="center_page">
<h1>Product List Page</h1>
	<table>
		<tbody>
			<c:forEach var="p" items="${plist }">
				<tr>
					<td><h4><a href="productdetail.mc?id=${p.id }">${p.id }</a> ${p.name }</h4></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>