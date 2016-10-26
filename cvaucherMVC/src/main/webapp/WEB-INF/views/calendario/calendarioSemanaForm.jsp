<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<h3>Semana</h3>
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
		<tbody>	
			<tr>
				<td >
				8:00	
				</td>
				<td >
					<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Gabriela Silveira</button>
				
				<td ></td>
				<td ></td>
				<td ></td>
				<td ></td>
				<td ></td>
				<td ></td>
			</tr>
			<tr>
				<td >
				8:30	
				</td>
				<td >
					<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Maria Gonzalez</button>
				
				<td ></td>
				<td ></td>
				<td ></td>
				<td ></td>
				<td ></td>
				<td ></td>
			</tr>
			<tr>
				<td >
				9:00	
				</td>
				<td >
					<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Daniela Rodriguez</button>
				
				<td ></td>
				<td ></td>
				<td ></td>
				<td ></td>
				<td ></td>
				<td ></td>
			</tr>		
		</tbody>
	</table>
  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Modal Header</h4>
        </div>
        <div class="modal-body">
          <div class="container">
	          <sf:form cssClass = "form"
				method ="POST" 
				modelAttribute ="calendario" >
					<div class="form-group">
			 			<sf:label path="reserva" for ="reserva">reserva</sf:label>
			 			<sf:input path="reserva" size ="15" placeholder ="reserva"/>
			 			<sf:errors path ="reserva" cssClass ="error"/>
		 			</div>
				</sf:form>
          </div>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
    </div>
  </div>
