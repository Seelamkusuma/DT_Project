package com.fashion.FashionCity.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fashion.FashionCity.model.OrderDetails;

@Repository("orderdetailsDAO")

public class OrderDetailsDAO {

	
	@Autowired
	SessionFactory sessionFactory;
	
	public OrderDetailsDAO(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void insertUpdateOrderDetails(OrderDetails orderdetails)
	{
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(orderdetails);
	}
	
	public OrderDetails getOrderDetails(int id)
	{
		Session session=sessionFactory.openSession();
		OrderDetails orderdetails=(OrderDetails)session.get(OrderDetails.class,id);
		session.close();
		return orderdetails;
	}

	@Transactional
	public void deleteOrderDetails(OrderDetails orderdetails)
	{
		sessionFactory.getCurrentSession().delete(orderdetails);
	}
	
	public List<OrderDetails> getOrdersDetails(String username)
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from OrderDetails where username=:username and status='N'");
		query.setParameter("username", username);
		@SuppressWarnings("unchecked")
		List<OrderDetails> list=query.list();
		session.close();
		return list;
	}

	
	
	
	
}