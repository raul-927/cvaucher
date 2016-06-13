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
		<td><h3>Total</h3></td>
	</thead>
		<tbody>
			<c:forEach var="resumenCuentas" items="${resumenCuentas}">
				<tr>
					<td >${resumenCuentas.cuenta}</td>
					<td >${resumenCuentas.total}</td>
				</tr>	
			</c:forEach>
		</tbody>
</table>
