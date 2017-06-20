package com.mobitel.MobitelBackend1;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobitel.MobitelBackend1.dao.UserDAO;
import com.mobitel.MobitelBackend1.model.User;

public class UserTestCase 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.mobitel.MobitelBackend1");
		
		context.refresh();
		
		// Inserting a User Object.
		UserDAO userDAO=(UserDAO)context.getBean("userDAO");
		
		//Insertion TestCase
		
		/*User user=new User();
		
		user.setUsername("WIFIMobile");
		user.setUserdesc("This Mobile is WIFI Enabled. You can Enjoy Internet");

		userDAO.insertUpdateUser(user);		
		System.out.println("User Inserted");*/
		
		//Retrieval TestCase
		
		/*User user=userDAO.getUser(1);
		System.out.println("User Name:"+user.getUsername());
		System.out.println("User Description:"+user.getUserdesc());*/
		
		//Deletion TestCase
		/*User user=userDAO.getUser(1);
		userDAO.deleteUser(user);
		System.out.println("The User Deleted");*/
		
		//Retrieving the Data
		
		/*List<User> list=userDAO.getUserDetails();
		
		for(User user:list)
		{
			System.out.println(user.getUserid()+":"+user.getUsername()+":"+user.getUserdesc());
		}*/
		
		//Update the User
		/*User user=userDAO.getUser(1);
		user.setUsername("WifiEnMobile");
		userDAO.insertUpdateUser(user);
		System.out.println("The User Updated");*/
		
	}
}

