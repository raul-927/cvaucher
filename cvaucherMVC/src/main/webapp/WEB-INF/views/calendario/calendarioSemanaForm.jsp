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
				<h3>8:00</h3>	
				</td>
				<td >
				<a href="#" class="" data-toggle="modal" data-target="#myModal">Gabriela Silveira<b class="caret"></b></a>
				<td ><a href="#" class="" data-toggle="modal" data-target="#myModal">Gabriela Silveira<b class="caret"></b></a></td>
				<td ><a href="#" class="" data-toggle="modal" data-target="#myModal">Gabriela Silveira<b class="caret"></b></a></td>
				<td ><a href="#" class="" data-toggle="modal" data-target="#myModal">Gabriela Silveira<b class="caret"></b></a></td>
				<td ><a href="#" class="" data-toggle="modal" data-target="#myModal">Gabriela Silveira<b class="caret"></b></a></td>
				<td ><a href="#" class="" data-toggle="modal" data-target="#myModal">Gabriela Silveira<b class="caret"></b></a></td>
				<td ></td>
			</tr>
			<tr>
				<td >
				<h3>8:30</h3>	
				</td>
				<td >
					<a href="#" class="" data-toggle="modal" data-target="#myModal">Maria Gonzalez<b class="caret"></b></a>
				<td ><a href="#" class="" data-toggle="modal" data-target="#myModal">Maria Gonzalez<b class="caret"></b></a></td>
				<td ><a href="#" class="" data-toggle="modal" data-target="#myModal">Maria Gonzalez<b class="caret"></b></a></td>
				<td ><a href="#" class="" data-toggle="modal" data-target="#myModal">Maria Gonzalez<b class="caret"></b></a></td>
				<td ><a href="#" class="" data-toggle="modal" data-target="#myModal">Maria Gonzalez<b class="caret"></b></a></td>
				<td ><a href="#" class="" data-toggle="modal" data-target="#myModal">Maria Gonzalez<b class="caret"></b></a></td>
				<td ></td>
			</tr>
			<tr>
				<td >
				<h3>9:00</h3>	
				</td>
				<td >
				 <a href="#" class="" data-toggle="modal" data-target="#myModal">Daniela Rodriguez<b class="caret"></b></a>
				<td > <a href="#" class="" data-toggle="modal" data-target="#myModal">Daniela Rodriguez<b class="caret"></b></a></td>
				<td > <a href="#" class="" data-toggle="modal" data-target="#myModal">Daniela Rodriguez<b class="caret"></b></a></td>
				<td > <a href="#" class="" data-toggle="modal" data-target="#myModal">Daniela Rodriguez<b class="caret"></b></a></td>
				<td > <a href="#" class="" data-toggle="modal" data-target="#myModal">Daniela Rodriguez<b class="caret"></b></a></td>
				<td > <a href="#" class="" data-toggle="modal" data-target="#myModal">Daniela Rodriguez<b class="caret"></b></a></td>
				<td ></td>
			</tr>
			<tr>
				<td >
				<h3>10:00</h3>	
				</td>
				<td >
				 <a href="#" class="" data-toggle="modal" data-target="#myModal">Fernanda Martinez<b class="caret"></b></a>
				<td ><a href="#" class="" data-toggle="modal" data-target="#myModal">Fernanda Martinez<b class="caret"></b></a></td>
				<td ><a href="#" class="" data-toggle="modal" data-target="#myModal">Fernanda Martinez<b class="caret"></b></a></td>
				<td ><a href="#" class="" data-toggle="modal" data-target="#myModal">Fernanda Martinez<b class="caret"></b></a></td>
				<td ><a href="#" class="" data-toggle="modal" data-target="#myModal">Fernanda Martinez<b class="caret"></b></a></td>
				<td ><a href="#" class="" data-toggle="modal" data-target="#myModal">Fernanda Martinez<b class="caret"></b></a></td>
				<td ></td>
			</tr>
			<tr>
				<td >
				<h3>10:30</h3>	
				</td>
				<td >
				 <a href="#" class="" data-toggle="modal" data-target="#myModal">Leticia Hinze<b class="caret"></b></a>
				<td ><a href="#" class="" data-toggle="modal" data-target="#myModal">Leticia Hinze<b class="caret"></b></a></td>
				<td ><a href="#" class="" data-toggle="modal" data-target="#myModal">Leticia Hinze<b class="caret"></b></a></td>
				<td ><a href="#" class="" data-toggle="modal" data-target="#myModal">Leticia Hinze<b class="caret"></b></a></td>
				<td ><a href="#" class="" data-toggle="modal" data-target="#myModal">Leticia Hinze<b class="caret"></b></a></td>
				<td ><a href="#" class="" data-toggle="modal" data-target="#myModal">Leticia Hinze<b class="caret"></b></a></td>
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
          <h4 class="modal-title">Reserva</h4>
        </div>
        <div class="modal-body">
          <div class="container">
	          <sf:form cssClass = "form"
				method ="POST" 
				modelAttribute ="calendario" >
					<div class="form-group">
			 			<sf:label path="fecha" for ="fecha">fecha</sf:label>
			 			<sf:input cssClass ="inputText" path="fecha" size ="30"/>
			 			<sf:errors path ="fecha" cssClass ="error"/>
		 			</div>
		 			
		 			<div class="form-group">
			 			<sf:label path="hora" for ="hora">hora</sf:label>
			 			<sf:input cssClass ="inputText" path="hora" size ="30"/>
			 			<sf:errors path ="hora" cssClass ="error"/>
		 			</div>
		 			
		 			<div class="form-group">
			 			<sf:label path="tratamiento" for ="tratamiento">tratamiento</sf:label>
			 			<sf:textarea cssClass ="inputText" path="tratamiento" size ="30" id="descCAT"/>
			 			<sf:errors path ="tratamiento" cssClass ="error"/>
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
  <!-- 
  Fin Modal -->
