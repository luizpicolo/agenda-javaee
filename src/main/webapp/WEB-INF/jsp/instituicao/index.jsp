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
            <h1>Instituição</h1>
          </div>
        </div>

        <div class="row margin-bottom text-left">
        	<a class="btn btn-success" href="instituicao/cadastrar">Inserir novo registro</a>
        </div>

        <div class="row margin-bottom text-left">
          <table>
          	<thead>
          		<tr>
          			<th>Nome</th>
          			<th>E-mail</th>
          			<th>Endereço</th>
          			<th>Telefone</th>
          			<th>Ações</th>
          		</tr>
          	</thead>

          	<tbody>
          		<tr>
          			<td>Exemplo</td>
          			<td>exemplo@exeplo.com</td>
          			<td>Exemplo</td>
          			<td>(67) 0000-0000</td>
          			<td class="table-actions">
                  <a class="btn-small" href="#"><span>Editar</span><i class="fa fa-pencil"></i></a>
                  <a class="btn-small btn-danger" href="#"><span>Excluir</span><i class="fa fa-trash-o"></i></a>
                </td>
          		</tr>
          	</tbody>
          </table>
         </div>

         <div class="pagination text-right">
         	<ol>
         		<li><a class="btn-small" href="#">1</a></li>
         		<li><a class="btn-small" href="#">2</a></li>
         		<li><a class="btn-small" href="#">3</a></li>
         		<li><a class="btn-small" href="#">4</a></li>
         	</ol>
         </div>
      </div>
    </main>

    <!--<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>-->
    <script>window.jQuery || document.write('<script src="/js/vendor/jquery.min.js"><\/script>')</script>

    <script src="/js/plugins.js"></script>
    <script src="/js/main.js"></script>
	</body>
</html>