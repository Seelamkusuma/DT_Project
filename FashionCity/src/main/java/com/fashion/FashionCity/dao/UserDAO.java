package com.fashion.FashionCity.dao;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fashion.FashionCity.model.User;
@Repository("userDAO")
public class UserDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public UserDAO(SessionFactory sessionFactory1)
	{
		this.sessionFactory=sessionFactory1;
	}
	
	@Transactional
	public void insertUpdateUser(User user)
	{
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
	}
	
	public User getUser1(String username)
	{
		Session session=sessionFactory.openSession();
		User User=(User)session.get(User.class,username);
		session.close();
		return User;
	}
	
	@Transactional
	public void delete(User user)
	{
		sessionFactory.getCurrentSession().delete(user);
	}
	
	public List<User> getUser()
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from User");
		List<User> list=query.list();
		session.close();
		return list;
	}

	


}

