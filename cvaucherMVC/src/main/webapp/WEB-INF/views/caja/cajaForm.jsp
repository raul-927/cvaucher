<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<div class =" well well-lg">
	<s:url value="/pacsearch/search" var ="urlvaucher"/>
	<sf:form cssClass = "form-inline"  
		method ="POST" 
		modelAttribute ="auxCajas" 
		action ="${urlvaucher}">
		 	<legend>&nbsp;BUSCAR&nbsp;</legend>

		 <div class="form-group">
		 	<sf:label path="cajaId" for ="cajaId">cajaId</sf:label>
		 	<sf:input path="cajaId" cssClass ="inputText" size ="10" id="cajaId" class="form-control" 
		 				placeholder ="Nro de id de Caja"/>
		 	<sf:errors path ="cajaId" cssClass ="error"/>
		 </div>
		 
		 <div class="form-group">	
		 	
		 	<sf:label path="cajaEstado" for ="cajaEstado">Estado de caja</sf:label>
		 	<sf:input path="cajaEstado" cssClass ="inputText" size ="10" id="cajaEstado" class="form-control"
		 					placeholder ="Estado"/>
		 </div>
		 <div class="form-group">
		 	
		 	<sf:label path="cuentaFormPagoDesc" for ="cuentaFormPagoDesc">Forma de pago</sf:label>
		 	<sf:input path ="cuentaFormPagoDesc" cssClass ="inputText" size ="10" id ="cuentaFormPagoDesc" class="form-control"
		 				placeholder ="Forma de pago"/>
		 	
		 </div>
		 
		 <div class="form-group">
		 	
		 	<sf:label path="monto" for ="monto">Monto</sf:label>
		 	<sf:input path ="monto" cssClass ="inputText" size ="10" id ="monto" class="form-control"
		 				placeholder ="monto"/>
		 	
		 </div>	
		 <div class="form-group">
		 	
		 	<sf:label path="cuentaTipoMovimiento" for ="cuentaTipoMovimiento">Tipo de movimiento</sf:label>
		 	<sf:input path ="cuentaTipoMovimiento" cssClass ="inputText" size ="10" id ="cuentaTipoMovimiento" class="form-control"
		 				placeholder ="cuentaTipoMovimiento"/>
		 	
		 </div>	
	cuentaTipoMovimiento
		 <div class="botonForm">
		 
		 	<sf:button class="btn btn-primary" value ="Buscar">Buscar</sf:button>
		 </div>
	 </sf:form>
</div>