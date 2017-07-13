package com.fashion;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fashion.FashionCity.dao.CartDAO;
import com.fashion.FashionCity.dao.OrderDetailsDAO;
import com.fashion.FashionCity.dao.ProductDAO;
import com.fashion.FashionCity.model.Cart;
import com.fashion.FashionCity.model.OrderDetails;




@Controller
public class OrderController {

	    @Autowired
		ProductDAO productDAO;
	    @Autowired
		OrderDetailsDAO orderDAO;

		@Autowired
		CartDAO cartDAO;
		
		@RequestMapping("/CheckOut")
		public String OrderConfirm(HttpSession session,Model m)
		{
			String username=(String)session.getAttribute("username");
			
			List<Cart> list=cartDAO.getCartDetails(username);
			
			int grandtotal=0;
			
			for(Cart cart:list)
			{
				grandtotal=grandtotal+(cart.getQuantity()*cart.getPrice());
			}
			
			m.addAttribute("grandtotal",grandtotal);
			m.addAttribute("cartitems",list);
			return "CheckOut";
			}
	
		

@RequestMapping("/pay")
public String Confirmation(Model m,HttpSession session)
{
	String username=(String) session.getAttribute("username");
	List<OrderDetails> orderlist=orderDAO.getOrdersDetails(username);
	
	m.addAttribute("orderlist",orderlist);
	
	
	return "Confirm";
}


@RequestMapping("/payment")
public String payment(@RequestParam("paymode") String paymode,@RequestParam("shipping") String shipping,Model m,HttpSession session)
{
	
	String username=(String) session.getAttribute("username");
	OrderDetails order=new OrderDetails();
	
	
	
	
	order.setPaymode(paymode);
	order.setShipmentaddress(shipping);
	order.setUsername(username);
	order.setStatus("N");
	
	orderDAO.insertUpdateOrderDetails(order);	
	
	List<Cart> cartlist1=cartDAO.getCartDetails(username);
	for(Cart cart:cartlist1)
	{
		
		
		Cart cart1=cartDAO.getCart(cart.getCartitemid());
		cart1.setStatus("y");
		cartDAO.insertUpdateCart(cart1);
		
	}
	
	
	return "redirect:/pay";
	
}


@RequestMapping("/confirm")
public String confirm(HttpSession session)

{
	String username=(String) session.getAttribute("username");
	
	
	List<OrderDetails> list=orderDAO.getOrdersDetails(username);
	for(OrderDetails orders:list)
	{
		OrderDetails orders1=orderDAO.getOrderDetails(orders.getOrderid());
		orders1.setStatus("Y");
		orderDAO.insertUpdateOrderDetails(orders1);
		
	}
	
	
	return "ThankPage";
}

@RequestMapping(value="/deleteorders/{orderid}")
public String deleteCart(@PathVariable("orderid") int orderid,Model m)
{
	

	

	
	OrderDetails order=(OrderDetails)orderDAO.getOrderDetails(orderid); 
	
	orderDAO.deleteOrderDetails(order);
	

	
	return "redirect:/pay";
	
}




}

