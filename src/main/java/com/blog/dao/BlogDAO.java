package com.blog.dao;

import java.util.List;

import com.blog.entity.Blog;

public interface BlogDAO {
	void saveBlog(Blog blog);
	List<Blog> getBlogList();
}
