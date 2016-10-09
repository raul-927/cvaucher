<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ page session="false" %>
<div class ="row">
	<div class ="col-xs-12">
		<div class ="col-xs-12">
			<img class ="prueba" src="<s:url value="/resources" />/Images/Logo CE_Vaucher_Transparente.png" 
	alt="Insertar logotipo aquí" width="140" height="120" 
	id="Insert_logo" 
	style="display:block;"/>
	<span ><c:url value="/logout" var="logoutUrl" />
			<a class ="logoutOpcion" href="${logoutUrl}">Cerrar Sesion</a></span>
			
				<span class ="credenciales">Nombre: <span class ="credenciales2"><security:authentication  property="principal.username"/></span></span>
				<br/> 
				<br/>
				<span class ="credenciales">Rol: <span class ="credenciales2"><security:authentication  property="principal.authorities"/></span></span> 
			
			
		</div>
		
	</div>	
</div>

	
	
