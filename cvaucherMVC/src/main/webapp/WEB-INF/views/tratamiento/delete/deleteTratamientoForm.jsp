<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<h3>Eliminar Tratamiento</h3>
<div class =" well well-lg">
	<sf:form cssClass = "form-inline"
		method ="POST" 
		modelAttribute ="tratamiento" >
		 <fieldset style="width: 350px;">
		 <div class="form-group">
		 	<sf:label path="tratId" for ="tratId">Id</sf:label>
		 	<sf:input cssClass ="inputText" path="tratId" size ="10" id="descCAT"/>
		 	<sf:errors path ="tratId" cssClass ="error"/>
		</div>
		 </fieldset>
		 <div class="botonForm">
		 	<input class= "btn btn-primary" type ="submit" value ="Aceptar"/>
		 	<input class ="btn btn-default" type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
</div>