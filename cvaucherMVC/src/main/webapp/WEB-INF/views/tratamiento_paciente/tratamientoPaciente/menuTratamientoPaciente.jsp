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
             
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
               
            </ul>
            <ul class="nav navbar-nav">
                
                <li>
	                 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Datos Basicos<b class="caret"></b></a>
	                 <ul class="dropdown-menu">
		                 <li><a href="#">Modificar Datos Basicos</a></li>
	                 </ul>
                </li> 
                 
                <li>
	                 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Direccion<b class="caret"></b></a>
	                 <ul class="dropdown-menu">
		                 <li><a href="#">Ingresar Direccion</a></li>
		                 <li><a href="#">Modificar Direccion</a></li>
		                 <li><a href="#">Eliminar Direccion</a></li>
	                 </ul>
                </li>
                <li>
	                 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Agenda<b class="caret"></b></a>
	                 <ul class="dropdown-menu">
		                 <li><a href="#">Ingresar Agenda</a></li>
		                 <li><a href="#">Modificar Agenda</a></li>
		                 <li><a href="#">Eliminar Agenda</a></li>
	                 </ul>
                </li>
                 <li>
	                 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Historia Clinica<b class="caret"></b></a>
	                 <ul class="dropdown-menu">
		                 <li><a href="#">Ingresar Historia Clinica</a></li>
		                 <li><a href="#">Modificar Historia Clinica</a></li>
		                 <li><a href="#">Eliminar Historia Clinica</a></li>
	                 </ul>
                </li>
                
                <li>
	                 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Tratamientos<b class="caret"></b></a>
	                 <ul class="dropdown-menu">
		                 <li><a href='<s:url value="?actualizar"/>'>Ingresar Tratamiento</a></li>
		                 <li><a href="#">Ingresar Sesiones</a></li>
	                 </ul>
                </li>
                
                <li>
	                 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Reportes<b class="caret"></b></a>
	                 <ul class="dropdown-menu">
		                 <li><a href="#">Tratamientos Realizados</a></li>
		                 <li><a href="#">Saldos Pendientes</a></li>
	                 </ul>
                </li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</div>

