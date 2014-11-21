<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<div class="well well-lg">
	
	<sf:form cssClass ="form" action="?seg"
		modelAttribute ="seguimientoPacientes">

	        <div class="form-group">
			 	<sf:label path="fechControl" for ="fechControl">Fecha de control</sf:label>
			 	<sf:input cssClass ="input-small " path="fechControl"  value ="#{salida}" size ="8" enabled = "false"/>
			 	<sf:errors path ="fechControl" cssClass ="error"/>
		 	</div>
		 	<div class="form-group">
			 	<sf:label path="brazoI" for ="brazoI">Brazo Izquierdo (cm)</sf:label>
			 	<sf:input cssClass ="form-control" path="brazoI" size ="30" placeholder ="Brazo Izquierdo" class="form-control" />
			 	<sf:errors path ="brazoI" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="brazoD" for ="brazoD">Brazo Derecho (cm)</sf:label>
			 	<sf:input cssClass ="form-control" path="brazoD" size ="30" placeholder ="Brazo Derecho" class="form-control" />
			 	<sf:errors path ="brazoD" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="muzloI" for ="muzloI">Muzlo Izquierdo (cm)</sf:label>
			 	<sf:input cssClass ="form-control" path="muzloI" size ="30" placeholder ="Muzlo Izquierdo" class="form-control" />
			 	<sf:errors path ="muzloI" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="muzloD" for ="muzloD">Muzlo Derecho (cm)</sf:label>
			 	<sf:input cssClass ="form-control" path="muzloD" size ="30" placeholder ="Muzlo Derecho" class="form-control" />
			 	<sf:errors path ="muzloD" cssClass ="error"/>
		 	</div>
		 	
		 	
		 	<div class="form-group">
			 	<sf:label path="abdomen" for ="abdomen">Abdomen (cm)</sf:label>
			 	<sf:input cssClass ="form-control" path="abdomen" size ="30" placeholder ="Abdomen" class="form-control" />
			 	<sf:errors path ="abdomen" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="cintura" for ="cintura">Cintura (cm)</sf:label>
			 	<sf:input cssClass ="form-control" path="cintura" size ="30" placeholder ="Cintura" class="form-control" />
			 	<sf:errors path ="cintura" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="cadera" for ="cadera">Cadera (cm)</sf:label>
			 	<sf:input cssClass ="form-control" path="cadera" size ="30" placeholder ="Cadera" class="form-control" />
			 	<sf:errors path ="cadera" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="peso" for ="peso">Peso (Kg)</sf:label>
			 	<sf:input cssClass ="form-control" path="peso" size ="30" placeholder ="Peso" class="form-control" />
			 	<sf:errors path ="peso" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="imc" for ="imc">I.M.C</sf:label>
			 	<sf:input cssClass ="form-control" path="imc" size ="30" placeholder ="I.M.C" class="form-control" />
			 	<sf:errors path ="imc" cssClass ="error"/>
		 	</div>
		 	
		 	<div class="form-group">
			 	<sf:label path="observaciones" for ="observaciones">Observaciones</sf:label>
			 	<sf:input cssClass ="form-control" path="observaciones" size ="30" placeholder ="Observaciones" class="form-control" />
			 	<sf:errors path ="observaciones" cssClass ="error"/>
		 	</div>
		 	
			 <div class="botonForm">
				 <input class ="btn btn-default" type ="reset" value ="Cancelar" />
				 <input class="btn btn-primary" type ="submit" value ="Ingresar Datos"/>
			</div>
			
	 </sf:form>
</div>