<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
<script>
	/*$(function (){
    $('#cedula').keyup(function (){
      this.value = (this.value + '').replace(/[^0-9]/g, '');
    });
  });*/
	$(function(){
	$('#documento').keydown(function(event) {
		   if(event.shiftKey){
		        event.preventDefault();
		   }
		   if (event.keyCode == 46 || event.keyCode == 8){
		   }
		   else{
		        if (event.keyCode < 95){
		          if (event.keyCode < 48 || event.keyCode > 57){
		                event.preventDefault();
		          }
		        }
		        else {
		              if (event.keyCode < 96 || event.keyCode > 105) {
		                  event.preventDefault();
		              }
		        }
		      }
		   
		   })
		   $('#documento').val.substr(3);
	});// de la funcion
</script>
<div class="well well-lg">
	
	<sf:form cssClass = "form"
		commandName ="pacientes2">
		
			<input type="hidden" name="_flowExecutionKey" 
             value="${flowExecutionKey}"/>
             
            <div class="form-group ">
		 		<sf:label path="tipoDocPaciente" for ="tipoDocPaciente">Tipo de Documento</sf:label>
		 		<sf:select cssClass ="form-control" path="tipoDocPaciente" size ="1">
		 		<sf:options items="${tipDoc}" />
		 		</sf:select>
		 		<sf:errors path ="tipoDocPaciente" cssClass ="error"/>
		 	</div>
		 
	        <div class="form-group">
			 	<sf:label path="documento" for ="documento">Documento</sf:label>
			 	<sf:input cssClass ="input-small " value ="${flowScope.docum}"  path="documento" size ="8" id="documento"/>
			 	<sf:errors path ="documento" cssClass ="error"/>
		 	</div>
		 	<!-- <span>Documento ${flowScope.docum}</span> -->
		 	<div class="form-group">
			 	<sf:label path="pacNombre" for ="pacNombre">Nombre</sf:label>
			 	<sf:input cssClass ="form-control" path="pacNombre" size ="30" placeholder ="Nombre" id="descCAT" class="form-control" />
			 	<sf:errors path ="pacNombre" cssClass ="error"/>
		 	</div>
		 	<div class="form-group">
			 	<sf:label path="pacApellido" for ="pacApellido">Apellido</sf:label>
			 	<sf:input cssClass ="form-control" path="pacApellido" placeholder ="Apellido" size ="30" id="descCAT"/>
			 	<sf:errors path ="pacApellido" cssClass ="error"/>
		 	</div>
		 	<div class="form-group">
			 	<sf:label path="ocupacion" for ="ocupacion">Ocupacion</sf:label>
			 	<sf:input cssClass ="form-control" path="ocupacion" placeholder ="Ocupacion" size ="30" id="descCAT"/>
			 	<sf:errors path ="ocupacion" cssClass ="error"/>
		 	</div>
		 	<div class="form-group">
			 	<sf:label path="sociedadMedica" for ="sociedadMedica">Soc Medica</sf:label>
			 	<sf:input cssClass ="form-control" path="sociedadMedica" placeholder ="Sociedad Medica" size ="30" id="descCAT"/>
			 	<sf:errors path ="sociedadMedica" cssClass ="error"/>
		 	</div>
		 	<div class="form-group">
			 	<sf:label path="emergenciaMovil" for ="emergenciaMovil">Emerg Movil</sf:label>
			 	<sf:input cssClass ="form-control" path="emergenciaMovil" placeholder ="Emergencia Movil" size ="30" id="descCAT"/>
			 	<sf:errors path ="emergenciaMovil" cssClass ="error"/>
		 	</div>
		 	
			 <div class="botonForm">
				 <input class ="btn btn-default" type ="reset" value ="Cancelar" name ="_eventId_cancelar"/>
				 <input class="btn btn-primary" type ="submit" value ="Siguiente" name ="_eventId_pacienteIngresado"/>
			</div>
			
	 </sf:form>
</div>