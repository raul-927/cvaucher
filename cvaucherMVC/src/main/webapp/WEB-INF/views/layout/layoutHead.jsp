<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<img class ="prueba" src="<s:url value="/resources" />/Images/Logo CE_Vaucher_Transparente.png" 
	alt="Insertar logotipo aqu�" width="140" height="120" 
	id="Insert_logo" 
	style="display:block;"/>
	
	
	<span class =""><c:url value="/logout" var="logoutUrl" />
			<a class ="logoutOpcion" href="${logoutUrl}">Cerrar Sesion</a></span>

	<span class =""><c:url value="${userName}" var="username" />
	Usuario: "${username}"</span> 
	<span class =""><c:url value="${userRole}" var="userrole" />
	Rol: "${userrole}"</span> <br/>
	
