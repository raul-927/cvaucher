<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

	<sf:form id ="frmTratInsert" 
		method ="POST" 
		modelAttribute ="direccion" >
		 <fieldset style="width: 350px;">
		 	<legend>&nbsp;ALTA DE DIRECCIONES&nbsp;</legend>
	        <br />
		 	 
		 	 <sf:label path="dirId" for ="dirId">Id</sf:label>
		 	<sf:input path="dirId" size ="50" id="descCAT"/>
		 	<sf:errors path ="dirId" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	
		 	<sf:label path="pacientes.pacId" for ="pacientes.pacId">Id Paciente</sf:label>
		 	<sf:input path="pacientes.pacId" size ="50" id="descCAT"/>
		 	<sf:errors path ="pacientes.pacId" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	
		 	<br /> <br />
		 	<sf:label path="tpoVivienda" for ="tpoVivienda">Tipo de vivienda</sf:label>
		 	<sf:select path="tpoVivienda" size ="1" id="descCAT">
		 		
		 		<sf:options items="${tipviv}" />
		 		
		 		
		 	</sf:select>
		 	<sf:errors path ="tpoVivienda" cssClass ="error"/>
		 	
		 	
		 	<br /> <br />
		 	<sf:label path="calle" for ="calle">Calle</sf:label>
		 	<sf:input path="calle" size ="50" id="descCAT"/>
		 	<sf:errors path ="calle" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="nroPuerta" for ="nroPuerta">Nro de Puerta</sf:label>
		 	<sf:input path="nroPuerta" size ="30" id="descCAT"/>
		 	<sf:errors path ="nroPuerta" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="nroAp" for ="nroAp">Nro de Ap</sf:label>
		 	<sf:input path="nroAp" size ="30" id="descCAT"/>
		 	<sf:errors path ="nroAp" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="calle1" for ="calle1">Calle 1</sf:label>
		 	<sf:input path="calle1" size ="50" id="descCAT"/>
		 	<sf:errors path ="calle1" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="calle2" for ="calle2">Calle 2</sf:label>
		 	<sf:input path="calle2" size ="50" id="descCAT"/>
		 	<sf:errors path ="calle2" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	
		 	
		 </fieldset>
		 <div class="botonForm">
		 	<input type ="submit" value ="Aceptar"/>
		 	<input type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
