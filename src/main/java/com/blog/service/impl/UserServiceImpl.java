package com.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.blog.dao.UserDAO;
import com.blog.entity.BlogUser;
import com.blog.service.UserService;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class UserServiceImpl implements UserService {
	@Autowired
	UserDAO userDAO;

	@Override
	public int createUser(String user, String password, String email) {
		BlogUser blogUser = new BlogUser();
		blogUser.setUserName(user);
		blogUser.setPassword(password);
		blogUser.setEmailId(email);
		return userDAO.createUser(blogUser);
	}
}
