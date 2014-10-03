<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

	<sf:form id ="frmDireccion" 
		method ="POST" 
		modelAttribute ="direccion" >
		 <fieldset style="width: 350px;">
		 	<legend>&nbsp;BAJA DE DIRECCIONES&nbsp;</legend>
	        <br />
		 	 
		 	<sf:label path="dirId" for ="dirId">Id</sf:label>
		 	<sf:input path="dirId" size ="10" id="descCAT"/>
		 	<sf:errors path ="dirId" cssClass ="error"/>
		 	
		 	<br /> <br />
		 	
		 </fieldset>
		 <div class="botonForm">
		 	<input type ="submit" value ="Aceptar"/>
		 	<input type ="reset" value ="Cancelar"/>
		 </div>
	 </sf:form>
