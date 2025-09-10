<%-- 
    Document   : altaUsuarios
    Created on : 5 sept 2025, 17:08:55
    Author     : ezego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en>"
<%@include file="components/header.jsp"%>
<div class="container vh-100 d-flex flex-column justify-content-center align-items-center">
    <h1 class="mb-4 text-primary">Alta Usuarios</h1>
    
    <div class="col-md-6">
        <div class="card shadow-lg border-0 rounded-4">
            <div class="card-body p-4">
                <form  action="${pageContext.request.contextPath}/SvUsuarios" method="POST">
        
                   
                    <div class="row mb-3">
                        <div class="col-md-6">
                            <div class="form-floating mb-3">
                                <input class="form-control" id="rol" type="text" placeholder="Rol" name="rol" />
                                <label for="rol">Rol</label>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-floating mb-3">
                                <input class="form-control" id="nombreUsu" type="text" placeholder="Nombre completo" name="nombreUsu" />
                                <label for="nombre">Nombre de usuario</label>
                            </div>
                        </div>
                    </div>
                    <div class="row mb-3">
                        <div class="col-md-6">
                            <div class="form-floating mb-3">
                                <input class="form-control" id="contrasenia" type="password" placeholder="Contraseña" name="contrasenia"/>
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
                        <button  class="btn btn-primary btn-lg rounded-3" type="submit">Crear Usuario</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<%@include file="components/footer.jsp" %>

