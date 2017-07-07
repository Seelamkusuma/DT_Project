package com.fashion.FashionCity.TestCase;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fashion.FashionCity.dao.UserDAO;
import com.fashion.FashionCity.model.User;

public class UserTestCase {
	public static void main(String arg[])
	{
	AnnotationConfigApplicationContext context3=new AnnotationConfigApplicationContext();
	
	context3.scan("com.fashion.FashionCity");
	
	context3.refresh();
	
	// Inserting a Category Object.
	UserDAO userDAO=(UserDAO)context3.getBean("userDAO");
	
	//Insertion TestCase
	
	/*User user=new User();
	
	user.setUsername("Kusuma");
	user.setPassword("12345");
	user.setEmail("seelamkusuma3gmail.com");
	user.setRole("queen");
	user.setMobileno("9573356612");
	user.setAddress("This Mobile is WIFI Enabled. You can Enjoy");
	userDAO.insertUpdateUser(user);		
	System.out.println("user Inserted");*/
	
	//Retrieval TestCase
	
	/*User user=userDAO.getUser("Kusuma");
	System.out.println("Category password:"+user.getPassword());
	System.out.println("Category Role:"+user.getRole());*/
	
	//Deletion TestCase
	/*User user=userDAO.getUser("Kusuma");
	userDAO.deleteUser(user);
	System.out.println("The user  Deleted");*/
	
	//Retrieving the Data
	
	/*List<User> list=userDAO.getUser();
	
	for(User user:list)
	{
		System.out.println(user.getUsername()+":"+user.getMobileno()+":"+user.getAddress()+":"+user.getEmail());
	}*/
	
	//Update the Category
	/*User user=userDAO.getUser("Kusuma");
	user.setEmail("seelamkusuma3@gmail.com");
	userDAO.insertUpdateUser(user);
	System.out.println("The user Updated");*/
	
}


}

