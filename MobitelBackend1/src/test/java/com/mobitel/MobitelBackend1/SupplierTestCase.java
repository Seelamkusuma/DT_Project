package com.mobitel.MobitelBackend1;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.mobitel.MobitelBackend1.dao.SupplierDAO;
import com.mobitel.MobitelBackend1.model.Supplier;

public class SupplierTestCase 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.mobitel.MobitelBackend1");
		
		context.refresh();
		
		// Inserting a Supplier Object.
		SupplierDAO supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
		
		//Insertion TestCase
		
		Supplier supplier=new Supplier();
		
		/*supplier.setSuppname("WIFIMobile");
		supplier.setsuppaddress("This Mobile is WIFI Enabled. You can Enjoy Internet");

		supplierDAO.insertUpdateSupplier(supplier);		
		System.out.println("Supplier Inserted");*/
		
		//Retrieval TestCase
		
		/*Supplier supplier=supplierDAO.getSupplier(1);
		System.out.println("Supplier Name:"+supplier.getSuppname());
		System.out.println("Supplier Address:"+supplier.getSuppadress());*/
		
		//Deletion TestCase
		/*Supplier supplier=supplierDAO.getSupplier(1);
		supplierDAO.deleteSupplier(supplier);
		System.out.println("The Supplier Deleted");*/
		
		//Retrieving the Data
		
		/*List<Supplier> list=supplierDAO.getSupplierDetails();
		
		for(Supplier supplier:list)
		{
			System.out.println(supplier.getSuppid()+":"+supplier.getSuppname()+":"+supplier.getSuppaddress());
		}*/
	
		//Update the Supplier
		/*Supplier supplier1=supplierDAO.getSupplier(1);
		supplier1.setSuppname("WifiEnMobile");
		supplierDAO.insertUpdateSupplier(supplier1);
		System.out.println("The Supplier Updated");*/
		
	}
}

