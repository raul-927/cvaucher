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
			<th>Tipo de Vivienda</th>
			<th>Calle</th>
			<th>Nro de Puerta</th>
			<th>Nro de Ap</th>
			<th>Entre calle</th>
			<th>y calle</th>
		</tr>
	</thead>
	<tbody class ="table-striped">
		<c:forEach var="direc" items="${direc}">
		<tr>
			<td >${direc.dirId}</td>
			<td >${direc.tpoVivienda}</td>
			<td >${direc.calle}</td>
			<td >${direc.nroPuerta}</td>
			<td >${direc.nroAp}</td>
			<td >${direc.calle1}</td>
			<td >${direc.calle2}</td>
		</tr>	
		</c:forEach>
	</tbody>
</table>


