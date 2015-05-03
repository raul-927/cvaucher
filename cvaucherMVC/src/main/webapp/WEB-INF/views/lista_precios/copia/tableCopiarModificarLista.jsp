<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<div class =" well well-lg">
	<sf:form cssClass = "form" method ="POST" commandName ="auxPrecios" >
		<input type="hidden" name="_flowExecutionKey" 
             value="${flowExecutionKey}"/>
             <h2>Copiar y modificar Lista de Precios</h2>
		<table class="table table-hover table-bordered well well-sm">
			<div class="form-group">
				
				<sf:label path="auxPrecId" for ="auxPrecId"><h2>ID: ${maxId} </h2></sf:label>
				<input type="hidden" name="auxPrecId" value="${maxId}"/>
				<sf:errors path ="auxPrecId" cssClass ="error"/>
			</div>
			<caption><h3>Seleccione una lista de precios</h3></caption>	
			<thead>
				<td><h5>#</h5></td>
				<td><h5>Descripcion</h5></td>
				<td><h5>Id Lista</h5></td>
				<td><h5>Fecha Inicio</h5></td>
				<td><h5>Fecha Fin</h5></td>
				
			</thead>
			
			<tbody>
				<c:forEach var="auxP" items="${auxP}">
					
					<tr>
						<td >
						<div class="form-group">
								<sf:label path="auxPrecId" for ="auxPrecId" value ="#{auxP.auxPrecId}">${auxP.auxPrecId}</sf:label>
						 		<input type="hidden" name="auxPrecId" value="${auxP.auxPrecId}"/>
						 		<sf:errors path ="auxPrecId" cssClass ="error"/>
						 </div>
						</td>
						<td >
							${auxP.auxPrecDescripcion}
						</td>
						<td >
							${auxP.auxListaPreciosId}
						</td>
						
						<td>
							${auxP.auxPrecFechIni}
					 	</td>
					 	
					 	<td>
							${auxP.auxPrecFechFin}
					 	</td>
					 	
					 	<td>
		 					<sf:label path="auxListaPreciosId" for ="auxListaPreciosId"/>
					 		<sf:radiobutton  id="rdAuxListaPreciosId" cssClass ="form-control" path="auxListaPreciosId" value ="${auxP.auxListaPreciosId}"/>
					 		<sf:errors path ="auxListaPreciosId" cssClass ="error"/>
					 	</td>
					 	
					 </tr>
				</c:forEach>
			</tbody>		
		</table>
		<div class="botonForm">			
			<input class="btn btn-primary" type ="submit" value ="Siguiente" name ="_eventId_fin"/>
		</div>
	</sf:form>
</div>
