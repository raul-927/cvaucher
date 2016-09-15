<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="table well-sm">
	
	<caption><h1>Asiento contable Nro: ${asConNro}</h1></caption>
	
	<thead>
		<td><h4>Debe</h3></td>
		<td><h4>Haber</h4></td>
		<td><h4>Descripcion</h4></td>
	</thead>
		<tbody>
			<c:forEach var="asCont" items="${asCont}">
				<tr>
					<td><h4>${asCont.asCuentaDebeMonto}</h4></td>
					<td><h4>${asCont.asCuentaHaberMonto}</h4></td>
					<td><h4>${asCont.asConDescripcion}</h4></td>
				</tr>	
			</c:forEach>
		</tbody>
</table>
