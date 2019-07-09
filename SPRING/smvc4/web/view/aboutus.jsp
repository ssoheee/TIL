<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script>
	function chart1(pdata) {
		Highcharts
				.chart(
						'container',
						{
							chart : {
								type : 'column'
							},
							title : {
								text : 'The price of Our Products'
							},
							xAxis : {
								type : 'Products'
							},
							yAxis : {
								title : {
									text : 'Price'
								}

							},
							legend : {
								enabled : false
							},
							plotOptions : {
								series : {
									borderWidth : 0,
									dataLabels : {
										enabled : true,
										format : '{point.y:.1f}'
									}
								}
							},

							tooltip : {
								headerFormat : '<span style="font-size:11px">{series.name}</span><br>',
								pointFormat : '<span style="color:{point.color}">{point.name}</span>: <b>{point.y:.2f}%</b> of total<br/>'
							},

							series : [ {
								name : "Products",
								colorByPoint : true,
								data : pdata
							} ],

						});
	}; // end

	$(document).ready(function() {
		$.ajax({
			url : "pdata.mc",
			success : function(pdata) {
				chart1(pdata);
			}
		})
	});
</script>


<div class="center_page">
	<h1>ABOUT US</h1>
	<div id="container"
		style="min-width: 310px; height: 400px; margin: 0 auto"></div>
</div>