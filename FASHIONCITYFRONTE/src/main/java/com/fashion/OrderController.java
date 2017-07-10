package com.fashion;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fashion.FashionCity.dao.CartDAO;
import com.fashion.FashionCity.dao.ProductDAO;
import com.fashion.FashionCity.model.Cart;




@Controller
public class OrderController {

	    @Autowired
		ProductDAO productDAO;

		@Autowired
		CartDAO cartDAO;
		
		@RequestMapping("/checkout")
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
			return "OrderConfirm";
			}
	
		}
