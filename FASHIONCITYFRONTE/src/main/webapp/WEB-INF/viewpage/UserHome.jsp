<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>product page</title>
<jsp:include page="header.jsp"/>
 <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
 <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>

<div id=container>

<div class=row>


<c:forEach items="${prodlist}" var="product">
<div class="col-sm-6 col-md-3">
<h1>${product.prodid}</h1>

<a href="ProductDescription/${product.prodid}" class=" thumbnail">
<img src="<c:url value="/resources/images/${product.prodid}.jpg"/>"></a>

<div class="caption">

<h4>${product.proddesc}</h4>
<h4>${product.price}</h4>
</div>
</div>
</c:forEach>
</div>
</div>
 
</body>
</html>
