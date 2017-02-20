<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<h3>Crear Nueva Jornada Laboral</h3>
<div class =" well well-lg">
	
	<sf:form cssClass = "form"
		method ="POST" 
		modelAttribute ="jonradaLaboral" >
		 <fieldset style="width: 350px;">
			 	
		 	<div class="form-group">
			 	<sf:label path="jorLabHoraDesde" for ="jorLabHoraDesde">Hora desde</sf:label>
			 	<sf:input cssClass ="form-control" path="jorLabHoraDesde" size ="6"/>
			 	<sf:errors path ="jorLabHoraDesde" cssClass ="error"/>
		 	</div>
		 
		 	<div class="form-group">
			 	<sf:label path="jorLabHoraHasta" for ="jorLabHoraHasta">Hora hasta</sf:label>
			 	<sf:input cssClass ="form-control" path="jorLabHoraHasta" size ="6"/>
			 	<sf:errors path ="jorLabHoraHasta" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="jorLabSemana" for ="jorLabSemana">Semana</sf:label>
			 	<sf:input cssClass ="form-control" path="jorLabSemana" size ="6"/>
			 	<sf:errors path ="jorLabSemana" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="jorLabMes" for ="jorLabMes">Mes</sf:label>
			 	<sf:input cssClass ="form-control" path="jorLabMes" size ="6"/>
			 	<sf:errors path ="jorLabMes" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="jorLabDesc" for ="jorLabDesc">Descripcion</sf:label>
			 	<sf:input cssClass ="form-control" path="jorLabDesc" size ="6"/>
			 	<sf:errors path ="jorLabDesc" cssClass ="error"/>
		 	</div>

		 </fieldset>
		 <div class="botonForm">
		 	<input class= "btn btn-primary" type ="submit" value ="Aceptar"/>
		 	<input class ="btn btn-default" type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
</div>
	
