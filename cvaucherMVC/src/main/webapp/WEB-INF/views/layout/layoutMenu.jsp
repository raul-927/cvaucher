<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
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
		                 <li><a href="#">Eliminar un paciente</a></li>
	                 </ul>
                </li>
               
                
                <li>
	                 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Cajas<b class="caret"></b></a>
	                 <ul class="dropdown-menu">
		                 <li><a href="#">Apertura de Caja</a></li>
		                 <li><a href="#">Cierre de Caja</a></li>
		                 <li class="divider"></li>
		                 <li><a href="#">Arqueo de Caja</a></li>
		                 
	                 </ul>
                </li>
                
                <li><!-- Inicio Menu Configuracion -->
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Configuracion<b class="caret"></b></a>
                    <ul class="dropdown-menu multi-level">
                        <li class="dropdown-submenu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Usuarios</a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Crear Usuario</a></li>
		                 		<li><a href="#">Modificar Usuario</a></li>
		                 		<li><a href="#">Eliminar Usuario</a></li>
		                 		<li class="divider"></li>
                                
                                <li class="dropdown-submenu">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown</a>
                                    <ul class="dropdown-menu">
                                        <li class="dropdown-submenu">
                                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown</a>
                                            <ul class="dropdown-menu">
                                                <li><a href="#">Crear un Nuevo Paciente</a></li>
                                                <li><a href="#">Modificar un paciente</a></li>
                                                <li><a href="#">Eliminar un paciente</a></li>
                                                <li class="divider"></li>
                                                <li><a href="#">Separated link</a></li>
                                                <li class="divider"></li>
                                                <li><a href="#">One more separated link</a></li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                        
                      <li class="dropdown-submenu">
                      	<a href="#" class="dropdown-toggle" data-toggle="dropdown">Roles</a>
                      	<ul class="dropdown-menu">
                                <li><a href="#">Crear Rol</a></li>
		                 		<li><a href="#">Modificar Rol</a></li>
		                 		<li><a href="#">Eliminar Rol</a></li>
		                 		<li class="divider"></li>
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
                      <li class="dropdown-submenu">
                      	<a href="#" class="dropdown-toggle" data-toggle="dropdown">Promociones</a>
                      	<ul class="dropdown-menu">
                        	<li><a href="#">Opcion1</a></li>
		                 	<li><a href="#">Opcion2</a></li>
		                 	<li><a href="#">Opcion3</a></li>
		                 	<li class="divider"></li>
		                </ul>
                      </li>
                      
                      <li class="dropdown-submenu">
                      	<a href="#" class="dropdown-toggle" data-toggle="dropdown">Sesiones</a>
                      	<ul class="dropdown-menu">
                        	<li><a href="#">Opcion1</a></li>
		                 	<li><a href="#">Opcion2</a></li>
		                 	<li><a href="#">Opcion3</a></li>
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
                      
                      <li class="divider"></li>
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                        <li class="divider"></li>
                        <li><a href="#">One more separated link</a></li>
                    </ul>
                </li>
                 
             
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</div>

