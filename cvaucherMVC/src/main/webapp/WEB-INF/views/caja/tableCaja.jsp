<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="table well-sm">
	<caption><h1>Resumen de Caja</h1></caption>
	
	<thead>
		<td><h3>Cuenta</h3></td>
		<td><h3>Importe</h3></td>
	</thead>
		<tbody>
			<c:set var="resutlado" value="${0}"></c:set>
			<c:forEach var="resumenCuentas" items="${resumenCuentas}">
				<c:set var="resutlado" value="${resutlado + resumenCuentas.total}"></c:set>
				<tr>
					<td ><a href='<s:url value="/caja/detalle/${resumenCuentas.tipo}/${resumenCuentas.cuenta}"/>'>${resumenCuentas.cuenta}</a></td>
					<td >${resumenCuentas.total}</td>
				</tr>	
			</c:forEach>
		</tbody>
		<tbody>
			<tr>
				<td><h3>TOTAL</h3></td>
				<td><h3><c:out value="${resutlado}"></c:out></h3></td>
			</tr>
		</tbody>
</table>
