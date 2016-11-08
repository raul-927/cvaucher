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
	    	<div class="modal-header fondo">
	    		<button type="button" class="close" data-dismiss="modal">&times;</button>
	          <div class="row">
		          <div class="col-xs-10 col-sm-12 col-md-6 col-lg-6">
		          	<span>&nbsp;</span>
		          	<h2 class="modal-title"><span class="tituloModal">RESERVA:</span> <span class="contenidoTituloModal">17</span></h2>
		          </div>
		          <div class="col-xs-10 col-sm-12 col-md-6 col-lg-6">
		          	<h2 class="modal-title"><span class="tituloModal">PACIENTE:</span> <span class="cuerpoModal">Gabriela Silveira</span></h2>
		          </div>
		        </div>
	        </div>
	        <div class="modal-body">
	          <div class="container">
	          <div class="row">
	          	<div class="col-xs-10 col-sm-12 col-md-6">
	          		<div class="form-group">
				 		<h4>
				 		<span class="tituloModal">FECHA:</span> <span class="cuerpoModal">27/11/2016</span>
				 		<span class="tituloModal">DIA:</span> <span class="cuerpoModal">Martes</span>
				 		<span class="tituloModal">HORA:</span><span class="cuerpoModal"> 16:00</span>
				 		</h4>			 			
			 		</div>
			 		<div class="form-group">
			 			<h4><span class="tituloModal">TIEMPO DE TRATAMIENTO:</span><span class="cuerpoModal"> 50 minutos</span></h4>
			 		</div>
			 		<div class="form-group">
				 		<h4><span class="tituloModal">TRATAMIENTO:</span> &nbsp;<span class="cuerpoModal">Masaje descontracturante</span></h4>
			 		</div>
	          	</div>
		          <div class="col-xs-10 col-sm-12 col-md-6">
		          	<div class="form-group">
					 	<h4><span class="tituloModal">CONSULTORIO:</span> <span class="cuerpoModal">16</span></h4>
				 	</div>
				 	<div class="form-group">
					 	<h4><span class="tituloModal">CAMILLA:</span> <span class="cuerpoModal">3</span></h4>
				 	<div class="form-group">
					 	<h4><span class="tituloModal">ESTADO:</span> <span class="contenidoEstadoVigente">Vigente</span></h4>
				 	</div>
		          </div>
	          </div>
	          </div>
	        </div>
	        <div class="modal-footer">
	        	<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
	        </div>
	      </div>
	    </div>
	  </div>
  </div>
  <!-- 
  Fin Modal -->
