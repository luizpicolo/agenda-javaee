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
            <h1>Cadastro de Aluno</h1>
          </div>
        </div>

        <div class="row">
          <form>
          	<div class="row margin-bottom">
	          	<div class="col-6 col-left padding-right">
	          		<label for="nome">Nome</label>
	          		<input type="text" name="nome" id="nome" required>
	          	</div>

	          	<div class="col-6 col-right padding-left">
	          		<label for="email">E-mail</label>
	          		<input type="email" name="email" id="email" required>
	          	</div>
	          </div>

	          <div class="row margin-bottom">
	          	<div class="col-6 col-left padding-right">
	          		<label for="usuario">Usuário</label>
	          		<input type="text" name="usuario" id="usuario" required>
	          	</div>

	          	<div class="col-6 col-right padding-left">
	          		<label for="senha">Senha</label>
	          		<input type="password" name="senha" id="senha" required>
	          	</div>
	          </div>

	          <div class="row margin-bottom">
	          	<div class="col-6 col-left padding-right">
	          		<label for="descricao">Descrição</label>
	          		<textarea name="descricao" id="descricao" required></textarea>
	          	</div>

	          	<div class="col-6 col-right padding-left">
	          		<label for="perfil">Perfil</label>
	          		<input type="file" name="perfil" id="perfil" required>
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