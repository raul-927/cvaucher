<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<table class="table">

	<thead>
		<tr>
			<th>Diabetes</th>
			<th>Epilepsia</th>
			<th>Marca-paso</th>
			<th>Diu</th>
			<th>Problemas Cardiacos</th>
			<th>Medicacion</th>
			<th>Cantidad Hijos</th>
		</tr>
	</thead>
	
	<tbody class ="table-striped">
		<tr>
			
			<td>
			<c:choose>
      			<c:when test="${historiaC.diabetes == true}">
      				<c:out value="SI"/>
      			</c:when>
      			<c:otherwise>
      				<c:out value="NO"/>
      			</c:otherwise>
			</c:choose>
			</td>
			
			<td>
			<c:choose>
      			<c:when test="${historiaC.epilepsia == true}">
      				<c:out value="SI"/>
      			</c:when>
      			<c:otherwise>
      				<c:out value="NO"/>
      			</c:otherwise>
			</c:choose>
			</td>
			
			<td>
			<c:choose>
      			<c:when test="${historiaC.marcaPaso == true}">
      				<c:out value="SI"/>
      			</c:when>
      			<c:otherwise>
      				<c:out value="NO"/>
      			</c:otherwise>
			</c:choose>
			</td>
			
			<td>
			<c:choose>
      			<c:when test="${historiaC.diu == true}">
      				<c:out value="SI"/>
      			</c:when>
      			<c:otherwise>
      				<c:out value="NO"/>
      			</c:otherwise>
			</c:choose>
			</td>
			
			<td>${historiaC.problemasCardiacos}</td>
			<td>${historiaC.medicacion}</td>
			<td>${historiaC.cantHijos}</td>
			
		</tr>
	</tbody>
	
</table>	

<table class="table">

	<thead>
		<tr>
			<th>Operaciones</th>
			<th>Hipertension</th>
			<th>Procesos Oncologicos</th>
			<th>Tiroides</th>
			<th>Actividad Fisica</th>
			<th>Cant Consumo Agua</th>
			<th>Alimentacion</th>
		</tr>
	</thead>

	<tbody class ="table-striped">	
		<tr>
			<td>${historiaC.operaciones}</td>
			
			<td>
			<c:choose>
      			<c:when test="${historiaC.hipertension == true}">
      				<c:out value="SI"/>
      			</c:when>
      			<c:otherwise>
      				<c:out value="NO"/>
      			</c:otherwise>
			</c:choose>
			</td>
			
			<td>
			<c:choose>
      			<c:when test="${historiaC.procesosOncologicos == true}">
      				<c:out value="SI"/>
      			</c:when>
      			<c:otherwise>
      				<c:out value="NO"/>
      			</c:otherwise>
			</c:choose>
			</td>
			
			<td>
			<c:choose>
      			<c:when test="${historiaC.tiroides == true}">
      				<c:out value="SI"/>
      			</c:when>
      			<c:otherwise>
      				<c:out value="NO"/>
      			</c:otherwise>
			</c:choose>
			</td>
			
			<td>${historiaC.actividadFisica}</td>
			<td>${historiaC.cantConsumoAguaDiaria}</td>
			<td>${historiaC.alimentacion}</td>
		</tr>	
	</tbody>
</table>
