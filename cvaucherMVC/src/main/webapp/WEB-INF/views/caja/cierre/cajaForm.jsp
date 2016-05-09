<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ page session="false" %>

<div class="col-lg-12 col-lg-offset-6">
	<sf:form cssClass = "form-horizontal" 
		method ="POST" 
		commandName ="caja" >
		
		<input type="hidden" name="_flowExecutionKey" 
             value="${flowExecutionKey}"/>
             <legend class ="">&nbsp;<h2>Cierre de Caja</h2>&nbsp;</legend>
        <div class="form-group">
			<sf:label path="cajaUsr" for ="cajaUsr" value ="${user}"><h3>Usuario: <span class ="">${user}</span></h3></sf:label>
			<input type="hidden" name="cajaUsr" value="${user}"/>
			<sf:errors path ="cajaUsr" cssClass ="error"/>
		</div> 
		
		<div class="form-group">
			<sf:label path="cajaFecha" for ="cajaFecha" value ="${cajaFecha}"><h3>Fecha: <span>${fecha}</span></h3></sf:label>
			<input type="hidden" name="cajaFecha" value="${fecha}"/>
			<sf:errors path ="cajaFecha" cssClass ="error"/>
		</div>

		 <div class="form-group">
			<sf:label path="cajaHora" for ="cajaHora" value ="${cajaHora}"><h3>Hora: <span>${hora}</span></h3></sf:label>
			<input type="hidden" name="cajaHora" value="${hora}"/>
			<sf:errors path ="cajaHora" cssClass ="error"/>
		</div>
			
		 <div class="botonForm">
		 	<input class="btn btn-primary" type ="submit" value ="Apertura" name ="_eventId_cerrarCaja"/>
		 	<input class ="btn btn-default" type ="reset" value ="Cancelar" name ="_eventId_cancelar"/>			
		 </div>
	 </sf:form>
</div>