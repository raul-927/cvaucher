<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ page session="false" %>

<div class="col-lg-12 col-lg-offset-6">
	<sf:form cssClass = "form-horizontal" 
		method ="POST" 
		commandName ="caja" >
		
		<input type="hidden" name="_flowExecutionKey" 
             value="${flowExecutionKey}"/>
             <legend class ="">&nbsp;<h2>CAJA CERRADA</h2>&nbsp;</legend>
        <div class="well">
        	<h4 class ="error"> 
        		<span>Para ingresar un tratamiento, debe existir una caja abierta</span>
        	</h4>
			 <h2><a href="<s:url value="/caja/apertura"/>">Abrir Caja</a></h2>
		</div>	 
	 </sf:form>
</div>