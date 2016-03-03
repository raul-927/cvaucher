<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>


<table class="table table-hover table-bordered well well-sm">
	<caption><h1>Roles</h1></caption>
	
	<thead>
		<td>#</td>
		<td>Rol</td>
	</thead>
		<tbody>
			
			<c:forEach var="roles" items="${allroles}">
				<tr>
				  	<td >${roles.rolId}</td>
					<td >${roles.rolName}</td>
				</tr>
			</c:forEach>	
		</tbody>
</table>
