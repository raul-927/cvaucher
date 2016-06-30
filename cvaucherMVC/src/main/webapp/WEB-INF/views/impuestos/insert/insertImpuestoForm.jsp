<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<h3>Crear Nuevo Impuesto</h3>
<div class =" well well-lg">
	<sf:form cssClass = "form"
		method ="POST" 
		modelAttribute ="impuesto" >
		 <fieldset style="width: 350px;">
		 	<div class="form-group"> 
			 	<sf:label path="impuestoDesc" for ="impuestoDesc">Descripcion</sf:label>
			 	<sf:input cssClass ="form-control" path="impuestoDesc" size ="30"/>
			 	<sf:errors path ="impuestoDesc" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group"> 
			 	<sf:label path="impuestoDescAbrv" for ="impuestoDescAbrv">Abreviaci&oacute;n</sf:label>
			 	<sf:input cssClass ="form-control" path="impuestoDescAbrv" size ="30"/>
			 	<sf:errors path ="impuestoDescAbrv" cssClass ="error"/>
		 	</div>
		 	<div class="form-group"> 
			 	<sf:label path="impuestoValor" for ="impuestoValor">Valor</sf:label>
			 	<sf:input cssClass ="form-control" path="impuestoValor" size ="30"/>
			 	<sf:errors path ="impuestoValor" cssClass ="error"/>
		 	</div>
		 </fieldset>
		 	
		 <div class="form-group">
		 	<sf:label path="impuestoTipo" for ="impuestoTipo">Tipos de Impuesto</sf:label>
		 	<sf:select cssClass ="form-control" path="impuestoTipo" size ="1">
		 		<sf:options items="${tipImp}" />
		 	</sf:select>
		 	<sf:errors path ="impuestoTipo" cssClass ="error"/>
		 </div>
		 <div class="form-group">
		 	<sf:label path="impuestoCuenta.cuentaId" for ="impuestoCuenta.cuentaId">Seleccione una Cuenta</sf:label>
		 	<sf:select cssClass ="form-control" path="impuestoCuenta.cuentaId">
		 		<sf:options items="${cuenta}" itemLabel="cuentaDesc" itemValue="cuentaId" />
		 	</sf:select>
		 	<sf:errors path ="impuestoCuenta.cuentaId" cssClass ="error"/>
		 </div>
		 <div class="botonForm">
		 	<input class= "btn btn-primary" type ="submit" value ="Aceptar"/>
		 	<input class ="btn btn-default" type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
</div>