<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<h3>Crear Nuevo Grupo de  Cuentas</h3>
<div class =" well well-lg">
	
	<sf:form cssClass = "form"
		method ="POST" 
		modelAttribute ="grupoCuentas" >
		 <fieldset style="width: 350px;">
		 
		 	<div class="form-group">
		 		<sf:label path="tipoCuenta" for ="tipoCuenta">Seleccione un Tipo de Cuentas</sf:label>
		 		<sf:select cssClass ="form-control" path="tipoCuenta" size ="1">
		 		<sf:options items="${tpoCuenta}" />
		 		</sf:select>
		 		<sf:errors path ="tipoCuenta" cssClass ="error"/>
		 	</div>
		 
		 	<div class="form-group">
			 	<sf:label path="grupoCuentaDesc" for ="grupoCuentaDesc">Descripcion</sf:label>
			 	<sf:input cssClass ="form-control" path="grupoCuentaDesc" size ="30"/>
			 	<sf:errors path ="grupoCuentaDesc" cssClass ="error"/>
		 	</div>
		 
		 </fieldset>
		 
		 <div class="botonForm">
		 	<input class= "btn btn-primary" type ="submit" value ="Aceptar"/>
		 	<input class ="btn btn-default" type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
</div>
	
