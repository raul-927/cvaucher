
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

						<h3>Ingresar Tratamiento</h3>

<div class="well well-lg">
	<sf:form 
		id ="insertTratamientoForm" 
		cssClass = "form"
		modelAttribute ="tratamientoPaciente"
		commandName ="tratamientoPaciente">
		
			<input type="hidden" name="_flowExecutionKey" id ="flowExecutionKey"
             value="${flowExecutionKey}"/>
             
           
             <div class="form-group">
			 	<sf:label path="fecha" for ="fecha">Fecha</sf:label>
			 	<sf:input cssClass ="input-small " path="fecha"  value ="#{fechaHoy}" size ="8" enabled = "false"/>
			 	<sf:errors path ="fecha" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="tratamId" for ="tratamId">Tratamiento</sf:label>
			 	<sf:select cssClass ="form-control" path="tratamId"  size ="1" >
			 		<sf:options  path="tratamId" items="${tratP}" itemLabel="tratDescripcion" itemValue="tratId"/>
			 	</sf:select>
			 	<sf:errors path ="tratamId" cssClass ="error"/>
		 	</div>

		<t:insertAttribute name ="showCantSes"/>
			
		 <div class="botonForm">
		 	<input class="btn btn-primary"  type ="submit" value ="Actualizar" name ="_eventId_cantSesionesTratamiento"/>
		 </div>

		 	<div class="form-group">
			 	<sf:label path="costoTratSesion" for ="costoTratSesion">Importe</sf:label>
			 	<sf:input cssClass ="form-control" path="costoTratSesion" placeholder ="costoTratSesion" size ="30" id="descCAT"/>
			 	<sf:errors path ="costoTratSesion" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="importePagado" for ="importePagado">Importe Pagado</sf:label>
			 	<sf:input cssClass ="form-control" path="importePagado" placeholder ="importePagado" size ="30" id="descCAT"/>
			 	<sf:errors path ="importePagado" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="saldoPendiente" for ="saldoPendiente">Saldo Pendiente</sf:label>
			 	<sf:input cssClass ="form-control" path="saldoPendiente" placeholder ="saldoPendiente" size ="30" id="descCAT"/>
			 	<sf:errors path ="saldoPendiente" cssClass ="error"/>
		 	</div>
		 	
			 <div class="botonForm">
				 <input class ="btn btn-default" id="cancel" type ="reset" value ="Cancelar" name ="_eventId_cancelar"/>
				 <input class="btn btn-primary"  type ="submit" value ="Ingresar Tratamiento" name ="_eventId_tratamientoPacienteIngresado"/>
			
			</div>
			
	 </sf:form>
</div>