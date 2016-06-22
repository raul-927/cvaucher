<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>


<table class="table table-hover table-bordered well well-sm">
	<caption><h1>Formas de Pagos</h1></caption>
	<thead>
		<td>#</td>
		<td>Abreviacion</td>
		<td>Descripcion</td>
		<td>Tipo de Formas de Pago</td>
		<td>Cuentas</td>
	</thead>
	<tbody>
		<c:forEach var="forPag" items="${forPag}">
		<tr>
		<td>${forPag.formPagId}</td>
			<td>${forPag.formPagAbreviacion}</td>
			<td >${forPag.formPagDesc}</td>
			<td >${forPag.formPagTipo}</td>
			<td >${forPag.formPagCuenta.cuentaDesc}</td>
		</tr>		
		</c:forEach>	
	</tbody>
</table>
