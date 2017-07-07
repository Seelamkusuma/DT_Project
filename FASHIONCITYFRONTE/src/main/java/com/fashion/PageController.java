package com.fashion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fashion.FashionCity.dao.UserDAO;
import com.fashion.FashionCity.model.User;

@Controller
public class PageController {
	
	@Autowired
		UserDAO userDAO;
	
	
	
	@RequestMapping("/Login")
	public String signin()
	{
		
		
		return "Login";
}
	@RequestMapping("/signup")
	public String signup()
	{
		
		
		return "signuppage";
	}
	

	
    }