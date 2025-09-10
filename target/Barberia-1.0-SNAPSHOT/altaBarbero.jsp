<%-- 
    Document   : altas
    Created on : 5 sept 2025, 11:46:02
    Author     : ezego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="components/header.jsp"%>
<div class="container vh-100 d-flex flex-column justify-content-center align-items-center">
    <h1 class="mb-4 text-primary">Alta Barberos</h1>
    
    <div class="col-md-6">
        <div class="card shadow-lg border-0 rounded-4">
            <div class="card-body p-4">
                <form>
                    <div class="row mb-3">
                        <div class="col-md-6">
                            <div class="form-floating mb-3">
                                <input class="form-control" id="telefono" type="text" placeholder="Teléfono" />
                                <label for="telefono">Teléfono</label>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-floating mb-3">
                                <input class="form-control" id="dni" type="text" placeholder="DNI" />
                                <label for="dni">DNI</label>
                            </div>
                        </div>
                    </div>

                    <div class="row mb-3">
                        <div class="col-md-6">
                            <div class="form-floating mb-3">
                                <input class="form-control" id="apellido" type="text" placeholder="Apellido" />
                                <label for="apellido">Apellido</label>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-floating mb-3">
                                <input class="form-control" id="nombre" type="text" placeholder="Nombre completo" />
                                <label for="nombre">Nombre </label>
                            </div>
                        </div>
                    </div>

                    <div class="form-floating mb-3">
                        <input class="form-control" id="direccion" type="text" placeholder="Dirección" />
                        <label for="direccion">Dirección</label>
                    </div>

                   
                    <div class="form-floating mb-3">
                        <input class="form-control" id="fechaNac" type="date" placeholder="Fecha de nacimiento" />
                        <label for="fechaNacimiento">Fecha de nacimiento</label>
                    </div>

                    <div class="row mb-3">
                        <div class="col-md-6">
                            <div class="form-floating mb-3">
                                <input class="form-control" id="contrasenia" type="password" placeholder="Contraseña" />
                                <label for="password">Contraseña</label>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-floating mb-3">
                                <input class="form-control" id="passwordConfirm" type="password" placeholder="Repetir contraseña" />
                                <label for="passwordConfirm">Repetir contraseña</label>
                            </div>
                        </div>
                    </div>

                    <div class="d-grid">
                        <button class="btn btn-primary btn-lg rounded-3" type="submit">Crear Cuenta</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>


<%@include file="components/footer.jsp" %>
