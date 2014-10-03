<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

  <head>
    <title>CVaucher</title>
    <script type="text/javascript" src="<s:url value="/resources" />/js/tabs.js"></script>
    
    <link href="<s:url value="/resources" />/css/layout.css" 
          rel="stylesheet" 
          type="text/css" />
   	<link rel="shortcut icon" href="<s:url value="/resources" />/ICO/FaviconCEV.ico" />
  </head>

  <body>
  	<article class ="tabs">
  		<div class ="panels">
  			<div class ="panel">
  			
  			<input id ="one" name ="tabs" type ="radio">
  			<label for ="one">Tab One</label>
  			
  			<input id ="two" name ="tabs" type ="radio">
  			<label for ="two">Tab Two</label>
  			
  			<input id ="three" name ="tabs" type ="radio">
  			<label for ="three">Tab Three</label>
  			
  			<input id ="four" name ="tabs" type ="radio">
  			<label for ="four">Tab Four</label>
  			
  			
  			
  				<h2>Este es el panel 1</h2>
  				<span>Double-click the center of the headlight
						group to enter isolation mode. Click to
						select the white shape and drag it so that
						its visually centered on the other shapes.
						Choose Select  Deselect.</span>
  			</div>
  			
  			<div class ="panel">
  				<h2>Este es el panel 2</h2>
  				<span>Double-click the center of the headlight
						group to enter isolation mode. Click to
						select the white shape and drag it so that
						its visually centered on the other shapes.
						Choose Select  Deselect.</span>
  			</div>
  			<div class ="panel">
  				<h2>Este es el panel 3</h2>
  				<span>Double-click the center of the headlight
						group to enter isolation mode. Click to
						select the white shape and drag it so that
						its visually centered on the other shapes.
						Choose Select  Deselect.</span>
  			
  			</div>
  			
  			<div class ="panel">
  				<h2>Este es el panel 4</h2>
  				<span>Double-click the center of the headlight
						group to enter isolation mode. Click to
						select the white shape and drag it so that
						its visually centered on the other shapes.
						Choose Select  Deselect.</span>
  			
  			</div>
  		
  		</div>
  	
  	</article>
  
  </body>

