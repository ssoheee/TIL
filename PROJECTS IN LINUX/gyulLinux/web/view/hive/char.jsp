<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/data.js"></script>
<script src="https://code.highcharts.com/modules/drilldown.js"></script>
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>

	function makeChart(data) {
		// Create the chart
		Highcharts.chart('container', {
		    chart: {
		        type: 'column'
		    },
		    title: {
		        text: 'PRODUCT LOG'
		    },
		    subtitle: {
		        text: '<상품별 클릭 횟수> '
		    },
		    xAxis: {
		        type: 'category'
		    },
		    yAxis: {
		        title: {
		            text: '클릭 횟수'
		        }

		    },
		    legend: {
		        enabled: false
		    },
		    plotOptions: {
		        series: {
		            borderWidth: 0,
		            dataLabels: {
		                enabled: true,
		                format: '{point.y:.1f}'
		            }
		        }
		    },

		    tooltip: {
		        headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
		        pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b>{point.y:.2f}%</b> of total<br/>'
		    },
		    
		    series:[{ data : data }]
		  
		});
	};
	function getData(){
	
		$.ajax({
			url :'chart.mc',
			success : function(data){
				
				alert(typeof(data));
				
				alert(data);
				makeChart(eval(data));
			}
		});
	};
	$(document).ready(function() {
	
		getData();
		
	
	});
</script>
</head>

<body>
	<div id="container"
		style="min-width: 310px; height: 400px; margin: 0 auto"></div>


</body>
</html>