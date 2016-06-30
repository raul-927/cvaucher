<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="table table-hover table-bordered well well-sm">
	<caption><h1>Impuestos</h1></caption>

	<thead>
		
		<td>#</td>
		<td>Descripcion</td>
		<td>Abreviaci&oacute;n</td>
		<td>Valor</td>
		<td>Tipo impuesto</td>
		<td>Cuenta</td>
	</thead>
		<tbody>
			<c:forEach var="imp" items="${impuestos}">
				<tr>
			  		<td >${imp.impuestoId}</td>
					<td >${imp.impuestoDesc}</td>
					<td >${imp.impuestoDescAbrv}</td>
					<td >${imp.impuestoValor}</td>
					<td >${imp.impuestoTipo}</td>
					<td >${imp.impuestoCuenta.cuentaDesc}</td>
				</tr>
			</c:forEach>	
		</tbody>
</table>
