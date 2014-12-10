<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
<link rel="stylesheet" href="/resources/demos/style.css" />
<script>
	$(function() {
		$( "#fechaIni").datepicker();
	});

	$(function() {
		$( "#fechaFin").datepicker();
	});
</script>

<div class="well well-lg">
	<sf:form cssClass = "form" 
		method ="POST" 
		commandName ="auxPrecios" >
		
		<input type="hidden" name="_flowExecutionKey" 
             value="${flowExecutionKey}"/>
             
         
		 <div class="form-group">
			 	<sf:label path="auxPrecFechIni" for ="auxPrecFechIni">Fecha de Inicio</sf:label>
			 	<sf:input cssClass ="form-control" path="auxPrecFechIni" placeholder ="Fecha de Inicio" size ="30" id="fechaIni"/>
			 	<sf:errors path ="auxPrecFechIni" cssClass ="error"/>
		 </div>
		 	
		 <div class="form-group">
			 	<sf:label path="auxPrecFechFin" for ="auxPrecFechFin">Fecha de Finalizacion</sf:label>
			 	<sf:input cssClass ="form-control" path="auxPrecFechFin" placeholder ="Fecha de Finalizacion" size ="30" id="fechaFin"/>
			 	<sf:errors path ="auxPrecFechFin" cssClass ="error"/>
		</div>
		
		<div class="form-group">
			 	<sf:label path="auxPrecDescripcion" for ="auxPrecDescripcion">Descripcion</sf:label>
			 	<sf:input cssClass ="form-control" path="auxPrecDescripcion" placeholder ="Descripcion" size ="30"/>
			 	<sf:errors path ="auxPrecDescripcion" cssClass ="error"/>
		 </div>
		 
		 <div class="botonForm">		
			<input class="btn btn-primary" type ="submit" value ="Grabar Datos y Finalizar" name ="_eventId_finalizar"/>
		 </div>
	 </sf:form>
</div>