<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<div class="well well-lg">
	
	<sf:form cssClass = "form"
		method ="POST"
		modelAttribute ="roles">

	        <div class="form-group">
			 	<sf:label path="rolName" for ="rolName">Rol</sf:label>
			 	<sf:input cssClass ="form-control" path="rolName" size ="30" placeholder ="Rol" class="form-control" />
			 	<sf:errors path ="rolName" cssClass ="error"/>
		 	</div>

		<div class="botonForm">
		 	<input class= "btn btn-primary" type ="submit" value ="Aceptar"/>
		 	<input class ="btn btn-default" type ="reset" value ="Cancelar"/>
		 </div>
			
	 </sf:form>
</div>