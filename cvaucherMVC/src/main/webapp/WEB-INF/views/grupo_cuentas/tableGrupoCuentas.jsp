<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="table table-hover table-bordered well well-sm">
	<caption><h1>Grupos de Cuentas</h1></caption>
	
	<thead>
		<td>Id</td>
		<td>Tipo de Cuentas</td>
		<td>Descripcion</td>
	</thead>
		<tbody>
			<c:forEach var="grpoCuenta" items="${grpoCuenta}">
				<tr>
			  		<td>${grpoCuenta.grupoCuentaId}</td>
					<td >${grpoCuenta.tipoCuenta}</td>
					<td >${grpoCuenta.grupoCuentaDesc}</td>
				</tr>	
			</c:forEach>
		</tbody>
</table>
