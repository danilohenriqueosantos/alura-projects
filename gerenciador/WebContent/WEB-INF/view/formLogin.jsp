<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkEntradaServlet"/> 
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Cadastrando Empresa</title>
</head>

<body>

	

	<form action="${linkEntradaServlet}" method="POST">
	
		Login: <input type="text" name="login" id=""> 
		Senha: <input type="password" name="senha" id=""> 
		
		<input type="hidden" name="acao" value="Login">
		<input type="submit" />

	</form>

</body>

</html>