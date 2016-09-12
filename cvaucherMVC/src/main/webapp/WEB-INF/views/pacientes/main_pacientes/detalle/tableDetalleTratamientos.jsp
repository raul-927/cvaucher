<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
  
<table class="table">
	
	<thead>
		<tr>
			
			<th>Fecha</th>
			<th>Tratamiento</th>
			<th>Sesiones</th>
			<th>Importe </th>
			<th>Pagado</th>
			<th>Saldo</th>
			
		</tr>
	</thead>
	<tbody class ="table-striped">
		<c:forEach var="tratPac" items="${tratPac}">
			<tr>
				
			  	<td ><a href="<s:url value ="/detallep/detPac/${tratPac.cedula}/${tratPac.tratPacId}"/>">${tratPac.fecha}</a></td>
				<td >${tratPac.tratDesc}</td>
				<td >${tratPac.cantSesiones}</td>
				<td >${tratPac.costoTratamiento}</td>
				<td >${tratPac.importePagado}</td>
				<td >${tratPac.saldoPendiente}</td>
			</tr>
		</c:forEach>	
	</tbody>
</table>