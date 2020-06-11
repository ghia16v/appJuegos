<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página principal</title>
</head>
<body>
<jsp:include page="includes/cabecera.jsp" >
  <jsp:param name="pagina" value="index" />
  <jsp:param name="title" value="index" /> 
</jsp:include>

<jsp:include page="exclusivos.jsp" >
  <jsp:param name="pagina" value="exclusivos" />
  <jsp:param name="title" value="exclusisvos" /> 
</jsp:include>

</body>
</html>