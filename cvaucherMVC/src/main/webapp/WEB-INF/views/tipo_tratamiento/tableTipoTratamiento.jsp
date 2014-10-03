<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="table table-hover table-bordered well well-sm">
	<caption><h1>Tipos de Tratamientos</h1></caption>
	
	<thead>
		<td>#</td>
		<td>Nombre</td>
	</thead>
		<tbody>
			<% int count = 2;%>
			<c:forEach var="tiptrat" items="${tpoTrat}">
			<%
				if(count % 2 == 0) 
				{ %>
					<tr class ="filaImpar">
			  <%}
				else 
				{%>
					<tr class ="filaPar">
			  <%} %>
			  	<td >${tiptrat.tipTratId}</td>
				<td >${tiptrat.tipTratDesc}</td>
				
				</tr>
				<%count ++; %>
			</c:forEach>	
		</tbody>
</table>
