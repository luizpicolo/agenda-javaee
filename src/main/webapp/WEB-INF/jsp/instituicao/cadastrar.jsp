<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html class="no-js" lang="pt-br">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>Instituição - Agenda Universitária</title>

    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="/css/main.css">

    <script src="/js/vendor/modernizr.min.js"></script>
  </head>
		
  <body>
		<%@ include file="../header.jsp" %>

		<main id="main">
      <div class="grid-all box">
        <div class="col-12 text-center">
          <div class="margin-bottom">
            <h1>Cadastro de Instituição</h1>
          </div>
        </div>

        <div class="row">
          <form method="post" action="/instituicao">
          	<div class="row margin-bottom">
	          	<div class="col-6 col-left padding-right">
	          		<label for="nome">Nome</label>
	          		<input type="text" name="instituicao.nome" id="nome" required>
	          	</div>

	          	<div class="col-3 col-left padding">
	          		<label for="cnpj">CNPJ</label>
	          		<input type="text" name="instituicao.cnpj" id="cnpj" required>
	          	</div>

	          	<div class="col-3 col-right padding-left">
	          		<label for="telefone">Telefone</label>
	          		<input type="tel" name="instituicao.telefone" id="telefone" required>
	          	</div>
	          </div>

	          <div class="row margin-bottom">
	          	<div class="col-4 col-left padding-right">
	          		<label for="cidade">Cidade</label>
	          		<input type="text" name="instituicao.cidade" id="cidade" required>
	          	</div>

	          	<div class="col-6 col-left padding">
	          		<label for="endereco">Endereço</label>
	          		<input type="text" name="instituicao.endereco" id="endereco" required>
	          	</div>

	          	<div class="col-2 col-right padding-left">
	          		<label for="uf">Estado</label>
	          		<select name="instituicao.estado" id="uf" required>
	          			<option value="MS">MS</option>
	          			<option value="MT">MT</option>
	          		</select>
	          	</div>
	          </div>

	          <div class="row margin-bottom">
	          	<div class="col-4 col-left padding-right">
	          		<label for="logomarca">Logomarca</label>
	          		<input type="file" name="instituicao.logomarca" id="logomarca">
	          	</div>
	          </div>

	          <div class="row">
	          	<input class="btn btn-success" type="submit" value="Cadastrar">
	          </div>
          </form>
        </div>
      </div>
    </main>

    <!--<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>-->
    <script>window.jQuery || document.write('<script src="/js/vendor/jquery.min.js"><\/script>')</script>

    <script src="/js/plugins.js"></script>
    <script src="/js/main.js"></script>
	</body>
</html>