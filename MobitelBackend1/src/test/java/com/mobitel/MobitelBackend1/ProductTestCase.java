package com.mobitel.MobitelBackend1;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobitel.MobitelBackend1.dao.ProductDAO;
import com.mobitel.MobitelBackend1.model.Product;

public class ProductTestCase 
{
	private static Object category;

	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.mobitel.MobitelBackend1");
		
		context.refresh();
		
		// Inserting a Product Object.
		ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
		
		//Insertion TestCase
		
		/*Product product=new Product();
		
		product.setProdname("WIFIMobile");
		product.setProddesc("This Mobile is WIFI Enabled");
        product.setCatid(100);
		product.setPrice(100);
		product.setProdid(101);
		product.setQuantity(50);
		productDAO.insertUpdateProduct(product);		
		System.out.println("Product Inserted");*/
		
		//Retrieval TestCase
		
		/*Product product=productDAO.getProduct(1);
		System.out.println("Product Name:"+product.getProductname());
		System.out.println("Product Description:"+product.getProductdesc());*/
		
		//Deletion TestCase
		/*Product product=productDAO.getProduct(1);
		productDAO.deleteProduct(product);
		System.out.println("The Product Deleted");*/
		
		//Retrieving the Data
		
		/*List<Product> list=productDAO.getProductDetails();
		
		for(Product product:list)
		{
			System.out.println(product.getprodid()+":"+prod.getProductname()+":"+product.getProddesc());
		}*/
		
		//Update the Product
		Product product1s=productDAO.getProduct(1);
		product1s.setProdname("Wifi");
		product1s.setCatid(100);
		product1s.setPrice(100);
		product1s.setProdid(101);
		product1s.setQuantity(50);
		productDAO.insertUpdateProduct(product1s);
		System.out.println("The Product Updated");
		
	}
}


