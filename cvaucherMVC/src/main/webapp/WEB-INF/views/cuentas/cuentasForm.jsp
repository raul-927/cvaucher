<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<h3>Crear Nueva Cuenta</h3>
<div class =" well well-lg">
	
	<sf:form cssClass = "form"
		method ="POST" 
		modelAttribute ="cuentas" >
		 <fieldset style="width: 350px;">
			 	<sf:hidden cssClass ="form-control" path="cuentaFecha" value ="${fecha}"/>
			 	<sf:errors path ="cuentaFecha" cssClass ="error"/>
		 	
			 	<sf:hidden cssClass ="form-control" path="cuentaHora"  value ="${hora}"/>
			 	<sf:errors path ="cuentaHora" cssClass ="error"/>
		 	
			 	<sf:hidden cssClass ="form-control" path="cuentaUsuario" value ="${user}"/>
			 	<sf:errors path ="cuentaUsuario" cssClass ="error"/>
		 	
		 	<div class="form-group">
		 	<sf:label path="grupoCuentas.grupoCuentaId" for ="grupoCuentas.grupoCuentaId">Seleccione un tipo de grupo Cuentas</sf:label>
		 	<sf:select cssClass ="form-control" path="grupoCuentas.grupoCuentaId">
		 		<sf:options items="${allGrupoCuentas}" itemLabel="grupoCuentaDesc" itemValue="grupoCuentaId" />
		 	</sf:select>
		 	<sf:errors path ="grupoCuentas.grupoCuentaId" cssClass ="error"/>
		 </div>
		 
		 <div class="form-group">
		 		<sf:label path="cuentaTipo" for ="cuentaTipo">Seleccione un Tipo de Cuenta</sf:label>
		 		<sf:select cssClass ="form-control" path="cuentaTipo" size ="1">
		 		<sf:options items="${cuentaTipo}" />
		 		</sf:select>
		 		<sf:errors path ="cuentaTipo" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="cuentaDesc" for ="cuentaDesc">Descripcion</sf:label>
			 	<sf:input cssClass ="form-control" path="cuentaDesc" size ="6"/>
			 	<sf:errors path ="cuentaDesc" cssClass ="error"/>
		 	</div>

		 </fieldset>
		 <div class="botonForm">
		 	<input class= "btn btn-primary" type ="submit" value ="Aceptar"/>
		 	<input class ="btn btn-default" type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
</div>
	
