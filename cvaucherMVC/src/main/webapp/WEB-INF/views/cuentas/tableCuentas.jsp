<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="table table-hover table-bordered well well-sm">
	<caption><h1>Cuentas</h1></caption>
	
	<thead>
		<td>Id</td>
		<td>Tipo grupo</td>
		<td>Grupo</td>
		<td>Descripcion</td>
		<td>Tipo de Cuenta</td>
		<td>Fecha</td>
		<td>Hora</td>
		<td>Usuario</td>
	</thead>
		<tbody>
			<c:forEach var="muestroCuentas" items="${muestroCuentas}">
				<tr>
			  		<td>${muestroCuentas.cuentaId}</td>
			  		<td >${muestroCuentas.grupoCuentas.tipoCuenta}</td>
					<td >${muestroCuentas.grupoCuentas.grupoCuentaDesc}</td>
					<td >${muestroCuentas.cuentaDesc}</td>
					<td >${muestroCuentas.cuentaTipo}</td>
					<td >${muestroCuentas.cuentaFecha}</td>
					<td >${muestroCuentas.cuentaHora}</td>
					<td >${muestroCuentas.cuentaUsuario}</td>
				</tr>	
			</c:forEach>
		</tbody>
</table>
