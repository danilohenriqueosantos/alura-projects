<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/entrada" var="linkEntradaServlet" />
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Cadastrando Empresa</title>
</head>

<body>
	
	<c:import url="logout-parcial.jsp"></c:import>


	<form action="${linkEntradaServlet}" method="POST">
		Nome: <input type="text" name="nome" id="" value="${empresa.nome}">
		Data Abertura: <input type="text" name="data" id=""
			value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>" />
		
		<input type="hidden" name="id" value="${empresa.id}">
		<input type="hidden" name="acao" value="AlteraEmpresa">
		<input type="submit" />

	</form>

</body>

</html>