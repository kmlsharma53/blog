package com.blog.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blog.dao.UserDAO;
import com.blog.entity.BlogUser;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public int createUser(BlogUser blogUser) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try{
			blogUser.setRoleId(2);
			blogUser.setEnabled(1);
			session.save(blogUser);
			return 1;
		}
		catch(Exception ex ){
			transaction.rollback();
		}
		finally{
			transaction.commit();
		}
		return 0;
	}

	@Override
	public BlogUser getUser(String user) {
		Session session = sessionFactory.openSession();
		List<BlogUser> userList= new ArrayList<BlogUser>();
		session.createQuery("");
		return null;
	}
}
