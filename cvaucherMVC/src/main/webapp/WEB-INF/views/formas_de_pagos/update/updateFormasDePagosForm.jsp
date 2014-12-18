<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<h3>Modificar Tratamiento</h3>
<div class =" well well-lg">
	<sf:form cssClass = "form" 
		method ="POST" 
		modelAttribute ="tratamiento" >
		 <fieldset style="width: 350px;">
		 	
	         <div class="form-group">
			 	<sf:label path="tratId" for ="tratId">Id</sf:label>
			 	<sf:input cssClass ="inputText" path="tratId" size ="5" id="descCAT"/>
			 	<sf:errors path ="tratId" cssClass ="error"/>
		 	</div>
		 	
		 	  <div class="form-group">
				 	<sf:label path="tipoTratamiento.tipTratId" for ="tipoTratamiento.tipTratId">Tipo</sf:label>
				 	<sf:select cssClass ="form-control" path="tipoTratamiento.tipTratId" size ="1" id="descCAT">
				 		
				 		<sf:options items="${tipoTrat}" itemLabel="tipTratDesc" itemValue="tipTratId" />
				 		
				 	</sf:select>
				 	<sf:errors path ="tipoTratamiento.tipTratId" cssClass ="error"/>
		 	</div>
		 	<div class="form-group">
			 	<sf:label path="tratDescripcion" for ="tratDescripcion">Descripcion</sf:label>
			 	<sf:textarea cssClass ="inputText" path="tratDescripcion" size ="30" id="descCAT"/>
			 	<sf:errors path ="tratDescripcion" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
		 		<sf:label path="tratCantSesiones" for ="tratId">Sesiones</sf:label>
		 		<sf:input cssClass ="inputText" path="tratCantSesiones" size ="10" id="descCAT"/>
		 		<sf:errors path ="tratCantSesiones" cssClass ="error"/>
			</div>
		 	
		 </fieldset>
		 <div class="botonForm">
		 	<input class="btn btn-primary" type ="submit" value ="Aceptar"/>
		 	<input class ="btn btn-default" type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
</div>