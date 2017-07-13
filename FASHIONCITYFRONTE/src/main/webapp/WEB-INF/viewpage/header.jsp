
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>header</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


</head>
<body>

<c:if test="${sessionScope.loggedIn }">

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand active" href style="color:cyan;" ="index.jsp">FashionCity</a>
    </div>
     <a class="btn btn-primary glyphicon glyphicon-home" href="User" ></span>Home</a>
     <a href ="Cosmetics" class="btn btn-primary"><img src="<c:url value="/resources/images/cos.png"/>">Cosmetics</a>
      <a href ="Jewellery" class="btn btn-primary"><img src="<c:url value="/resources/images/jj.png"/>" >Jewellery</a>
      <a href ="DesignerDresses" class="btn btn-primary"><img src="<c:url value="/resources/images/suit.png"/>">Designer Dresses</a>
      <a href ="Footwear" class="btn btn-primary"><img src="<c:url value="/resources/images/footwear1.png"/>">Footwear</a>
      <a href ="Handbags" class="btn btn-primary"><img src="<c:url value="/resources/images/bag.png"/>">Handbags</a>
    <a href ="Cart" class="btn btn-primary" ><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>CartPage</a>
     <ul class="nav navbar-nav nav navbar-right">
    
     <a href ="#" class="btn btn-danger">${sessionScope.username}</a>
     </ul>
      <ul class="nav navbar-nav nav navbar-right">
     
     <a href ="index.jsp" class="btn btn-primary"><span class="glyphicon glyphicon-off" aria-hidden="true"></span>logout</a>
     </ul>
  </div>
</nav>
</c:if>





<c:if test="${!sessionScope.loggedIn }">

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="index.jsp">FashionCity</a>
    </div>
    <ul class="nav navbar-nav nav navbar-right">
     <li><a href="Login">Login</a></li>
      <li><a href="signup">Signup</a></li>
     
    </ul>
  </div>
</nav>
</c:if>
</body>
</html>