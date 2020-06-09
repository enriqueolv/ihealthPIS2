<%-- 
    Document   : GUIPrincipalClientes
    Created on : 5/03/2020, 04:36:10 PM
    Author     : Kevin Enrique
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ include file="/WEB-INF/navbar2.html" %>
        <div class="container">
            <h2>Nombre usuario</h2>
            <ul class="nav nav-tabs">
                <li class="nav-item">
                    <a class="nav-link active" data-toggle="tab" href="#citas">Citas</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" data-toggle="tab" href="#recetas">Recetas</a>
                </li><li class="nav-item">
                    <a class="nav-link" data-toggle="tab" href="#expediente">Expediente Medico</a>
                </li>
            </li><li class="nav-item">
            <a class="nav-link" data-toggle="tab" href="#pagos">Pagos</a>
        </li>
    </ul>

    <div class="tab-content">  
        
        <div class="tab-pane container active" id="citas">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-sm-12">
                        <div class="card mt-3">
                            <div class="card-header">
                                <h5 class="card-title">Lista de Citas</h5>
                            </div>
                            <div class="card-body">
                                <!--
                                en esta area se colocara el codigo 
                                visualizar los usuarios
                                -->
                                <p class="text-center">No hay Citas por el momento</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-sm-12">
                        <div class="card mt-3">
                            <div class="card-header">
                                <h5 class="card-title">Visualizacion de la Cita Seleccionada</h5>
                            </div>

                            <div class="card-body">
                                <!--
                                en esta area se colocara el codigo 
                                visualizar los usuarios
                                -->
                                <p class="text-center">Ninguna Cita seleccionada</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12 col-sm-12">

                        <section class="card mt-3">
                            <div class="card-header">
                                <h5 class="card-title">Solicitar Cita</h5>
                            </div>
                            <div class="card-body">
                                <form>
                                    <div class="form-group">
                                        <label>Usuario:</label>
                                        <!--<input class="form-control" type="text" name="usuario">-->
                                    </div>
                                    <div class="form-group">
                                        <label>Correo:</label>
                                        <!--<input class="form-control" type="text" name="correo">-->
                                    </div>
                                    <div class="form-group">
                                        <label>Fecha</label>
                                        <input class="form-control" type="text" name="fecha">
                                    </div>
                                    <div class="form-group">
                                        <label>Hora de Inicio</label>
                                        <input class="form-control" type="time" name="horaInicio">
                                    </div>
                                    <div class="form-group">
                                        <label>Hora Final</label>
                                        <input class="form-control" type="time" name="horaFinal">
                                    </div>
                                    <div class="form-group col-md-4">
                                        <label for="inputServicio">Servicio</label>
                                        <select id="Servicio" class="form-control">
                                            <option select value="1">Servicio1</option>
                                            <option value="2">Servicio2</option>
                                            <option value="3">Servicio3</option>
                                        </select>
                                    </div>
                                    <div class="form-group col-md-4">
                                        <label for="inputDoctor">Doctor</label>
                                        <select id="Doctor" class="form-control">
                                            <option select value="1">Doctor1</option>
                                            <option value="2">Doctor2</option>
                                            <option value="3">Doctor3</option>
                                        </select>
                                    </div>
                                    <div class="form-group col-md-4">
                                        <label for="inputHospital">Hospital</label>
                                        <select id="Hospital" class="form-control">
                                            <option select value="1">Hospital Materno Infantil</option>
                                            <option value="2">Hospital General Xoco</option>
                                            <option value="3">Hospital General La Villa</option>
                                        </select>
                                    </div>
                                    <button class="btn btn-success">Solicitar</button>
                                </form>
                            </div>
                        </section>
                    </div>
                </div>
            </div>
        </div>


        <div class="tab-pane container fade" id="recetas">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-sm-12">
                        <div class="card mt-3">
                            <div class="card-header">
                                <h5 class="card-title">Lista de Recetas</h5>
                            </div>
                            <div class="card-body">
                                <!--
                                en esta area se colocara el codigo 
                                visualizar los usuarios
                                -->
                                <p class="text-center">No hay Recetas por el momento</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-sm-12">
                        <div class="card mt-3">
                            <div class="card-header">
                                <h5 class="card-title">Visualizacion de la Receta Seleccionada</h5>
                            </div>

                            <div class="card-body">
                                <!--
                                en esta area se colocara el codigo 
                                visualizar los usuarios
                                -->
                                <p class="text-center">Ninguna Receta seleccionada</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


            <div class="tab-pane container fade" id="expediente">Datos del expediente</div>



            <div class="tab-pane container fade" id="pagos">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6 col-sm-12">
                            <div class="card mt-3">
                                <div class="card-header">
                                    <h5 class="card-title">Lista de Pagos</h5>
                                </div>
                                <div class="card-body">
                                    <!--
                                    en esta area se colocara el codigo 
                                    visualizar los usuarios
                                    -->
                                    <p class="text-center">No hay Adeudos</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-12">
                            <div class="card mt-3">
                                <div class="card-header">
                                    <h5 class="card-title">Visualizacion de info pagos</h5>
                                </div>

                                <div class="card-body">
                                    <!--
                                    en esta area se colocara el codigo 
                                    visualizar los usuarios
                                    -->
                                    <p class="text-center">Ninguna Receta seleccionada</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
            
            </div>
            <%@ include file="/WEB-INF/footer.jsp" %>
            </body>
</html>
