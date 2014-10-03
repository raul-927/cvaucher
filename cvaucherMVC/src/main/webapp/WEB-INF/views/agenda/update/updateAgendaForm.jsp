<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

	<sf:form id ="frmTratInsert" 
		method ="POST" 
		modelAttribute ="agenda" >
		 <fieldset style="width: 350px;">
		 	<legend>&nbsp;AGENDA&nbsp;</legend>
	       
		 	 
		 	  <br />
		 	<sf:label path="pacientes.pacId" for ="pacientes.pacId">Id Paciente</sf:label>
		 	<sf:input path="pacientes.pacId" size ="50" id="descCAT"/>
		 	<sf:errors path ="pacientes.pacId" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="tipoAgenda" for ="tipoAgenda">Tipo de agenda</sf:label>
		 	<sf:select path="tipoAgenda" size ="1" id="descCAT">
		 		
		 		<sf:options items="${tipage}" />
		 		
		 		
		 	</sf:select>
		 	<sf:errors path ="tipoAgenda" cssClass ="error"/>
		 	
		 	
		 	<br /> <br />
		 	<sf:label path="dato" for ="dato">Dato</sf:label>
		 	<sf:input path="dato" size ="50" id="descCAT"/>
		 	<sf:errors path ="dato" cssClass ="error"/>
		 	
		 	
		 	
		 	<br /> <br />
		 	
		 	
		 </fieldset>
		 <div class="botonForm">
		 	<input type ="submit" value ="Aceptar"/>
		 	<input type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
