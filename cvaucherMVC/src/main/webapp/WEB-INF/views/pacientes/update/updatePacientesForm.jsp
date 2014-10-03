<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

	<sf:form id ="frmPacUpdate" 
		method ="POST" 
		modelAttribute ="pacientes" >
		 <fieldset style="width: 350px;">
		 	<legend>&nbsp;MODIFICACION DE PACIENTES&nbsp;</legend>
	        <br />
		 	 
		 	
		 	  <br /> <br />
		 	<sf:label path="cedula" for ="cedula">Cedula</sf:label>
		 	<sf:input path="cedula" size ="30" id="descCAT"/>
		 	<sf:errors path ="cedula" cssClass ="error"/>
		 	
		 	 <br /> <br />
		 	<sf:label path="pacNombre" for ="pacNombre">Nombre</sf:label>
		 	<sf:input path="pacNombre" size ="30" id="descCAT"/>
		 	<sf:errors path ="pacNombre" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="pacApellido" for ="pacApellido">Apellido</sf:label>
		 	<sf:input path="pacApellido" size ="30" id="descCAT"/>
		 	<sf:errors path ="pacApellido" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="ocupacion" for ="ocupacion">Ocupacion</sf:label>
		 	<sf:input path="ocupacion" size ="30" id="descCAT"/>
		 	<sf:errors path ="ocupacion" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="sociedadMedica" for ="sociedadMedica">Soc Medica</sf:label>
		 	<sf:input path="sociedadMedica" size ="30" id="descCAT"/>
		 	<sf:errors path ="sociedadMedica" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	<sf:label path="emergenciaMovil" for ="emergenciaMovil">Emerg Movil</sf:label>
		 	<sf:input path="emergenciaMovil" size ="30" id="descCAT"/>
		 	<sf:errors path ="emergenciaMovil" cssClass ="error"/>
		 	
		 	
		 	<br /> <br />
		 </fieldset>
		 <div class="botonForm">
		 	<input type ="submit" value ="Aceptar"/>
		 	<input type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
