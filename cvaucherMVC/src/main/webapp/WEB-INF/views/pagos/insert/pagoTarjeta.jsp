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

<h3>Pago con tarjeta: ${tipoFormPag.formasDePagoDesc}</h3>
<div class =" well well-lg">
	
	<sf:form cssClass ="form"
		method ="POST" 
		commandName ="pagoTarjeta" >
		 <fieldset style="width: 350px;">
		 
		 <input type="hidden" name="_flowExecutionKey" 
             value="${flowExecutionKey}"/>
             
         <input type="hidden" name="tarjDesc" value ="${tipoFormPag.formasDePagoDesc}"/>
		 	
		 	<div class="form-group">
			 <sf:label path="tarjPacCedula" for ="tarjPacCedula">C.I:<br/>${paciente.cedula}</sf:label>
			 <input type="hidden" name="tarjPacCedula" value ="${paciente.cedula}"/>
			 	<sf:errors path ="tarjPacCedula" cssClass ="error"/>
		 	</div>
		 
	        <div class="form-group">
			 	<sf:label path="tarjNro" for ="tarjNro">Nro Tarjeta</sf:label>
			 	<sf:input cssClass ="form-control" path="tarjNro" size ="30"/>
			 	<sf:errors path ="tarjNro" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="tarjVence" for ="tarjVence">Vencimiento</sf:label>
			 	<sf:input id ="fechaVenc" cssClass ="form-control" path="tarjVence" value ="0000-00-00" placeholder ="Fecha de Vencimiento" size ="30"/>
			 	<sf:errors path ="tarjVence" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="tarjImporte" for ="tarjImporte">Importe<h4>${aux2}</h4></sf:label>
			 	<input type ="hidden" name ="tarjImporte" value ="${aux2}"/>
			 	<sf:errors path ="tarjImporte" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="cantCuotas" for ="cantCuotas">Cuotas</sf:label>
			 	<sf:input cssClass ="form-control" path="cantCuotas" size ="30"/>
			 	<sf:errors path ="cantCuotas" cssClass ="error"/>
		 	</div>

		 </fieldset>
		 <div class="botonForm">
		 	<input class= "btn btn-primary" type ="submit" value ="Aceptar" name ="_eventId_finalizarIngresoTratamientoPago"/>
		 	<input class ="btn btn-default" type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
</div>
	
