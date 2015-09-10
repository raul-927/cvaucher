<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width,initial-scale=1">
		<link rel="shortcut icon" href="<s:url value="/resources"/>/ICO/FaviconCEV.ico" />
		<link rel="stylesheet" type="text/css" href="<s:url value="/resources"/>/css/bootstrap.css">
		<link href="<s:url value="/resources"/>/css/styles.css" rel="stylesheet"/> 
			<title>Vaucher Admin</title>
			<!--[if lt IE 9]>
			<script src="https://oss.maxcdn.com/libs/html5shiv/
			3.7.0/html5shiv.js"></script>
			<script src="https://oss.maxcdn.com/libs/
			respond.js/1.4.2/respond.min.js"></script>
			<![endif]-->
	</head>
	<body>
		<script src="<s:url value="/resources" />/js/jquery.js"></script>
		<script src="<s:url value="/resources" />/js/bootstrap.js"></script>
		
			<div class="col-xs-12 col6 fondo">
				<t:insertAttribute name ="header"/>
			</div>
		
		<div class="container">
			
			<div class="page-header">
				<h1 ><small>Centro Estético</small>Vaucher </h1>
				<t:insertAttribute name ="menu"/>	
				<h2>Nuevo Paciente</h2>
			</div>
			
			<div class="row">
			
				<div class="col-xs-6 col-xs-offset-5 col1">
					<h3>Datos Basicos</h3>
				</div>
					
				<div class="col-xs-6 col-lg-6 col-md-6  col-xs-offset-3 col1">
					<t:insertAttribute name ="left"/>
				</div>	
			</div>

		</div>
		<footer>
			<div>
				<t:insertAttribute name ="footer"/>
			</div>
		</footer>
	</body>
</html>