<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@	taglib prefix ="sf" uri ="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>


<div class="form-group">
	<sf:label path="cantSesiones" for ="cantSesiones">Sesiones</sf:label>
	<c:forEach var = "aux" items ="${tratP}">
			
			<c:if test ="${aux.tratId == tratPacById.tratId}">
				<c:set var ="aux2" value ="#{tratPacById.tratCantSesiones}"/>
			</c:if>
	</c:forEach>
	<sf:input cssClass ="form-control" path="cantSesiones"   value ="${aux2}" size ="30" />
	<sf:errors path ="cantSesiones" cssClass ="error"/>
</div>
	

