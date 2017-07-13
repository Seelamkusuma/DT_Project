package com.fashion;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.fashion.FashionCity.dao.CategoryDAO;
import com.fashion.FashionCity.dao.ProductDAO;
import com.fashion.FashionCity.model.Product;



@Controller
public class PageController {
	
	@Autowired
		CategoryDAO categoryDAO;
	@Autowired
	ProductDAO productDAO;
	
	
	
	@RequestMapping("/Login")
	public String Login()
	{
		
		
		return "Login";
}
	
	
	
	
	@RequestMapping("/LoginError")
	public String LoginError()
	{
		
		
		return "LoginError";
}
	@RequestMapping("/signup")
	public String signup()
	{
		
		
		return "signuppage";
	}
	
	
	@RequestMapping("/Warning")
	public String warning()
	{
		
		
		return "Warning";
}
	
	
	@RequestMapping("/Jewellery")
	public String Book(Model m)
	{
		

		Product<MultipartFile> product=new Product<MultipartFile>();
		
		List<Product> prodlist=productDAO.getProductDetails();
		m.addAttribute("prodlist",prodlist);
	
		return "Jewellery";
	}
	
	@RequestMapping("/Footwear")
	public String category(Model m)
	{
	
		Product<MultipartFile> product=new Product<MultipartFile>();
		
		List<Product> prodlist=productDAO.getProductDetails();
		m.addAttribute("prodlist",prodlist);
	
		return "Footwear";
	}
	
	
	@RequestMapping("/Cosmetics")
	public String Painting(Model m)
	{
	
		Product<MultipartFile> product=new Product<MultipartFile>();
		
		List<Product> prodlist=productDAO.getProductDetails();
		m.addAttribute("prodlist",prodlist);
	
		return "Cosmetics";
	}
	
	
	@RequestMapping("/DesignerDresses")
	public String Photography(Model m)
	{
		

		Product<MultipartFile> product=new Product<MultipartFile>();
		
		List<Product> prodlist=productDAO.getProductDetails();
		m.addAttribute("prodlist",prodlist);
	
		return "DD";
	}
	
	
	
	@RequestMapping("/Handbags")
	public String Game(Model m)
	{
		

		Product<MultipartFile> product=new Product<MultipartFile>();
		
		List<Product> prodlist=productDAO.getProductDetails();
		m.addAttribute("prodlist",prodlist);
		
		return "Handbags";
	}
	
	
	
	
	
	
    }
