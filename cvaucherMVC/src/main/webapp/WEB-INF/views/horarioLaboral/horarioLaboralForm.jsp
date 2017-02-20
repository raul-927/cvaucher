<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<h3>Crear Nuevo Horario Laboral</h3>
<div class =" well well-lg">
	
	<sf:form cssClass = "form"
		method ="POST" 
		modelAttribute ="horarioLaboral" >
		 <fieldset style="width: 350px;">
			 	
		 	<div class="form-group">
			 	<sf:label path="horLabHoraDesde" for ="horLabHoraDesde">Hora desde</sf:label>
			 	<sf:input cssClass ="form-control" path="horLabHoraDesde" size ="6"/>
			 	<sf:errors path ="horLabHoraDesde" cssClass ="error"/>
		 	</div>
		 
		 	<div class="form-group">
			 	<sf:label path="horLabHoraHasta" for ="horLabHoraHasta">Hora hasta</sf:label>
			 	<sf:input cssClass ="form-control" path="horLabHoraHasta" size ="6"/>
			 	<sf:errors path ="horLabHoraHasta" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="horLabSemana" for ="horLabSemana">Semana</sf:label>
			 	<sf:input cssClass ="form-control" path="horLabSemana" size ="6"/>
			 	<sf:errors path ="horLabSemana" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="horLabMes" for ="horLabMes">Mes</sf:label>
			 	<sf:input cssClass ="form-control" path="horLabMes" size ="6"/>
			 	<sf:errors path ="horLabMes" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="HorLabDesc" for ="horLabDesc">Descripcion</sf:label>
			 	<sf:input cssClass ="form-control" path="horLabDesc" size ="6"/>
			 	<sf:errors path ="horLabDesc" cssClass ="error"/>
		 	</div>

		 </fieldset>
		 <div class="botonForm">
		 	<input class= "btn btn-primary" type ="submit" value ="Aceptar"/>
		 	<input class ="btn btn-default" type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
</div>
	
