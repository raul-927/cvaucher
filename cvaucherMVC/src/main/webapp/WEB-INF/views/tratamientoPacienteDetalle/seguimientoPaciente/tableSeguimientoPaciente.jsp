<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="table">
	
	<thead>
		<tr>
			<th>Fecha control</th>
			<th>Brazo Izquierdo (cm)</th>
			<th>Brazo Derecho (cm)</th>
			<th>Muzlo Izquierdo (cm)</th>
			<th>Muzlo Derecho (cm)</th>
			<th>Abdomen (cm)</th>
			<th>Cintura (cm)</th>
			<th>Cadera (cm)</th>
			<th>Peso (Kg)</th>
			<th>I.M.C</th>
			<th>Observaciones</th>
		</tr>
	</thead>
	<tbody class ="table-striped">
		<c:forEach var="segp" items="${segP}">
			<tr>
			  	<td >${segp.fechControl}</td>
				<td >${segp.brazoI}</td>
				<td >${segp.brazoD}</td>
				<td >${segp.muzloI}</td>
				<td >${segp.muzloD}</td>
				<td >${segp.abdomen}</td>
				<td >${segp.cintura}</td>
				<td >${segp.cadera}</td>
				<td >${segp.peso}</td>
				<td >${segp.imc}</td>
				<td >${segp.observaciones}</td>
				
			</tr>
		</c:forEach>	
	</tbody>
</table>
