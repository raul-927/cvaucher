<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<div class="well well-lg">
	<sf:form cssClass = "form" 
		method ="POST" 
		commandName ="agenda" >
		
		<input type="hidden" name="_flowExecutionKey" 
             value="${flowExecutionKey}"/>
             
		 <div class="form-group">
		 	<sf:label path="tipoAgenda" for ="tipoAgenda">Tipo de agenda</sf:label>
		 	<sf:select cssClass ="form-control" path="tipoAgenda" size ="1" id="descCAT">
		 		
		 		<sf:options items="${tipage}" />
	
		 	</sf:select>
		 	<sf:errors path ="tipoAgenda" cssClass ="error"/>
		 </div>
		 <div class="form-group">	
		 
		 	<sf:label path="dato" for ="dato">Dato</sf:label>
		 	<sf:input cssClass ="form-control" path="dato" size ="50" id="descCAT"/>
		 	<sf:errors path ="dato" cssClass ="error"/>
		 </div>	
		 	
		 <div class="botonForm">
		 	<input class ="btn btn-default" type ="reset" value ="Cancelar" name ="_eventId_cancelar"/>
			<input class="btn btn-primary" type ="submit" value ="Agregar" name ="_eventId_agendaIngresada"/>			
			<input class="btn btn-primary" type ="submit" value ="Siguiente" name ="_eventId_agendaIngresadaOK"/>
		 </div>
	 </sf:form>
</div>