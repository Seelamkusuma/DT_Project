<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>shipping done</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   

<jsp:include page="header.jsp"/>
</head>
<body>




<c:forEach items="${orderlist}" var="orderlist">
				
					
							<h1>${orderlist.username}</h1>
							<h1>Order ID:${orderlist.orderid}</h1>
						
			
			
			
					
							<h1>Receipt
							<a href="<c:url value="/deleteorders/${orderlist.orderid}"/>">

								<button type="button" class="btn btn-link btn-xs receipt-left glyphicon glyphicon-trash">
							
								</button></a></h1>
						
			     <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th>Mode of payment</th>
                            <th>shipmentaddress</th>
                        </tr>
                        <tr>
                            <td class="col-md-9"><h1>${orderlist.paymode}</h1></td>
                            <td class="col-md-3"><i class="fa fa-inr"></i><h1>${orderlist.shipmentaddress}</h1> </td>
                        </tr>
                        
                       
                   
			
							<h1><a href="<c:url value="/confirm"/>" class="btn btn-info btn-lg"><h1>Confirm</h1></a></h1>
						
		</c:forEach>
				
</body>
</html>
