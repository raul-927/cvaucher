<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

	<sf:form class="form"
		method ="GET" 
		modelAttribute ="pacientes" 
		action ="/pacsearch/search" >
		 	
		 <div class="form-group">	 
		 	<sf:label path="cedula" for ="cedula">Cedula</sf:label>
		 	<sf:input path="cedula" size ="30" id="cedula" class="form-control"/>
		 	<sf:errors path ="cedula" cssClass ="error"/>
		 </div>	
		 <div class="form-group">
		 	 <br /> <br />
		 	<sf:label path="pacNombre" for ="pacNombre">Nombre</sf:label>
		 	<sf:input path="pacNombre" size ="30" id="pacNombre" class="form-control"/>
		 	<sf:errors path ="pacNombre" cssClass ="error"/>
		 </div>
		 <div class="form-group">
		 	<br/><br/>
		 	<sf:label path="pacApellido" for ="pacApellido">Apellido</sf:label>
		 	<sf:input path ="pacApellido" size ="30" id ="pacApellido" class="form-control"/>
		 	<sf:errors path ="pacApellido" cssClass ="error"/>
		 </div>

		 	<sf:button value ="Buscar">Buscar</sf:button>
		
	 </sf:form>
