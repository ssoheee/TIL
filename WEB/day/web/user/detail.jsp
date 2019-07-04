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
				location.href = "user.do?cmd=delete&id=${ud.id}";
			}
		});
		$('button:eq(1)').click(function() {
			location.href = "user.do?cmd=userupdate&id=${ud.id}";
		});
	});
</script>
</head>
<body>
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
										<th>PWD</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>${ud.id }</td>
										<td>${ud.name }</td>
										<td>${ud.pwd }</td>
									</tr>
									<tr>
										<td></td>
										<td><div class="form-group row">
												<div class="col-lg-8 ml-auto">
													<button class="btn btn-primary">DELETE</button>
												</div>
											</div></td>
										<td><div class="form-group row">
												<div class="col-lg-8 ml-auto">
													<button class="btn btn-primary">UPDATE</button>
												</div>
											</div></td>
									</tr>
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
</body></html>