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
		 
		<link href="<s:url value="/resources"/>/css/bootstrap.css" 	rel="stylesheet"/>
		<link href="<s:url value="/resources"/>/css/styles.css" 	rel="stylesheet"/> 
		<link href="<s:url value="/resources"/>/css/cevaucher.css" 	rel="stylesheet"/>
		<link href="<s:url value="/resources"/>/AdminLTE-2.3.11/plugins/fullcalendar/fullcalendar.min.css"rel="stylesheet"/>
		<link href="<s:url value="/resources"/>/AdminLTE-2.3.11/plugins/fullcalendar/fullcalendar.min.css"rel="stylesheet"/>
		<link href="<s:url value="/resources"/>/AdminLTE-2.3.11/dist/css/AdminLTE.min.css"rel="stylesheet"/>
		<link href="<s:url value="/resources"/>/AdminLTE-2.3.11/dist/css/skins/_all-skins.min.css"rel="stylesheet"/>
		<!-- Font Awesome -->
  		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  		<!-- Ionicons -->
  		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
			
			<!-- fullCalendar 2.2.5-->
  		
  		<link href="<s:url value="/resources"/>/AdminLTE-2.3.11/plugins/fullcalendar/fullcalendar.print.css" media="print">
  		<!-- Theme style -->
  		
  		<!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  		
  
			<title>Vaucher Admin</title>
			<!--[if lt IE 9]>
			<script src="https://oss.maxcdn.com/libs/html5shiv/
			3.7.0/html5shiv.js"></script>
			<script src="https://oss.maxcdn.com/libs/
			respond.js/1.4.2/respond.min.js"></script>
			<![endif]-->
	</head>
	<body>
		<script src="<s:url value="/resources" />/js/csvaucher.js"></script>
		<script src="<s:url value="/resources" />/js/jquery.js"></script>
		<script src="<s:url value="/resources" />/js/bootstrap.js"></script>
		
		<div class="col-xs-12 col6 fondo">
			<t:insertAttribute name ="header"/>
		</div>
		<div class="container">
			<header class="page-header">
				<h1 ><small>Centro Estético</small>Vaucher </h1>
				<t:insertAttribute name ="menu"/>	
			</header>
			<div class="tabbable">
				<ul class="nav nav-tabs">
					<li class="active"><a href ="#Pacientes" data-toggle="tab"><h3>Pacientes</h3></a></li>
					<li><a href="#Agenda" data-toggle="tab"><h3>Agenda</h3></a></li>
				</ul>
				<div class="tab-content">
					<div class="tab-pane active" id="Pacientes">
						<div class="row">
					  		<div class="col-xs-10 col-sm-12 col-md-6 col-lg-6">
								<t:insertAttribute name ="left"/>
							</div>
							
							 <div class="col-xs-10 col-sm-12 col-md-12 col-lg-12">
								<t:insertAttribute name ="content"/>
							</div>
							
							<div class="col-xs-10 col-sm-12 col-md-4 col-lg-4">
								<t:insertAttribute name ="right"/>
							</div>
						</div>
					</div>
					<div class="tab-pane" id="Agenda">
						<div class="tab-pane active" id="Calendario">
						<div class="row">
							<div >
								<t:insertAttribute name ="calendario"/>
							</div>
						</div>
					</div>
					</div>
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