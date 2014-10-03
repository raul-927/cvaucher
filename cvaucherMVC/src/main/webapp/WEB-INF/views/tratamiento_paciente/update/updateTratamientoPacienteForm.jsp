<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

	<sf:form id ="frmTratUpdate" 
		method ="POST" 
		modelAttribute ="tratamiento" >
		 <fieldset style="width: 350px;">
		 	<legend>&nbsp;MODIFICAR TRATAMIENTOS&nbsp;</legend>
	        <br />
		 	 
		 	  <br /> <br />
		 	<sf:label path="tratId" for ="tratId">Id</sf:label>
		 	<sf:input path="tratId" size ="5" id="descCAT"/>
		 	<sf:errors path ="tratId" cssClass ="error"/>
		 	
		 	
		 	 <br /> <br />
		 	<sf:label path="tipoTratamiento.tipTratId" for ="tipoTratamiento.tipTratId">Tipo</sf:label>
		 	<sf:select path="tipoTratamiento.tipTratId" size ="1" id="descCAT">
		 		
		 		<sf:options items="${tipoTrat}" itemLabel="tipTratDesc" itemValue="tipTratId" />
		 		
		 	</sf:select>
		 	<sf:errors path ="tipoTratamiento.tipTratId" cssClass ="error"/>
		 	 
		 	  <br /> <br />
		 	<sf:label path="tratDescripcion" for ="tratDescripcion">Descripcion</sf:label>
		 	<sf:input path="tratDescripcion" size ="30" id="descCAT"/>
		 	<sf:errors path ="tratDescripcion" cssClass ="error"/>
		 	
		 	
		 	<br /> <br />
		 	
		 </fieldset>
		 <div class="botonForm">
		 	<input type ="submit" value ="Aceptar"/>
		 	<input type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
