<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>VRaptor Boilerplate - Admin DashBoard</title>
		<link href="<c:url value="/vendor/pure/pure-min.css"/>" rel="stylesheet" />
		<link href="<c:url value="/css/style.css"/>" rel="stylesheet" />	
	</head>
		
	<body>
		<%@ include file="../header.jsp" %>		
		
		<div id="layout">
			<div id="main">
				<div class="header">
					<h1>${welcome}</h1>
					<h2>VRaptor Boilerplate</h2>
				</div>
			</div>		
		</div>
	
	    <script src="<c:url value='vendor/jquery/dist/jquery.min.js'/>"></script>
	    <script src="<c:url value='js/app.js'/>"></script>	    
	</body>
</html>