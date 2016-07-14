<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="table well-sm">
	
	<caption><h1>Cuenta Tarjeta: ${cuenta}</h1></caption>
	
	<thead>
		<td>Id</td>
		<td>Cedula</td>
		<td>Caja</td>
		<<td>Serie</td>
		<td>Numero</td>
		<td>Tipo de documento</td>
		<td>Lote</td>		
		<td>Nro Tarjeta</td>
		<td>Importe</td>
		<td>Tratamiento</td>
		<td>Usuario</td>
	</thead>
		<tbody>
			<c:forEach var="pagoTarjeta" items="${pagoTarjeta}">
				<tr>
					<td ><a href='<s:url value="#"/>'>${pagoTarjeta.tarjId}</a></td>
					<td >${pagoTarjeta.tarjId}</td>
					<td>${pagoTarjeta.tarjetaCajaId}</td>
					<td>${pagoTarjeta.tarjPacCedula}</td>
					<td>${pagoTarjeta.tarjPagoId}</td>
					<td>${pagoTarjeta.tarjNro}</td>
					<td>${pagoTarjeta.tarjDesc}</td>
					<td>${pagoTarjeta.tarjVence}</td>
					<td>${pagoTarjeta.tarjImporte}</td>
					<td>${pagoTarjeta.tarjCuenta}</td>
					<td>${pagoTarjeta.cantCuotas}</td>
					<td>${pagoTarjeta.tarjPagoUsuario}</td>
				</tr>	
			</c:forEach>
		</tbody>
</table>
