<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>


<table class="table table-hover table-bordered well well-sm">
	<caption><h1>Usuarios</h1></caption>
	
	<thead>
		<td>#</td>
		<td>Nombre</td>
		<td>Apellido</td>
		<td>Nic</td>
		<td>Activado</td>
		
	</thead>
		<tbody>
			
			<c:forEach var="users" items="${allDomainUser}">
				<tr>
				  	<td >${users.domUsrId}</td>
					<td >${users.domUsrNom}</td>
					<td >${users.domUsrAp}</td>
					<td>${users.domUsrNic}</td>
					<td>${users.domUsrEnabled}</td>
				
				</tr>
			</c:forEach>	
		</tbody>
</table>
