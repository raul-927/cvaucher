<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>


<div class="form-group">
	<sf:label path="tratamiento" for ="tratamiento">Sesiones</sf:label>
	<sf:input cssClass ="form-control" path="tratamiento" value ="#{tratCantSes}"  size ="30" />
	<sf:errors path ="tratamiento" cssClass ="error"/>
</div>
	
	
