<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jewellery</title>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="header.jsp"/>
</head>
<body>


<c:forEach items="${prodlist}" var="prodlist"  >
<c:if test="${8==prodlist.catid }">



<a href="ProductDescription/${prodlist.prodid}" class=" thumbnail">
<img src="<c:url value="/resources/images/${prodlist.prodid}.jpg"/>"></a>

</c:if>
</c:forEach>



</body>
</html>
