<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>VRaptor Blank Project</title>
	<link href="<c:url value="/vendor/bootstrap/dist/css/bootstrap.css"/>" rel="stylesheet" />
	<link href="<c:url value="/css/style-admin.css"/>" rel="stylesheet" /> 
	
</head>
<body>
	
</body>
	
	<jsp:include page="../header.jsp">
 		<jsp:param name="active" value="${active}"/>
    </jsp:include> 
    
    <script src="<c:url value='vendor/jquery/dist/jquery.min.js'/>"></script>
    <script src="<c:url value='js/app.js'/>"></script>
    
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="<c:url value='vendor/bootstrap/dist/js/bootstrap.min.js'/>"></script>
</html>