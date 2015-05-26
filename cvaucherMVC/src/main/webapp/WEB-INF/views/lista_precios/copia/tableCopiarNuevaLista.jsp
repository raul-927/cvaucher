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
				
				<sf:label path="listPrecId" for ="listPrecId"><h2>ID: ${auxPrecios2} </h2></sf:label>
				<input type="hidden" name="listPrecId" value="${auxPrecios2}"/>
				<sf:errors path ="listPrecId" cssClass ="error"/>
			</div>
				<caption><h3>Precios actuales</h3></caption>	
				<thead>
					<td><h3>#</h3></td>
					<td><h3>Descripcion</h3></td>
					<td><h3>Importe</h3></td>
				</thead>
				
				<tbody>
					<c:forEach var="trat" items="${listap}">
						
						<tr>
							<td >
							<div class="form-group">
									<sf:label path="listPrecTratId" for ="listPrecTratId" value ="#{trat.listPrecTratId}">${trat.listPrecTratId}</sf:label>
							 		<input type="hidden" name="listPrecTratId" value="${trat.listPrecTratId}"/>
							 		<sf:errors path ="listPrecTratId" cssClass ="error"/>
							 </div>
							</td>
							
							<td >
								${trat.listPrecDesc}
							</td>
							
							<td>
								<div cssClass="form-group">
									${trat.listPrecMonto}
								</div>
						 	</td>
						 </tr>
					</c:forEach>
				</tbody>		
			</table>
			
		</sf:form>
	</div>


