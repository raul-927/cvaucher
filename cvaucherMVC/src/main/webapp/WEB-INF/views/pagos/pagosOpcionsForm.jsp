<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<div class="well well-lg">
	<sf:form cssClass = "form" 
		method ="POST" 
		commandName ="formPagosOptions" >
		
		<input type="hidden" name="_flowExecutionKey" 
             value="${flowExecutionKey}"/>
             
		 <div class="form-group">
		 	<h2>Trabajar con Formas de Pagos</h2>
		 	<sf:label path="formaDePagoDesc" for ="formaDePagoDesc">Seleccione una opcion</sf:label>
		 	<sf:select cssClass ="form-control" path="formaDePagoDesc" size ="1">
		 		<sf:options path ="formaDePagoDesc" items="${fpagoOption}" itemLabel ="formPagAbreviacion" itemValue ="formPagAbreviacion" />
		 	</sf:select>
		 	<sf:errors path ="formaDePagoDesc" cssClass ="error"/>
		 </div>
		 	
		 <div class="botonForm">		
			<input class="btn btn-primary" type ="submit" value ="Siguiente" name ="_eventId_FormaPagoSelect"/>
		 </div>
	 </sf:form>
</div>