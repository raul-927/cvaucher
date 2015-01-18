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
		$( "#fechaVenc").datepicker({ dateFormat: 'yy-mm-dd' }).val();
		
	});

	
</script>

<h3>Pago con Efectivo: ${tipoFormPag.formasDePagoDesc}</h3>
<div class =" well well-lg">
	
	<sf:form cssClass ="form"
		method ="POST" 
		commandName ="pagoEfectivo" >
		 <fieldset style="width: 350px;">
		 
		 <input type="hidden" name="_flowExecutionKey" 
             value="${flowExecutionKey}"/>
             
         <input type="hidden" name="pagoEfDesc" value ="${tipoFormPag.formasDePagoDesc}"/>
		 	
		 	<div class="form-group">
			 <sf:label path="pagoEfCedula" for ="pagoEfCedula">C.I:<br/>${paciente.cedula}</sf:label>
			 <input type="hidden" name="pagoEfCedula" value ="${paciente.cedula}"/>
			 	<sf:errors path ="pagoEfCedula" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="pagoEfImporte" for ="pagoEfImporte">Importe</sf:label>
			 	<sf:input id ="pagoEfImporte" cssClass ="form-control" path="pagoEfImporte" size ="30"/>
			 	<sf:errors path ="pagoEfImporte" cssClass ="error"/>
		 	</div>
		 	
		 	
		 </fieldset>
		 <div class="botonForm">
		 	<input class= "btn btn-primary" type ="submit" value ="Aceptar" name ="_eventId_finalizarIngresoTratamientoPagoCredito"/>
		 	<input class ="btn btn-default" type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
</div>
	
