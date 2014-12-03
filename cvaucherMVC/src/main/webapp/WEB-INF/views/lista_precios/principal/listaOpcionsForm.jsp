<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<div class="well well-lg">
	<sf:form cssClass = "form" 
		method ="POST" 
		commandName ="preciosOptions" >
		
		<input type="hidden" name="_flowExecutionKey" 
             value="${flowExecutionKey}"/>
             
		 <div class="form-group">
		 	<sf:label path="opcion" for ="opcion">Seleccione una opcion</sf:label>
		 	<sf:select cssClass ="form-control" path="opcion" size ="1" id="descCAT">
		 		<sf:options items="${tipOpcion}" />
		 	</sf:select>
		 	<sf:errors path ="opcion" cssClass ="error"/>
		 </div>
		 
		 <div class="botonForm">		
			<input class="btn btn-primary" type ="submit" value ="Siguiente" name ="_eventId_opcionSeleccionadaOK"/>
		 </div>
	 </sf:form>
</div>