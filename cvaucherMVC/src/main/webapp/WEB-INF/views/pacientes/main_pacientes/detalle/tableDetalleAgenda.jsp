<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="table">
	
	<thead>
		<tr>
			<th>Id</th>
			<th>Tipo de Dato</th>
			<th>Dato</th>
		</tr>
	</thead>
	<tbody class ="table-striped">
		<c:forEach var="ag" items="${ag}">
			<tr>
			  	<td >${ag.agPacId}</td>
				<td >${ag.tipoAgenda}</td>
				<td >${ag.dato}</td>
			</tr>
		</c:forEach>	
	</tbody>
</table>
