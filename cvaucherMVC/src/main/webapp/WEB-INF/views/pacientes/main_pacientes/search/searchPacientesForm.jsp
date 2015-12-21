<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<div class =" well well-lg">
	<s:url value="/pacsearch/search" var ="urlvaucher"/>
	<sf:form cssClass = "form-inline"  
		method ="POST" 
		modelAttribute ="searchPacientes" 
		action ="${urlvaucher}">
		 	<legend>&nbsp;BUSCAR&nbsp;</legend>
		 
		 <div class="form-group">
		 	<sf:label path="cedula" for ="cedula">Cedula</sf:label>
		 	<sf:input path="cedula" cssClass ="inputText" size ="10" id="cedula" class="form-control" 
		 				placeholder ="Nro de cedula"/>
		 	<sf:errors path ="cedula" cssClass ="error"/>
		 </div>
		 
		 <div class="form-group">	
		 	
		 	<sf:label path="pacNombre" for ="pacNombre">Nombre</sf:label>
		 	<sf:input path="pacNombre" cssClass ="inputText" size ="10" id="pacNombre" class="form-control"
		 					placeholder ="Nombre"/>
		 </div>
		 <div class="form-group">
		 	
		 	<sf:label path="pacApellido" for ="pacApellido">Apellido</sf:label>
		 	<sf:input path ="pacApellido" cssClass ="inputText" size ="10" id ="pacApellido" class="form-control"
		 				placeholder ="Apellido"/>
		 	
		 </div>	

		 <div class="botonForm">
		 
		 	<sf:button class="btn btn-primary" value ="Buscar">Buscar</sf:button>
		 </div>
	 </sf:form>
</div>