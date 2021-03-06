<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="<c:url value="/resources/theme1/css/signup.css" />"  rel="stylesheet">
 <script src="<c:url value="/resources/theme1/js/main.js" />"></script>	

<title>Signup</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</head>
<body background ="<c:url value="/resources/images/ee.jpg"/>">  


<div class="container">
	<div class="row">
        <div class="col-md-6">
            <form action="AddUser" method="post">
            
            
     
<div id="fullscreen_bg" class="fullscreen_bg">
            
            <fieldset><legend style = "color:blue;" class="text-center">Valid information is required to register. <span class="req"><small> required *</small></span></legend>
  
  
  
  <div style = "color:blue;" class="form-group">
                <label for="username"><span class="req">* </span> User name:  <small>This will be your login user name</small> </label> 
                    <input style = "color:blue;" class="form-control" type="text" name="username" id = "txt" onkeyup = "Validate(this)" placeholder="minimum 6 letters" required />  
                        <div style = "color:blue;" id="errLast"></div>
            </div>

           


            <div style = "color:blue;" class="form-group">
                <label style = "color:blue;" for="email"><span class="req">* </span> Email Address: </label> 
                    <input style = "color:blue;" class="form-control" required type="text" name="email" id = "email"  onchange="email_validate(this.value);" />   
                        <div style = "color:blue;"class="status" id="status"></div>
            </div>

          
 <div style = "color:blue;" class="form-group">
            <label style = "color:blue;" for="phonenumber"><span class="req">* </span> Phone Number: </label>
                    <input style = "color:blue;" required type="text" name="phonenumber" id="phone" class="form-control phone" maxlength="28" onkeyup="validatephone(this);" placeholder="not used for marketing"/> 
            </div>

            <div style = "color:blue;" class="form-group">
                <label style = "color:blue;" for="password"><span class="req">* </span> Password: </label>
                    <input style = "color:blue;" required name="password" type="password" class="form-control inputpass" minlength="4" maxlength="16"  id="pass1" /> </p>

                <label style = "color:blue;" for="password"><span class="req">* </span> Password Confirm: </label>
                    <input style = "color:blue;" required name="pass" type="password" class="form-control inputpass" minlength="4" maxlength="16" placeholder="Enter again to validate"  id="pass2" onkeyup="checkPass(); return false;" />
                        <span style = "color:blue;" id="confirmMessage" class="confirmMessage"></span>
            </div>
               
              <div> 
              
                <label style = "color:blue;" for="password"><span class="req">* </span> Role </label>
             
              </div> 
           
           
           
            <div style = "color:blue;" class="form-group">
                <label for="address"><span class="req">* </span> address:  <small>address</small> </label> 
                    <input style = "color:blue;" class="form-control" type="text" name="address" id = "txt" onkeyup = "Validate(this)" placeholder="address" required />  
                       
            </div>
           
           
           
            <div style = "color:blue;" class="form-group">
                <input style = "color:blue;" class="btn btn-success" type="submit" name="submit_reg" value="Register">
            </div>
                     


 
 

            </fieldset>
            </form><!-- ends register form -->

	</div>
    </div>      
    </div>
    </div>
    </form>
      
</body>
</html>