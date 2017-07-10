package OrderDetailsTestCase;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fashion.FashionCity.dao.OrderDetailsDAO;
import com.fashion.FashionCity.model.OrderDetails;

public class OrderDetailsTestCase 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context1=new AnnotationConfigApplicationContext();
		
		context1.scan("com.fashion.FashionCity");
		
		context1.refresh();
		
		// Inserting a OrderDetails Object.
		OrderDetailsDAO orderdetailsDAO=(OrderDetailsDAO)context1.getBean("orderdetailsDAO");
		
		//Insertion TestCase
		
		/*OrderDetails orderdetails=new OrderDetails();
		
		orderdetails.setUsername("kusuma");
		orderdetails.setPaymode("chain");
		orderdetails.setStatus("N");
		orderdetailsDAO.insertUpdateOrderDetails(orderdetails);		
		System.out.println("OrderDetails Inserted");*/
		
		//Retrieval TestCase
		
		/*Orderdetails orderdetails=orderdetailsDAO.getOrderDetails(1);
		System.out.println("OrderDetails Name:"+orderdetails.getUsername());
		System.out.println("OrderDetails Description:"+orderdetails.getPaymode());*/
		
		//Deletion TestCase
		/*OrderDetails orderdetails=OrderDetailsDAO.getOrderDetails(1);
		OrderDetailsDAO.deleteOrderDetails(orderdetails);
		System.out.println("The OrderDetails Deleted");*/
		
		//Retrieving the Data
		
		List<OrderDetails> list=orderdetailsDAO.getOrdersDetails("kusuma");
		
		for(OrderDetails orderdetails1:list)
		{
			System.out.println(orderdetails1.getOrderid()+":"+orderdetails1.getUsername());
		}
		
		//Update the OrderDetails
		/*OrderDetails orderdetails=orderdetailsDAO.getOrderDetails(1);
		orderdetails.setUsername("kusuma");
		orderdetailsDAO.insertUpdateOrderDetails(orderdetails);
		System.out.println("The Orders Updated");*/
		
	}
}
