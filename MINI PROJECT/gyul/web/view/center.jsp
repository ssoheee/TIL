<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<div class ="center_page">
<div class="container">
			<div class="p-b-10">
				<h3 class="ltext-103 cl5">
					PRODUCTS
				</h3>
			</div>

			<div class="row isotope-grid">
				<c:forEach var="p" items ="${plist }">
				<div class="col-sm-6 col-md-4 col-lg-3 p-b-35 isotope-item women">
					<!-- Block2 -->
					<div class="block2">
						<div class="block2-pic hov-img0">
							<a href="product_detail.mc?product_no=${p.product_no }">
							<img src="images/${p.product_picture1 }" alt="IMG-PRODUCT"></a>
						</div>
						<div class="block2-txt flex-w flex-t p-t-14">
							<div class="block2-txt-child1 flex-col-l ">
								<a href="product_detail.mc?product_no=${p.product_no }" class="stext-104 cl4 hov-cl1 trans-04 js-name-b2 p-b-6">
									
									${p.product_nm } 
								</a>
									
								<span class="stext-105 cl3">
									${p.product_price } 원
								</span>
								<span class="stext-105 cl3">
									${p.product_no }
								</span>
							</div>
						</div>

					</div>
				</div>
				</c:forEach>				
	
		
			</div>
		</div>
</div>