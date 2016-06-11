<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<div id="navbarExample" class="navbar navbar-default " role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
             <a class="navbar-brand" href="#">Menu</a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
               
            </ul>
            <ul class="nav navbar-nav">
          
                <li class="active"><a href="<s:url value="/pacsearch"/>">Inicio</a></li>
                 <li>
	                 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Pacientes<b class="caret"></b></a>
	                 <ul class="dropdown-menu">
		                 <li><a href='<s:url value="/pacientes"/>'>Crear un nuevo Paciente</a></li>
		               	<security:authorize access="hasRole('ROLE_ADMIN')"><li><a href="#">Eliminar un paciente</a></li> </security:authorize>
	                 </ul>
                </li>
                
                <li>
	                 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Cajas<b class="caret"></b></a>
	                 <ul class="dropdown-menu">
		                 <li><a href="<s:url value="/caja/apertura"/>">Abrir/Cerrar Caja</a></li>
		                 <li class="divider"></li>
		                 <li><a href="<s:url value="/caja/gastos"/>">Ingresar Gastos</a></li>
		                 <li><a href="<s:url value="/caja/cobranza"/>">Ingresar Cobranza</a></li>
		                 <li class="divider"></li>
		                 <li><a href="<s:url value="/caja/arqueo"/>">Arqueo de Caja</a></li>
		                 <li><a href="<s:url value="/caja/consultas"/>">Consultas</a></li>
		                <li><a href="<s:url value="/caja/reportes"/>">Reportes</a></li>
		                <li><a href="<s:url value="/caja?resumen"/>">Resumen</a></li>
	                 </ul>
                </li>
             	
             	<security:authorize access="hasRole('ROLE_ADMIN') or (hasRole('ROLE_USER') and authentication.name == 'gaby')">
                <li><!-- Inicio Menu Configuracion -->
                 
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">Configuracion<b class="caret"></b></a>
                    <ul class="dropdown-menu multi-level">
                        <li class="dropdown-submenu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Usuarios</a>
                            <ul class="dropdown-menu">
                                <li><a href='<s:url value="/domain_user?insert"/>'>Crear Usuario</a></li>
		                 		<li><a href='<s:url value="/domain_user?update"/>'>Modificar Usuario</a></li>
		                 		<li><a href='<s:url value="/domain_user?delete"/>'>Eliminar Usuario</a></li>
		                 		<li class="divider"></li>
                               
                                
                        </li>
                     </ul>
               </li>
                        
               <li class="dropdown-submenu">
               	<a href="#" class="dropdown-toggle" data-toggle="dropdown">Roles</a>
                	<ul class="dropdown-menu">
                    	<li><a href='<s:url value="/roles?insert"/>'>Crear Rol</a></li>
		                <li><a href="#">Modificar Rol</a></li>
		                <li><a href="#">Eliminar Rol</a></li>
		                <li class="divider"></li>
		                <li><a href="#">Asignar Roles a Usuarios</a></li>
		            </ul>
               </li>
                      
               <li class="dropdown-submenu">
               	<a href="#" class="dropdown-toggle" data-toggle="dropdown">Objetos</a>
                	<ul class="dropdown-menu">
                    	<li><a href="#">Crear Objeto</a></li>
		                <li><a href="#">Modificar Objeto</a></li>
		                <li><a href="#">Eliminar Objeto</a></li>
		                <li class="divider"></li>
		            </ul>
              </li>
              <li class="divider"></li>
              	<li class="dropdown-submenu">
                	<a href="#" class="dropdown-toggle" data-toggle="dropdown">Tipo de Tratamientos</a>
                    	<ul class="dropdown-menu">
                        	<li><a href='<s:url value="/tipo_tratamiento?insert"/>'>Crear un nuevo Tipo de Tratamiento</a></li>
		                 	<li><a href='<s:url value="/tipo_tratamiento?update"/>'>Modificar un Tipo de Tratamiento</a></li>
		                 	<li><a href='<s:url value="/tipo_tratamiento?delete"/>'>Eliminar un Tipo de Tratamiento</a></li>
		                 	<li class="divider"></li>
		                </ul>
               </li>
               <li class="dropdown-submenu">
               	<a href="#" class="dropdown-toggle" data-toggle="dropdown">Tratamientos</a>
                	<ul class="dropdown-menu">
                    	<li><a href='<s:url value="/tratamientos?insert"/>'>Crear un nuevo Tratamiento</a></li>
		                <li><a href='<s:url value="/tratamientos?update"/>'>Modificar un Tratamiento</a></li>
		                <li><a href='<s:url value="/tratamientos?delete"/>'>Eliminar un Tratamiento</a></li>
		                <li class="divider"></li>
		           	</ul>
              </li>
              <li class="divider"></li>
              	<li class="dropdown-submenu">
                	<a href="#" class="dropdown-toggle" data-toggle="dropdown">Lista de Precios</a>
                    	<ul class="dropdown-menu">
                        	<li><a href='<s:url value="/listaPrecios"/>'>Crear Lista de Precios</a></li>
		                 	<li><a href="#">Modificar Lista de Precios</a></li>
		                 	<li><a href="#">Eliminar Lista de Precios</a></li>
		                 	<li class="divider"></li>
		                </ul>
               </li>
               <li class="dropdown-submenu">
               	<a href="#" class="dropdown-toggle" data-toggle="dropdown">Promociones</a>
                	<ul class="dropdown-menu">
                    	<li><a href="/tipos_promociones">Tipos de Promociones</a></li>
		                <li><a href="/grupos_promociones">Trabajar con grupos de promociones</a></li>
		                <li><a href="/formulas_promociones">Formulas de promociones</a></li>
		                <li class="divider"></li>
		            </ul>
              </li>
              
              	<li class="divider"></li>
              		<li class="dropdown-submenu">
                    	<a href="#" class="dropdown-toggle" data-toggle="dropdown">Contabilidad</a>
                        <ul class="dropdown-menu">
                        	<li><a href='<s:url value="/grupo_cuentas?insert"/>'>Grupos de Cuentas</a></li>
                        	<li><a href='<s:url value="/cuentas/cuenta?insert"/>'>Cuentas</a></li>
                        	<li><a href='<s:url value="/formasDePagos?insert"/>'>Formas de Pagos</a></li>
                        	<li class="divider"></li>
		                 	<li><a href='<s:url value="/impuestos?insert"/>'>Impuestos</a></li>
		                 	<li><a href='<s:url value="/asientos?insert"/>'>Asientos</a></li>
		                </ul>	
                    </li>    
              	<li class="divider"></li>
              	 <li><a href='<s:url value="/formasDePagos?insert"/>'>Recursos Humanos</a></li>
               </security:authorize> 
               
           </ul>
             <li>
	                 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Reportes<b class="caret"></b></a>
	                 <ul class="dropdown-menu">
		                 <li><a href='<s:url value="/estadisticas"/>'>Estadisticas</a></li>
	                 </ul>
                </li>
        </div><!--/.nav-collapse -->
    </div>
</div>

