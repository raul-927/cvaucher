<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<h3>Crear Nueva Forma de Pago</h3>
<div class =" well well-lg">
	
	<sf:form cssClass = "form"
		method ="POST" 
		modelAttribute ="formasDePagos" >
		 <fieldset style="width: 350px;">
		 
		 	<div class="form-group">
			 	<sf:label path="formPagAbreviacion" for ="formPagAbreviacion">Abrebiacion</sf:label>
			 	<sf:input cssClass ="form-control" path="formPagAbreviacion" size ="6"/>
			 	<sf:errors path ="formPagAbreviacion" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="formPagDesc" for ="formPagDesc">Descripcion</sf:label>
			 	<sf:input cssClass ="form-control" path="formPagDesc" size ="30"/>
			 	<sf:errors path ="formPagDesc" cssClass ="error"/>
		 	</div>

		 </fieldset>
		 <div class="botonForm">
		 	<input class= "btn btn-primary" type ="submit" value ="Aceptar"/>
		 	<input class ="btn btn-default" type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
</div>
	
