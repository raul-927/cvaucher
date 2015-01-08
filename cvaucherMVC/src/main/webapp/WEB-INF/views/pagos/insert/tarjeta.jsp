<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<h3>Crear Nuevo Tratamiento</h3>
<div class =" well well-lg">
	
	<sf:form cssClass ="form"
		method ="POST" 
		commandName ="pagoTarjeta" >
		 <fieldset style="width: 350px;">
		 
		 <input type="hidden" name="_flowExecutionKey" 
             value="${flowExecutionKey}"/>
		 
	        <div class="form-group">
			 	<sf:label path="tarjNro" for ="tarjNro">Nro Tarjeta</sf:label>
			 	<sf:input cssClass ="form-control" path="tarjNro" size ="30"/>
			 	<sf:errors path ="tarjNro" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="tarjVence" for ="tarjVence">Vencimiento</sf:label>
			 	<sf:input cssClass ="form-control" path="tarjVence" size ="30"/>
			 	<sf:errors path ="tarjVence" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="tarjImporte" for ="tarjImporte">Importe</sf:label>
			 	<sf:input cssClass ="form-control" path="tarjImporte" size ="30"/>
			 	<sf:errors path ="tarjImporte" cssClass ="error"/>
		 	</div>
		 	

		 </fieldset>
		 <div class="botonForm">
		 	<input class= "btn btn-primary" type ="submit" value ="Aceptar"/>
		 	<input class ="btn btn-default" type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
</div>
	
