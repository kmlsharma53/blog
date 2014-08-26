package com.blog.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AnsBlogId implements Serializable {
	private static final long serialVersionUID = 4210802745203714807L;

	private Integer ansId;
	
	private Integer blogId;
	
	@Column(name="aid")
	public Integer getAnsId(){
		return ansId;
	}
	
	public void setAnsId(Integer ansId){
		this.ansId = ansId;
	}
	
	@Column(name="blog_id")
	public Integer getBlogId(){
		return blogId;
	}
	
	public void setBlogId(Integer blogId){
		this.blogId = blogId;
	}

}
