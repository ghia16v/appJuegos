<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de la tabla de juegos exclusivos</title>
</head>
<body>
<jsp:include page="includes/cabecera.jsp" >
  <jsp:param name="pagina" value="exclusivos" />
  <jsp:param name="title" value="exclusivos" /> 
</jsp:include>
<br>
<br>
<br>
<br>
<h1>Juegos Exclusivos</h1>
<a href="exclusivos">Ver exclusivos</a>

<table class="table ">
		<thead>
			<tr>
				<td>ID Juego</td>
				<td>Nombre</td>
				<td>ID Consola</td>
				<td>Imagen</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${exclusivos}" var="j">
				<tr>
					<td>${j.idJuego}</td>
					<td>${j.nombre}</td>
					<td>${j.idConsola}</td>
					<td><img src="${j.imagen}"  width = "100 em" class="img-thumbnail" alt="imagen..."></td>
				
				</tr>
			</c:forEach>
		</tbody>
	</table>





</body>
</html>