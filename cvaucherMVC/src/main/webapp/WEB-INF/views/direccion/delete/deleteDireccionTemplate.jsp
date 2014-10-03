<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

  <head>
    <title>CVaucher</title>
    <link href="<s:url value="/resources" />/css/AltaCategorias.css" 
          rel="stylesheet" 
          type="text/css" />
   	<link rel="shortcut icon" href="<s:url value="/resources" />/ICO/FaviconCEV.ico" />
  </head>

  <body>
    <div id ="PrincipalAltaTipoCategorias">
    	 <div id="content1">
    		<t:insertAttribute name="content1" />
      	</div>
      	<div id="form">
       		<t:insertAttribute name = "formDireccionDelete"/>
      	</div>
      	<div id ="table">
      		<t:insertAttribute name ="tableDireccion"/>
      	</div>
     </div> 
  </body>

