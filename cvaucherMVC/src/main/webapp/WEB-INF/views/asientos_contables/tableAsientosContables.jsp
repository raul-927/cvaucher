<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="table table-hover table-bordered well well-sm">
	<caption><h1>Asientos Contables</h1></caption>
	
	<thead>
		<td>Id</td>
		<td>Estado</td>
		<td>Forma de pago</td>
		<td>Monto</td>
		<td>Tipo de Movimiento</td>
	</thead>
		<tbody>
			<c:forEach var="pac" items="${pac}">
				<tr>
			  		<td>${pac.pacId}</td>
					<td><a href="<s:url value="/detallep/detPac/${pac.cedula}"/>">${pac.cedula}</a></td>
					<td >${pac.pacNombre}</td>
					<td >${pac.pacApellido}</td>
					<td >${pac.ocupacion}</td>
					<td >${pac.sociedadMedica}</td>
					<td >${pac.emergenciaMovil}</td>
				</tr>	
			</c:forEach>
		</tbody>
</table>
