<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="table well-sm">
	<caption><h1>Cuenta Efectivo: ${pagoEfectivo.pagEfCuenta}</h1></caption>
	
	<thead>
		<td>Id</td>
		<td>Caja</td>
		<td>TratamientoId</td>
		<td>Cedula</td>
		<td>Importe</td>
		<td>Descripcion</td>
		<td>Usuario</td>
	</thead>
		<tbody>
			<c:forEach var="pagoEfectivo" items="${pagoEfectivo}">
				<tr>
					<td ><a href='<s:url value="#"/>'>${pagoEfectivo.efId}</a></td>
					<td >${pagoEfectivo.pagoEfCajaId}</td>
					<td>${pagoEfectivo.pagoEfId}</td>
					<td>${pagoEfectivo.pagoEfCedula}</td>
					<td>${pagoEfectivo.pagoEfImporte}</td>
					<td>${pagoEfectivo.pagoEfDesc}</td>
					<td>${pagoEfectivo.pagoEfUsuario}</td>
				</tr>	
			</c:forEach>
		</tbody>
</table>
