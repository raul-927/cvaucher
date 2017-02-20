<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="table table-hover table-bordered well well-sm">
	<caption><h1>Horarios Laborales</h1></caption>
	
	<thead>
		<td>Hora desde</td>
		<td>Hora hasta</td>
		<td>Semana</td>
		<td>Mes</td>
		<td>Descripcion</td>

	</thead>
		<tbody>
			<c:forEach var="muestroHorarioLaboral" items="${muestroHorarioLaboral}">
				<tr>
			  		<td>${muestroHorarioLaboral.horLabId}</td>
			  		<td >${muestroHorarioLaboral.horLabHoraDesde}</td>
					<td >${muestroHorarioLaboral.horLabHoraHasta}</td>
					<td >${muestroHorarioLaboral.horLabSemana}</td>
					<td >${muestroHorarioLaboral.horLabMes}</td>
					<td >${muestroHorarioLaboral.horLabDesc}</td>
				</tr>	
			</c:forEach>
		</tbody>
</table>
