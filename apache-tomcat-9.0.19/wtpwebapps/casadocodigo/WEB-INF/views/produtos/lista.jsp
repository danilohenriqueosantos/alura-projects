<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Livros de Java, Android, iPhone, Ruby, PHP e muito mais -
	Casa do Código</title>

<c:url value="/resources/css" var="cssPath" />
<link rel="stylesheet" href="${cssPath}/bootstrap.min.css">
<link rel="stylesheet" href="${cssPath}/bootstrap-theme.min.css">
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<a class="navbar-brand" href="#">Casa do Código</a>
		</div>
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="${s:mvcUrl('PC#listar').build()}">Lista de
						Produtos</a></li>
				<li><a href="${s:mvcUrl('PC#form').build()}">Cadastro de
						Produtos</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
		</div>
	</nav>

	<div class="container">
		<h1>Lista de Produtos</h1>

		<div>${sucesso}</div>
		<div>${falha}</div>

		<table class="table table-bordered table-hover table-striped">
			<tr>
				<th>Título</th>
				<th>Descrição</th>
				<th>Páginas</th>
				<th>Lançamento</th>
			</tr>
			<c:forEach items="${produtos}" var="produto">
				<tr>
					<td><a
						href="${s:mvcUrl('PC#detalhe').arg(0, produto.id).build()}">${produto.titulo}</a></td>
					<td>${produto.descricao}</td>
					<td>${produto.paginas}</td>
					<td><fmt:formatDate value="${produto.dataLancamento.time}"
							pattern="dd/MM/yyyy" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>