<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<div class="well well-lg">
	
	<sf:form cssClass ="form" action ="?pagos"
		modelAttribute ="historialPagos">

	        <div class="form-group">
			 	<sf:label path="histPagosFechaPago" for ="histPagosFechaPago">Fecha</sf:label>
			 	<sf:input cssClass ="input-small " path="histPagosFechaPago"  value ="#{salida}" size ="8" enabled = "false"/>
			 	<sf:errors path ="histPagosFechaPago" cssClass ="error"/>
		 	</div>
		 	<div class="form-group">
			 	<sf:label path="histPagosMonto" for ="histPagosMonto">Importe</sf:label>
			 	<sf:input cssClass ="form-control" path="histPagosMonto" size ="30" placeholder ="Importe" class="form-control" />
			 	<sf:errors path ="histPagosMonto" cssClass ="error"/>
		 	</div>
		 	
			 <div class="botonForm">
				 <input class ="btn btn-default" type ="reset" value ="Cancelar" />
				 <input class="btn btn-primary" type ="submit" value ="Ingresar Pago"/>
			</div>
			
	 </sf:form>
</div>