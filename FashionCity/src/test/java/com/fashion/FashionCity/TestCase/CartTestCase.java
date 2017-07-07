package com.fashion.FashionCity.TestCase;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fashion.FashionCity.dao.CartDAO;
import com.fashion.FashionCity.model.Cart;

public class CartTestCase 
{
	private static final String N = null;
	private static final String chain = null;

	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context1=new AnnotationConfigApplicationContext();
		
		context1.scan("com.fashion.FashionCity");
		
		context1.refresh();
		
		// Inserting a Cart Object.
		CartDAO cartDAO=(CartDAO)context1.getBean("cartDAO");
		
		//Insertion TestCase
		
		/*Cart cart=new Cart();
		
		cart.setUsername("kusuma");
		cart.setProductname("chain");
		cart.setCartid(1001);
		cart.setCatid(1002);
		cart.setPrice(10000);
		cart.setProdid(1003);
		cart.setQuantity(30);
		cart.setStatus("N");
		cartDAO.insertUpdateCart(cart);		
		System.out.println("Cart Inserted");*/
		
		//Retrieval TestCase
		
		/*Cart Cart=cartDAO.getCart(1);
		System.out.println("Cart Name:"+Cart.getUsername());
		System.out.println("Cart Description:"+Cart.getProductname());*/
		
		//Deletion TestCase
		/*Cart Cart=CartDAO.getCart(1);
		CartDAO.deleteCart(Cart);
		System.out.println("The Cart Deleted");*/
		
		//Retrieving the Data
		
		/*List<Cart> list=cartDAO.getCartDetails("kusuma");
		
		for(Cart cart:list)
		{
			System.out.println(cart.getCartitemid()+":"+cart.getUsername());
		}*/
		
		//Update the Cart
		/*Cart cart=cartDAO.getCart(2);
		cart.setCartid(1001);
		cart.setCatid(1002);
		cart.setPrice(10000);
		cart.setProdid(1003);
		cart.setProductname(chain);
		cart.setQuantity(30);
		cart.setStatus(N);
		cartDAO.insertUpdateCart(cart);
		System.out.println("The Cart Updated");*/
		
	}
}



