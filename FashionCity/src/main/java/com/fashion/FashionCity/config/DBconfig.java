package com.fashion.FashionCity.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.fashion.FashionCity.dao.CartDAO;
import com.fashion.FashionCity.dao.CategoryDAO;
import com.fashion.FashionCity.dao.ProductDAO;
import com.fashion.FashionCity.dao.SupplierDAO;
import com.fashion.FashionCity.dao.UserDAO;
import com.fashion.FashionCity.dao.OrderDetailsDAO;
import com.fashion.FashionCity.model.Cart;
import com.fashion.FashionCity.model.Category;
import com.fashion.FashionCity.model.Product;
import com.fashion.FashionCity.model.Supplier;
import com.fashion.FashionCity.model.User;
import com.fashion.FashionCity.model.OrderDetails;
@Configuration
@ComponentScan("com.fashion.FashionCity")
@EnableTransactionManagement
public class DBconfig 
{

	@Bean(name = "dataSource")
	public DataSource getH2DataSource() 
	{
		System.out.println("Starting of the method getH2DataSource");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		dataSource.setUsername("test");
		dataSource.setPassword("5678");
		System.out.println("Data Source Creation");
		return dataSource;
	}

	
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource)
	{
		System.out.println("---Hibernate Properties----");
		Properties prop=new Properties();
		prop.setProperty("hibernate.hbm2ddl.auto", "update");
		prop.put("hibernate.show_sql", "true"); //optional
		prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		System.out.println("---Hibernate Properties Created");
		
		System.out.println("---Local SessionFactory Builder Object Creation---");
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(getH2DataSource());
		sessionBuilder.addProperties(prop);
		System.out.println("---Factory Builder Object Created---");
		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(Supplier.class);
		sessionBuilder.addAnnotatedClass(User.class);
		sessionBuilder.addAnnotatedClass(Product.class);
		sessionBuilder.addAnnotatedClass(Cart.class);
		sessionBuilder.addAnnotatedClass(OrderDetails.class);
		System.out.println("Session Factory Object Creation");
		SessionFactory sessionFactory=sessionBuilder.buildSessionFactory();
		System.out.println("Session Factory Object Created");
		return sessionFactory;
	}
	
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		System.out.println("--Transaction manager Object Creation--");
		HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
		System.out.println("--Transaction manager Object Created--");
		return transactionManager;
	}
	@Autowired
	@Bean(name="cateDAO")
	public CategoryDAO getCategoryDAO(SessionFactory sessionFactory)
	{
		System.out.println("-- CategoryDAO Object Creation--");
		return new CategoryDAO(sessionFactory);
	}
		@Autowired
	@Bean(name="supplierDAO")
	public SupplierDAO getSupplierDAO(SessionFactory sessionFactory)
	{
		System.out.println("-- SupplierDAO Object Creation--");
		return new SupplierDAO(sessionFactory);
	}
	
		@Autowired
		@Bean(name="userDAO")
		public UserDAO getUserDAO(SessionFactory sessionFactory)
		{
			System.out.println("-- UserDAO Object Creation--");
			return new UserDAO(sessionFactory);
		}
		
		
		@Autowired
		@Bean(name="productDAO")
		public ProductDAO getProductDAO(SessionFactory sessionFactory)
		{
			System.out.println("-- ProductDAO Object Creation--");
			return new ProductDAO(sessionFactory);
		}
		@Autowired
		@Bean(name="cartDAO")
		public CartDAO getCartDAO(SessionFactory sessionFactory)
		{
			System.out.println("-- CartDAO Object Creation--");
			return new CartDAO(sessionFactory);
		}
		@Autowired
		@Bean(name="orderdetailsDAO")
		public OrderDetailsDAO getOrderDetailsDAO(SessionFactory sessionFactory)
		{
			System.out.println("-- OrderDetailsDAO Object Creation--");
			return new OrderDetailsDAO(sessionFactory);
		}

}

