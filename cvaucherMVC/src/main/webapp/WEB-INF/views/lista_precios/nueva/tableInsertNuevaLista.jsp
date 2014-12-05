<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<div class =" well well-lg">
	<sf:form cssClass = "form" method ="POST" commandName ="listaPreciosArray" >
		<table class="table table-hover table-bordered well well-sm">
			<div class="form-group">
				<sf:label path="listPrecId" for ="listPrecId">Id de Lista</sf:label>
				<sf:input cssClass ="form-control" path="listPrecId"  size ="50" />
				<sf:errors path ="listPrecId" cssClass ="error"/>
			</div>
			<caption><h3>Ingrese Monto a cada tratamiento</h3></caption>	
			<thead>
				<td>#</td>
				<td>Descripcion</td>
				<td>Importe</td>
			</thead>
			
			<tbody>
				<c:forEach var="trat" items="${trat}">
					
					<tr>
						<td >
						<div class="form-group">
						 		<sf:input cssClass ="form-control" path="listPrecTratId" value ="#{trat.tratId}" size ="50" />
						 		<sf:errors path ="listPrecTratId" cssClass ="error"/>
						 </div>
						</td>
						
						<td >
							${trat.tratDescripcion}
						</td>
						
						<td>
							<div class="form-group">
						 		<sf:input cssClass ="form-control" path="listPrecMonto" size ="50" />
						 		<sf:errors path ="listPrecMonto" cssClass ="error"/>
						 	</div>
					 	</td>
					 </tr>
				</c:forEach>
			</tbody>		
		</table>
		<div class="botonForm">			
			<input class="btn btn-primary" type ="submit" value ="Siguiente" name ="_eventId_nuevaListaSiguiente"/>
		</div>
	</sf:form>
</div>