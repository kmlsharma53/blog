package com.blog.service;

import java.util.LinkedHashMap;

import com.blog.entity.Blog;

public interface BlogService {
	
	void saveBlog(StringBuilder stringBuilder);
	
	LinkedHashMap<Integer,Blog> displayBlogs(); 

}
