<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FashionCity</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>
<body background ="<c:url value="/resources/images/ee.jpg"/>">
<div align="right">


 <h1> <a href ="Login">Add signin</a> </h1>
        <h1><a href ="signup">Add signup</a> </h1>
        
       <h1> <a href ="Product">Add product</a></h1> 
        <h1><a href ="ProductPage">page</a></h1>
        <img src ="<c:url value="/resources/images/images.png"/>" >
        
        



</div>



<div class="container">
  <h2>Carousel Example</h2>  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="<c:url value="/resources/images/jewellery.jpg"/>" alt="Los Angeles" style="width:100%;">
      </div>

      <div class="item">
        <img src="<c:url value="/resources/images/footwear.jpg"/>" alt="Los Angeles" style="width:100%;">
      </div>
    
      <div class="item">
       <img src="<c:url value="/resources/images/COSMETICS.jpg"/>" alt="Los Angeles" style="width:100%;">
      </div>
    </div>

     
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

      
      
      
</body>
</html>