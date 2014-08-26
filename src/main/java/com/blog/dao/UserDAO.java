package com.blog.dao;

import com.blog.entity.BlogUser;

public interface UserDAO {
	
	int createUser(BlogUser blogUser);
	BlogUser getUser(String user);

}
