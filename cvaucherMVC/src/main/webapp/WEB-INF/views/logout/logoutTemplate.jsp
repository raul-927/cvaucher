<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags" %>
<%@ page session="false" %>

  <head>
    <title>CVaucher</title>
    <link href="<s:url value="/resources" />/css/layout.css" 
          rel="stylesheet" 
          type="text/css" />
   	<link rel="shortcut icon" href="<s:url value="/resources" />/ICO/FaviconCEV.ico" />
  </head>

  <body>
  	<t:insertAttribute name ="formLogout"/>
    <t:insertAttribute name ="content"/>
  </body>

