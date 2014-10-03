<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="TituloTabla">
	<tr class="labelForm">
		<td>Id</td>
		<td>Tipo de tratamiento</td>
		<td>Descripcion</td>
	<% int count = 2;%>
	<c:forEach var="trat" items="${trat}">
	<%
		if(count % 2 == 0) 
		{ %>
			<tr class ="filaImpar">
	  <%}
		else 
		{%>
			<tr class ="filaPar">
	  <%} %>
		<td >${trat.tratId}</td>
		<td >${trat.tipoTratamiento.tipTratDesc}</td>
		<td >${trat.tratDescripcion}</td>
		</tr>
		<%count ++; %>
	</c:forEach>	
</table>
