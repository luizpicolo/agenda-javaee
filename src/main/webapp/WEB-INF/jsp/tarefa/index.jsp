<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html class="no-js" lang="pt-br">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>Tarefa - Agenda Universitária</title>

    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="/css/main.css">
    <link href='/fullcalendar/fullcalendar.css' rel='stylesheet'>

    <script src="/js/vendor/modernizr.min.js"></script>
  </head>
		
  <body>
		<%@ include file="../header.jsp" %>

		<main id="main">
      <div class="grid-all box">
        <div class="col-12 text-center">
          <div class="margin-bottom">
            <h1>Tarefa</h1>
          </div>
        </div>

        <div class="row margin-bottom text-left">
        	<a class="btn btn-success" href="tarefa/cadastrar">Inserir novo registro</a>
        </div>

        <div class="row margin-bottom text-left">
          <div id="calendar"></div>  
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
    <script>
      window.jQuery || document.write('<script src="/js/vendor/jquery.min.js"><\/script>')
    </script>

    <script src='/fullcalendar/lib/moment.min.js'></script>
    <script src='/fullcalendar/lib/jquery-ui.custom.min.js'></script>
    <script src='/fullcalendar/fullcalendar.min.js'></script>

    <script src="/js/plugins.js"></script>
    <script src="/js/main.js"></script>
	</body>
</html>