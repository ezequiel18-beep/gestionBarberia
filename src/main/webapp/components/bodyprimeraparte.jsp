<%-- 
    Document   : bodyPrimeraParte
    Created on : 5 sept 2025, 13:42:38
    Author     : ezego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Barbería Blinder's</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">
    <link rel="stylesheet" href="css/styles.css"><!-- CSS de SB Admin -->
</head>
<body class="sb-nav-fixed">

    <!-- 🔹 Navbar -->
   <nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
    <!-- Marca -->
    <a class="navbar-brand ps-3" href="index.html">Barbería Blinder's</a>

    <!-- Menú de usuario (alineado a la derecha) -->
    <ul class="navbar-nav ms-auto me-3">
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" 
               data-bs-toggle="dropdown" aria-expanded="false">
               <i class="fas fa-user fa-fw"></i>
            </a>
            <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                <li><a class="dropdown-item" href="#!">Configuración</a></li>
                <li><hr class="dropdown-divider" /></li>
                <li><a class="dropdown-item" href="#!">Cerrar sesión</a></li>
            </ul>
        </li>
    </ul>
    </nav>

    <div id="layoutSidenav">
        <!-- 🔹 Sidebar -->
        <div id="layoutSidenav_nav">
            <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
                <div class="sb-sidenav-menu">
                    <div class="nav">       

                        <!-- Menú principal -->
                        <a class="nav-link" href="index.html">
                            <div class="sb-nav-link-icon"><i class="fas fa-home"></i></div>
                            Menú
                        </a>

                        <!-- Gestión de Barberos -->
                        <div class="sb-sidenav-menu-heading">Gestión</div>
                        <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseBarberos" aria-expanded="false" aria-controls="collapseBarberos">
                            <div class="sb-nav-link-icon"><i class="fas fa-user"></i></div>
                            Barberos
                            <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                        </a>
                        <div class="collapse" id="collapseBarberos" data-bs-parent="#sidenavAccordion">
                            <nav class="sb-sidenav-menu-nested nav">
                                <a class="nav-link" href="verBarberos.html">Ver Barberos</a>
                                <a class="nav-link" href="altaBarbero.jsp">Alta Barberos</a>
                            </nav>
                        </div>

                        <!-- Gestión de Clientes -->
                       <!-- Usuarios -->
                        <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseUsuarios" aria-expanded="false" aria-controls="collapseUsuarios">
                            <div class="sb-nav-link-icon"><i class="fas fa-users"></i></div>
                            Usuarios
                            <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                        </a>
                        <div class="collapse" id="collapseUsuarios" data-bs-parent="#sidenavAccordion">
                            <nav class="sb-sidenav-menu-nested nav">
                                <a class="nav-link" href="verUsuarios.jsp">Ver Usuario</a>
                                <a class="nav-link" href="altaUsuarios.jsp">Alta Usuario</a>
                            </nav>
                        </div>

                        <!-- Clientes -->
                        <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseClientes" aria-expanded="false" aria-controls="collapseClientes">
                            <div class="sb-nav-link-icon"><i class="fas fa-users"></i></div>
                            Clientes
                            <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                        </a>
                        <div class="collapse" id="collapseClientes" data-bs-parent="#sidenavAccordion">
                            <nav class="sb-sidenav-menu-nested nav">
                                <a class="nav-link" href="verClientes.html">Ver Clientes</a>
                                <a class="nav-link" href="altaClientes.jsp">Alta Clientes</a>
                            </nav>
                        </div>


                    </div>
                </div>
                <div class="sb-sidenav-footer">
                    <div class="small">Conectado como:</div>
                    Admin
                </div>
            </nav>
        </div>

        <!-- 🔹 Contenido principal -->
        <div id="layoutSidenav_content">
            <main>
                <div class="container-fluid px-4">
                    <p>Bienvenido al sistema de gestión de Barbería Blinder's.</p>
                </div>
            </main>
        </div>
    </div>

    <!-- Bootstrap + JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <script src="js/scripts.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
