<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--**********************************
            Content body start
        ***********************************-->

<div class="content-body">

	<div class="container-fluid">
		<div class="row">
			<div class="col-12">
				<div class="card">
					<div class="card-body">
						<h4 class="card-title">Data Table</h4>
						<div class="table-responsive">
							<table
								class="table table-striped table-bordered zero-configuration">
								<thead>
									<tr>
										<th>ID</th>
										<th>NAME</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="u" items="${ulist }">
										<tr>
											<td><a href="user.do?cmd=userdetail&id=${u.id }">${u.id }</a></td>
											<td><a href="user.do?cmd=userdetail&id=${u.id }">${u.name }</a></td>			
										</tr>
									</c:forEach>
								</tbody>

							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- #/ container -->
</div>
<!--**********************************
            Content body end
        ***********************************-->
