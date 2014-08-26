package com.blog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BLOG")
public class Blog {
	
	private Integer blogId;
	
	private Integer userId;
	
	private String description;
	
	private String blogName;
	
	private Integer categoryId;
	
	@Column(name="catid")
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name="blog_name")
	public String getBlogName() {
		return blogName;
	}

	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="blog_id")
	public Integer getBlogId(){
		return blogId;
	}
	
	public void setBlogId(Integer blogId){
		this.blogId = blogId;
	}
	
	@Column(name="user_id")
	public Integer getUserId(){
		return userId;
	}
	
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
	@Column(name="description")
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}

}
