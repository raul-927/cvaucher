<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<div class =" well well-lg">
	<sf:form cssClass = "form" method ="POST" commandName ="listaPreciosArray" >
		<input type="hidden" name="_flowExecutionKey" 
             value="${flowExecutionKey}"/>
             
		<table class="table table-hover table-bordered well well-sm">
			<div class="form-group">
				
				<sf:label path="listPrecId" for ="listPrecId"><h2>ID: ${maxId - 1} </h2></sf:label>
				<input type="hidden" name="listPrecId" value="${maxId -1}"/>
				<sf:errors path ="listPrecId" cssClass ="error"/>
			</div>
			<caption><h3>Ingrese Monto a cada tratamiento</h3></caption>	
			<thead>
				<td><h3>#</h3></td>
				<td><h3>Descripcion</h3></td>
				<td><h3>Importe</h3></td>
			</thead>
			
			<tbody>
				<c:forEach var="trat" items="${trat}">
					
					<tr>
						<td >
						<div class="form-group">
								<sf:label path="listPrecTratId" for ="listPrecTratId" value ="#{trat.tratId}">${trat.tratId}</sf:label>
						 		<input type="hidden" name="listPrecTratId" value="${trat.tratId}"/>
						 		<sf:errors path ="listPrecTratId" cssClass ="error"/>
						 </div>
						</td>
						
						<td >
							${trat.tratDescripcion}
						</td>
						
						<td>
							<div class="form-group">
						 		<sf:input cssClass ="form-control" path="listPrecMonto"  value = "0" size ="50" />
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
