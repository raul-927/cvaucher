<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<h3>Semana</h3>

<sf:form cssClass = "form"
	method ="POST" 
	modelAttribute ="calendario" >
	<table class="table table-hover table-bordered well well-sm">
	<thead>
		<tr>
			<th><h1>Hora</h1></th>
			<th><h1>Lunes</h1></th>
			<th><h1>Martes</h1></th>
			<th><h1>Miércoles</h1></th>
			<th><h1>Jueves</h1></th>
			<th><h1>Viernes</h1></th>
			<th><h1>Sábado</h1></th>
			<th><h1>Domingo</h1></th>
		</tr>
	</thead>
	<tbody class ="table-striped">	
		<tr>
			<td ></td>
			<td ></td>
			<td ></td>
			<td ></td>
			<td ></td>
		</tr>		
	</tbody>
</table>
	 </sf:form>

	
