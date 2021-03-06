<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="table table-hover table-bordered well well-sm">
	<caption><h1>Jornadas Laborales</h1></caption>
	
	<thead>
		<td>Hora desde</td>
		<td>Hora hasta</td>
		<td>Semana</td>
		<td>Mes</td>
		<td>Descripcion</td>

	</thead>
		<tbody>
			<c:forEach var="muestroJornadaLaboral" items="${muestroJornadaLaboral}">
				<tr>
			  		<td>${muestroJornadaLaboral.jorLabId}</td>
			  		<td >${muestroJornadaLaboral.jorLabHoraDesde}</td>
					<td >${muestroJornadaLaboral.jorLabHoraHasta}</td>
					<td >${muestroJornadaLaboral.jorLabSemana}</td>
					<td >${muestroJornadaLaboral.jorLabMes}</td>
					<td >${muestroJornadaLaboral.jorLabDesc}</td>
				</tr>	
			</c:forEach>
		</tbody>
</table>
