<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<div class="well well-lg">
	<sf:form cssClass = "form" 
		method ="POST" 
		commandName ="caja" >
		
		<input type="hidden" name="_flowExecutionKey" 
             value="${flowExecutionKey}"/>
             
		<div class="form-group">	
		 
		 	<sf:label path="cajaFecha" for ="cajaFecha">Fecha</sf:label>
		 	<sf:input cssClass ="form-control" path="cajaFecha" size ="50"/>
		 	<sf:errors path ="cajaFecha" cssClass ="error"/>
		 </div>	
		 <div class="form-group">	
		 
		 	<sf:label path="cajaHora" for ="cajaHora">Hora</sf:label>
		 	<sf:input cssClass ="form-control" path="cajaHora" size ="50" />
		 	<sf:errors path ="cajaHora" cssClass ="error"/>
		 </div>	
		 	
		 <div class="botonForm">
		 	<input class ="btn btn-default" type ="reset" value ="Cancelar" name ="_eventId_cancelar"/>
			<input class="btn btn-primary" type ="submit" value ="Agregar" name ="_eventId_agendaIngresada"/>			
			<input class="btn btn-primary" type ="submit" value ="Siguiente" name ="_eventId_agendaIngresadaOK"/>
		 </div>
	 </sf:form>
</div>