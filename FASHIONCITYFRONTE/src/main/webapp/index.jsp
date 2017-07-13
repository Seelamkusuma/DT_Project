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
 <h1> <a href ="Login">Login</a> </h1>
        <h1><a href ="signup"> Signup</a> </h1>       
               <h1><a href ="ProductPage">page</a></h1>
        <img src ="<c:url value="/resources/images/images.png"/>" >
</div>
<div class="container">
  <h2 style="color:cyan;">Carousel Example</h2>  
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

	
        
<footer style="background-color: black;">
  <div  class="container">
    <div style = "color:yellow;" class="row">
      <div style = "color:yellow;" class="col-md-4 col-sm-6 footerleft ">
        <div style = "color:yellow;" class="logofooter"> Logo</div>
        <p>FashionCityt is set for Make your hobby fullfilled ,products are orginal made by respective company,Happy Hobby with FashionCity</p>
        <p><i style = "color:yellow;" class="fa fa-map-pin"></i> saidapet, chennai-600033, INDIA</p>
        <p><i style = "color:yellow;" class="fa fa-phone"></i> Phone (India) : +91 9573356612</p>
        <p><i style = "color:yellow;" class="fa fa-envelope"></i> E-mail : info@FashionCity.com</p>
        
      </div>
      <div class="col-md-2 col-sm-6 paddingtop-bottom">
        <h6 class="heading7">GENERAL LINKS</h6>
        <ul class="footer-ul">
          <li><a href="#"> Career</a></li>
          <li><a href="#"> Privacy Policy</a></li>
          <li><a href="#"> Terms & Conditions</a></li>
          <li><a href="#"> Client Gateway</a></li>
          <li><a href="#"> Ranking</a></li>
          <li><a href="#"> Case Studies</a></li>
          <li><a href="#"> Frequently Ask Questions</a></li>
        </ul>
      </div>
      <div class="col-md-3 col-sm-6 paddingtop-bottom">
        <h6 style = "color:maroon;" class="heading7">LATEST POST</h6>
        <div style = "color:maroon;" class="post">
          <p> facebook Designer Dresses Special Offer<span>june21,2017</span></p>
          <p>facebook Footwears Special offer  <span>july23,2017</span></p>
          <p>facebook jwellery is having 3%Discount <span>august,2017</span></p>
        </div>
      </div>
      <div class="col-md-3 col-sm-6 paddingtop-bottom">
        <div class="fb-page" data-href="https://www.facebook.com/facebook" data-tabs="timeline" data-height="300" data-small-header="false" style="margin-bottom:15px;" data-adapt-container-width="true" data-hide-cover="false" data-show-facepile="true">
          <div class="fb-xfbml-parse-ignore">
            <blockquote cite="https://www.facebook.com/facebook"><a href="https://www.facebook.com/facebook">Facebook</a></blockquote>
          
           <div class="col-md-6">
      <ul class="bottom_ul">
        
        <i style = "color:red;"><a style = "color:blue; href="#">About us</a></i>
        <i style = "color:red;"><a style = "color:blue; href="#">Blog</a></i>
        <i style = "color:red;"><a style = "color:blue; href="#">Faq's</a></i>
        <i style = "color:red;"><a style = "color:blue; href="#">Contact us</a></i>
        <i style = "color:red;"><a style = "color:blue; href="#">Site Map</a></i>
      </ul>
    </div>s
          
          
          </div>
        </div>
      </div>
    </div>
  </div>

<!--footer start from here-->

<div class="copyright">
  <div class="container">
    <div class="col-md-6">
      <p>© 2016- All Rights reserved</p>
    </div>
   
    </div>
    </div>  
      
      </footer>
</body>
</html>