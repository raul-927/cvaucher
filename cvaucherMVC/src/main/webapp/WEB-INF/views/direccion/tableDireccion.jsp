<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="TituloTabla">
	<tr class="labelForm">
		<td>Id</td>
		<td>Paciente</td>
		<td>Tipo de Vivienda</td>
		<td>Calle</td>
		<td>Nro de Puerta</td>
		<td>Nro de Ap</td>
		<td>Calle 1</td>
		<td>Calle 2</td>
		
	<% int count = 2;%>
	<c:forEach var="dir" items="${direcc}">
	<%
		if(count % 2 == 0) 
		{ %>
			<tr class ="filaImpar">
	  <%}
		else 
		{%>
			<tr class ="filaPar">
	  <%} %>
		<td >${dir.dirId}</td>
		<td >${dir.pacientes.pacId} </td>
		<td >${dir.tpoVivienda}</td>
		<td >${dir.calle}</td>
		
		<td >${dir.nroPuerta}</td>
		<td >${dir.nroAp}</td>
		<td >${dir.calle1}</td>
		<td >${dir.calle2}</td>
		
		</tr>
		<%count ++; %>
	</c:forEach>	
</table>
