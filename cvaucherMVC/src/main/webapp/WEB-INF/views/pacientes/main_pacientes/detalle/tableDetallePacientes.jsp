<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<div class =" well well-lg">
<table class="table table-hover">
	<caption ><h3 class ="success">Datos Basicos</h3></caption>
	
	<tbody >
		<tr >
			<td><h4>Id</h4></td> 
			<td >${pacien.pacId}</td>
		</tr>
		<tr  >
			<td><h4>Cedula</h4></td> 
			<td> ${pacien.cedula}</td>
		</tr>
		<tr  >
			<td><h4>Nombre</h4></td>
			<td >${pacien.pacNombre}</td>
		</tr>
		<tr >
			<td><h4>Apellido</h4></td>
			<td >${pacien.pacApellido}</td>
		</tr>
		<tr  >
			<td><h4>Ocupacion</h4></td>
			<td >${pacien.ocupacion}</td>
		</tr>
		<tr >
			<td><h4>Soc Medica</h4></td>
			<td >${pacien.sociedadMedica}</td>
		</tr>
		<tr  >
			<td><h4>Emerg Movil</h4></td>
			<td >${pacien.emergenciaMovil}</td>
		</tr>
	</tbody>
</table>
</div>



