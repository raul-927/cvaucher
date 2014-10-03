<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<div class="well well-lg">
	<sf:form cssClass = "form" 
	
		commandName ="direccion">
		<input type="hidden" name="_flowExecutionKey" 
             value="${flowExecutionKey}"/>
       <sf:hidden  path="pacientes.pacId" value ="${flowScope.pacientesResult}" />
       
		 <div class="form-group">
		 	<sf:label path="tpoVivienda" for ="tpoVivienda">Tipo de vivienda</sf:label>
		 	<sf:select cssClass ="form-control" path="tpoVivienda" size ="1" id="descCAT">
		 		<sf:options items="${tipviv}" />
		 	</sf:select>
		 	<sf:errors path ="tpoVivienda" cssClass ="error"/>
		 </div>
		 <div class="form-group">
		 	<sf:label path="calle" for ="calle">Calle</sf:label>
		 	<sf:input cssClass ="form-control" path="calle" size ="50" id="descCAT"/>
		 	<sf:errors path ="calle" cssClass ="error"/>
		 </div>
		 
		 <div class="form-group">
		 	
		 	<sf:label path="nroPuerta" for ="nroPuerta">Nro de Puerta</sf:label>
		 	<sf:input cssClass ="form-control" path="nroPuerta" size ="30" id="descCAT"/>
		 	<sf:errors path ="nroPuerta" cssClass ="error"/>
		 </div>	
		 <div class="form-group">
		 	<sf:label path="nroAp" for ="nroAp">Nro de Ap</sf:label>
		 	<sf:input cssClass ="form-control" path="nroAp" size ="30" id="descCAT"/>
		 	<sf:errors path ="nroAp" cssClass ="error"/>
		 </div>	
		 <div class="form-group">
		 	<sf:label path="calle1" for ="calle1">Calle 1</sf:label>
		 	<sf:input cssClass ="form-control" path="calle1" size ="50" id="descCAT"/>
		 	<sf:errors path ="calle1" cssClass ="error"/>
		 </div>	
		 <div class="form-group">
		 	<sf:label path="calle2" for ="calle2">Calle 2</sf:label>
		 	<sf:input cssClass ="form-control" path="calle2" size ="50" id="descCAT"/>
		 	<sf:errors path ="calle2" cssClass ="error"/>
		 </div>	
		 
		<div class="botonForm">
				 <input class ="btn btn-default" type ="reset" value ="Cancelar" name ="_eventId_cancelar"/>
				 <input class="btn btn-primary" type ="submit" value ="Agregar" name ="_eventId_direccionIngresado"/>
				 <input class="btn btn-primary" type ="submit" value ="Siguiente" name ="_eventId_direccionOk"/>
			
			</div>
	 </sf:form>
</div>