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
			<th>Importe</th>
			<th>Tipo</th>
		</tr>
	</thead>
	<tbody class ="table-striped">
		<c:forEach var="histP" items="${histPagosByTratPacId}">
			<tr>
			  	<td >${histP.histPagosFechaPago}</td>
				<td >${histP.histPagosMonto}</td>
				<td> ${histP.histPagosTipo}</td>
			</tr>
		</c:forEach>	
	</tbody>
</table>
