<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
			
<div class="row">			
	<div class="col-md-6 col2">			  
		<t:insertAttribute name ="left"/>
	</div>	
	
	<div class ="col-md-6 col2">
		<t:insertAttribute name ="content"/>
	</div>
	<div class="col-md-6 col2">
		<t:insertAttribute name ="right"/>
	</div>	
</div>

		
		