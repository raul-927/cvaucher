<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="TituloTabla">

	<tr class="labelForm">
		<td>Id</td>
		<td>Cedula</td>
		<td>Nombre</td>
		<td>Apellido</td>
		<td>Ocupacion</td>
		<td>Soc Medica</td>
		<td>Emerg Movil</td>
	</tr>	

	<tr>
	  	<td >${pac.pacId}</td>
		<td><a href="<c:url value="detallep?${pac.cedula}"/>">${pac.cedula}</a></td>
		<td >${pac.pacNombre}</td>
		<td >${pac.pacApellido}</td>
		<td >${pac.ocupacion}</td>
		<td >${pac.sociedadMedica}</td>
		<td >${pac.emergenciaMovil}</td>

	</tr>
	
</table>
