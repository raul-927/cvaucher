<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<div class="well well-lg">
	
	<sf:form cssClass = "form"
		method ="POST"
		modelAttribute ="domainUser">

	        <div class="form-group">
			 	<sf:label path="domUsrNom" for ="domUsrNom">Nombre</sf:label>
			 	<sf:input cssClass ="form-control" path="domUsrNom" size ="30" placeholder ="Nombre" class="form-control" />
			 	<sf:errors path ="domUsrNom" cssClass ="error"/>
		 	</div>
		 	<div class="form-group">
			 	<sf:label path="domUsrAp" for ="domUsrAp">Apellido</sf:label>
			 	<sf:input cssClass ="form-control" path="domUsrAp" size ="30" placeholder ="Apellido" class="form-control" />
			 	<sf:errors path ="domUsrAp" cssClass ="error"/>
		 	</div>
		 	<div class="form-group">
			 	<sf:label path="domUsrNic" for ="domUsrNic">Nic</sf:label>
			 	<sf:input cssClass ="form-control" path="domUsrNic" placeholder ="Nic" size ="30"/>
			 	<sf:errors path ="domUsrNic" cssClass ="error"/>
		 	</div>
		 	<div class="form-group">
			 	<sf:label path="domUsrPass" for ="domUsrPass">Contraseña</sf:label>
			 	<sf:password cssClass ="form-control" path="domUsrPass" placeholder ="Contraseña" size ="30" id="descCAT"/>
			 	<sf:errors path ="domUsrPass" cssClass ="error"/>
		 	</div>
		 	<div class="form-group">
		 	<sf:label path="domUsrEnabled" for ="domUsrEnabled">Activo</sf:label>
		 	<sf:checkbox cssClass ="form-control" path="domUsrEnabled" size ="1"/>
		 	<sf:errors path ="domUsrEnabled" cssClass ="error"/>
		 </div>
		 	
		 	
		<div class="botonForm">
		 	<input class= "btn btn-primary" type ="submit" value ="Aceptar"/>
		 	<input class ="btn btn-default" type ="reset" value ="Cancelar"/>
		 </div>
			
	 </sf:form>
</div>