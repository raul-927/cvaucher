<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="table well-sm">
	
	<caption><h1>Cuenta: ${cuenta}</h1></caption>
	
	<thead>
		<td>Id</td>
		<td>Cedula</td>
		<td>Caja</td>
		<%-- <td>Serie</td>
		<td>Numero</td>
		<td>Tipo de documento</td> --%>
		<td>Tratamiento</td>
		<td>Importe</td>
		<td>Tipo pago</td>
		<td>Usuario</td>
	</thead>
		<tbody>
			<c:forEach var="pagoEfectivo" items="${pagoEfectivo}">
				<tr>
					<td><a href='<s:url value="/caja/detalle/${tipo}/${cuenta}/${pagoEfectivo.asientoNro}"/>'>${pagoEfectivo.asientoNro}</a></td>
					<td>${pagoEfectivo.pagoEfCedula}</td>
					<td >${pagoEfectivo.pagoEfCajaId}</td>
					
					<td>${pagoEfectivo.pagoEfId}</td>
					
					<td>${pagoEfectivo.pagoEfImporte}</td>
					<td>${pagoEfectivo.pagoEfDesc}</td>
					<td>${pagoEfectivo.pagoEfUsuario}</td>
				</tr>	
			</c:forEach>
		</tbody>
</table>
