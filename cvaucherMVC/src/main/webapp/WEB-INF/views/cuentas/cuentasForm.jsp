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
		 
		 	<div class="form-group">
			 	<sf:hidden cssClass ="form-control" path="cuentaFecha" size ="30"/>
			 	<sf:errors path ="cuentaFecha" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:hidden cssClass ="form-control" path="cuentaHora" size ="30"/>
			 	<sf:errors path ="cuentaHora" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:hidden cssClass ="form-control" path="cuentaUsuario" size ="30"/>
			 	<sf:errors path ="cuentaUsuario" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
		 	<sf:label path="grupoCuentas" for ="grupoCuentas">Seleccione un Grupo de Cuentas</sf:label>
		 	<sf:select cssClass ="form-control" path="grupoCuentas" size ="1">
		 		<sf:options items="${tipOpcion}" />
		 	</sf:select>
		 	<sf:errors path ="grupoCuentas" cssClass ="error"/>
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
	
