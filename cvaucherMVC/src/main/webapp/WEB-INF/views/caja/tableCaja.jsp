<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="table well-sm">
	<caption><h1>Caja</h1></caption>
	
	<thead>
		<td>Cuenta</td>
		<td>Total</td>
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
