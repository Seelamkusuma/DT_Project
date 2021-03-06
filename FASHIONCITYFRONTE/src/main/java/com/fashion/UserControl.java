package com.fashion;
import java.util.Collection;
import java.util.List;

import javax.persistence.metamodel.Metamodel;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fashion.FashionCity.dao.ProductDAO;
import com.fashion.FashionCity.dao.UserDAO;
import com.fashion.FashionCity.model.Product;
import com.fashion.FashionCity.model.User;



@Controller
public class UserControl {
	
	@Autowired
	UserDAO userDAO;
	@Autowired
	ProductDAO productDAO;
	@RequestMapping("/UserHome")
	public String Login(Model m)
	{
		
		List<User> list=userDAO.getUser();
		m.addAttribute("user",list);
		
		return "UserHome";
	}
	
	@RequestMapping(value="/AddUser",method=RequestMethod.POST)
    public String addUser(@RequestParam("username") String username , @RequestParam("password") String password,@RequestParam("email") String email,@RequestParam("phonenumber") String mobileno ,@RequestParam("address") String address,Model m)
    {
    System.out.println("add user to db");
    System.out.println(username+";;;"+password);
    User user=new User();
    user.setUsername(username);
    user.setPassword(password);
    user.setEmail(email);
    user.setMobileno(mobileno);
    user.setRole("user");
    user.setEnabled(true);
    user.setAddress(address);
    userDAO.insertUpdateUser(user);
    System.out.println("UserAdded");
   return "redirect:/User";
   
    }
	
	
	@RequestMapping("/login_success")
	public String loginsuccess(HttpSession session,Model m)
	{
		System.out.println("loded successfully");
		
String page=null;

boolean loggedIn=true;
   String username= SecurityContextHolder.getContext().getAuthentication().getName();

   session.setAttribute("username",username);
   session.setAttribute("loggedIn",loggedIn);

	@SuppressWarnings("unchecked")
	Collection<GrantedAuthority> authorities =(Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
  for(GrantedAuthority role:authorities)
	{
	  System.out.println("Role:"+role.getAuthority()+"username"+username);
		
	  
	if(role.getAuthority().equals("admin"))
	{
		
	return "AdminHome";
	}
	else
	{
		Product product=new Product();
		List<Product> prodlist=productDAO.getProductDetails();
		m.addAttribute("prodlist",prodlist);
		
		
	return "UserHome";
	}
	}

   
			
   return "page";
	}
	
	@RequestMapping("/User")
	public String userHome(HttpSession session,Model m)
	{
		Product product=new Product();
		List<Product> prodlist=productDAO.getProductDetails();
		m.addAttribute("prodlist",prodlist);
		return "User";
	}
	

}