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
		$('input[type="button"]').click(function() {
			$('#r_form').attr('method', 'POST');
			$('#r_form').attr('action', 'user.do?cmd=updateimpl'); // cmd를 add라고 하면 add 페이지로 가므로 addimpl이라고 새로 붙임
			$('#r_form').submit();

		});
	});
</script>
</head>
<body>
	<div class="content-body">

		<!-- row -->

		<div class="container-fluid">
			<div class="row justify-content-center">
				<div class="col-lg-12">
					<div class="card">
						<div class="card-body">
							<div class="form-validation">
								<form class="form-valide" id="r_form">
									<div class="form-group row">
										<label class="col-lg-4 col-form-label" for="val-userid">
											ID <span class="text-danger">*</span>
										</label>
										<div class="col-lg-6">
										
											<input readonly value="${uu.id }" type="text"
												class="form-control" id="val-userid" name="val-userid"
												placeholder="Enter a user id..">
										</div>
									</div>
									<div class="form-group row">
										<label class="col-lg-4 col-form-label" for="val-username">
											NAME <span class="text-danger">*</span>
										</label>
										<div class="col-lg-6">
											<input value="${uu.name }" type="text" class="form-control"
												id="val-username" name="val-username"
												placeholder="Enter a new name..">
										</div>
									</div>
									<div class="form-group row">
										<label class="col-lg-4 col-form-label" for="val-password">
											PASSWORD <span class="text-danger">*</span>
										</label>
										<div class="col-lg-6">
											<input value="${uu.pwd }" type="password"
												class="form-control" id="val-password" name="val-password"
												placeholder="Enter a new password..">
										</div>
									</div>

									<div class="form-group row">
										<div class="col-lg-8 ml-auto">
											<input type="button" value="UPDATE" class="btn btn-primary">
										</div>
									</div>
								</form>
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
</body>
</html>