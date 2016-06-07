<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<h3>Crear Nuevo Tipo de Tratamiento</h3>
<div class =" well well-lg">
	<sf:form cssClass = "form"
		method ="POST" 
		modelAttribute ="tipoTratamiento" >
		 <fieldset style="width: 350px;">
		 	
		 	<div class="form-group"> 
			 	<sf:label path="tipTratDesc" for ="tipTratDesc">Tipo</sf:label>
			 	<sf:input cssClass ="form-control" path="tipTratDesc" size ="30" id="descCAT"/>
			 	<sf:errors path ="tipTratDesc" cssClass ="error"/>
		 	</div>
		 		
		 </fieldset>
		 
		 <div class="form-group">
			 	<sf:label path="impuesto.impuestoId" for ="impuesto.impuestoId">Tipo</sf:label>
			 	<sf:select cssClass ="form-control" path="impuesto.impuestoId" size ="1">
			 		<sf:options items="${impuestos}" itemLabel="impuestoDescAbrv" itemValue="impuestoId" />
			 	</sf:select>
			 	<sf:errors path ="impuesto.impuestoId" cssClass ="error"/>
		 </div>
		 	
		 <div class="botonForm">
		 	<input class= "btn btn-primary" type ="submit" value ="Aceptar"/>
		 	<input class ="btn btn-default" type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
</div>