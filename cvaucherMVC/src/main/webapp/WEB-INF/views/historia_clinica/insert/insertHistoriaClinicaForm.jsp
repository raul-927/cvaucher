<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<div class="well well-lg">
	<sf:form cssClass = "form" 
		method = "POST"
		commandName ="historiaClinica">
		
		<input type="hidden" name="_flowExecutionKey" 
             value="${flowExecutionKey}"/>
        <!-- 
		<div class="form-group">
		 	<sf:label path="pacientes.pacId" for ="pacientes.pacId">Id Paciente</sf:label>
		 	<sf:input cssClass ="form-control" path="pacientes.pacId" size ="50" id="descCAT"/>
		 	<sf:errors path ="pacientes.pacId" cssClass ="error"/>
		 </div>	
		 -->
		 
		 <div class="form-group">
		 	<sf:label path="diabetes" for ="diabetes">Diabetes</sf:label>
		 	<sf:checkbox cssClass ="form-control" path="diabetes" size ="1" id="descCAT"/>
		 	<sf:errors path ="diabetes" cssClass ="error"/>
		 </div>
		 
		 
		 <div class="form-group">
		 	<sf:label path="epilepsia" for ="epilepsia">Epilepsia</sf:label>
		 	<sf:checkbox cssClass ="form-control" path="epilepsia" size ="1" id="descCAT"/>
		 	<sf:errors path ="epilepsia" cssClass ="error"/>
		 </div>
		 
		 <div class="form-group">
		 	<sf:label path="marcaPaso" for ="marcaPaso">Marca paso</sf:label>
		 	<sf:checkbox cssClass ="form-control" path="marcaPaso" size ="1" id="descCAT"/>
		 	<sf:errors path ="marcaPaso" cssClass ="error"/>
		 </div>
		 
		 <div class="form-group">
		 	<sf:label path="diu" for ="diu">DIU</sf:label>
		 	<sf:checkbox cssClass ="form-control" path="diu" size ="1" id="descCAT"/>
		 	<sf:errors path ="diu" cssClass ="error"/>
		 </div>
		 
		 <div class="form-group">
		 	<sf:label path="problemasCardiacos" for ="problemasCardiacos">Problemas cardiacos</sf:label>
		 	<sf:input cssClass ="form-control" path="problemasCardiacos" size ="50" id="descCAT"/>
		 	<sf:errors path ="problemasCardiacos" cssClass ="error"/>
		 </div>
		 
		 <div class="form-group">
		 	
		 	<sf:label path="medicacion" for ="medicacion">Medicacion</sf:label>
		 	<sf:input cssClass ="form-control" path="medicacion" size ="30" id="descCAT"/>
		 	<sf:errors path ="medicacion" cssClass ="error"/>
		 </div>	
		 <div class="form-group">
		 	<sf:label path="cantHijos" for ="cantHijos">Cant Hijos</sf:label>
		 	<sf:input cssClass ="form-control" path="cantHijos" size ="30" id="descCAT"/>
		 	<sf:errors path ="cantHijos" cssClass ="error"/>
		 </div>	
		 <div class="form-group">
		 	<sf:label path="operaciones" for ="operaciones">Operaciones</sf:label>
		 	<sf:input cssClass ="form-control" path="operaciones" size ="50" id="descCAT"/>
		 	<sf:errors path ="operaciones" cssClass ="error"/>
		 </div>	
		 
		 <div class="form-group">
		 	<sf:label path="hipertension" for ="hipertension">Hipetension</sf:label>
		 	<sf:checkbox cssClass ="form-control" path="hipertension" size ="1" id="descCAT"/>
		 	<sf:errors path ="hipertension" cssClass ="error"/>
		 </div>
		 <div class="form-group">
		 	<sf:label path="procesosOncologicos" for ="diu">Procesos Oncologicos</sf:label>
		 	<sf:checkbox cssClass ="form-control" path="procesosOncologicos" size ="1" id="descCAT"/>
		 	<sf:errors path ="procesosOncologicos" cssClass ="error"/>
		 </div>
		 <div class="form-group">
		 	<sf:label path="tiroides" for ="tiroides">Tiroides</sf:label>
		 	<sf:checkbox cssClass ="form-control" path="tiroides" size ="1" id="descCAT"/>
		 	<sf:errors path ="tiroides" cssClass ="error"/>
		 </div>
		 
		 <div class="form-group">
		 	<sf:label path="actividadFisica" for ="actividadFisica">Actividad Fisica</sf:label>
		 	<sf:input cssClass ="form-control" path="actividadFisica" size ="50" id="descCAT"/>
		 	<sf:errors path ="actividadFisica" cssClass ="error"/>
		 </div>	
		 
		 <div class="form-group">
		 	<sf:label path="cantConsumoAguaDiaria" for ="cantConsumoAguaDiaria">Cantidad Consumo Agua</sf:label>
		 	<sf:input cssClass ="form-control" path="cantConsumoAguaDiaria" size ="50" id="descCAT"/>
		 	<sf:errors path ="cantConsumoAguaDiaria" cssClass ="error"/>
		 </div>	
		 
		 <div class="form-group">
		 	<sf:label path="alimentacion" for ="alimentacion">Alimentacion</sf:label>
		 	<sf:input cssClass ="form-control" path="alimentacion" size ="50" id="descCAT"/>
		 	<sf:errors path ="alimentacion" cssClass ="error"/>
		 </div>	
		 
		<div class="botonForm">
			<input class ="btn btn-default" type ="reset" value ="Cancelar" name ="_eventId_cancelar"/>
			<input class="btn btn-primary" type ="submit" value ="Agregar" name ="_eventId_historiaClinicaIngresado"/>
		</div>
	 </sf:form>
</div>