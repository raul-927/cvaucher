<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="table well-sm">
	
	<caption><h1>Asiento contable Nro: ${asConNro}</h1></caption>
	
	<thead>
		<td>Debe</td>
		<td>Haber</td>
		<td>Descripcion</td>
		<td>Fecha</td>
		<td>Hora</td>
		<td>Usuario</td>
	</thead>
		<tbody>
			<c:forEach var="asCont" items="${asCont}">
				<tr>
					<td >${asCont.asCuentaDebeMonto}</td>
					<td>${asCont.asCuentaHaberMonto}</td>
					<td>${asCont.asConDescripcion}</td>
					<td>${asCont.asConFecha}</td>
					<td>${asCont.asConHora}</td>
					<td>${asCont.asConUsr}</td>
				</tr>	
			</c:forEach>
		</tbody>
</table>
