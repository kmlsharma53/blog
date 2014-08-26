package com.blog.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class QuestBlogId implements Serializable{
	private static final long serialVersionUID = 8565645755018912681L;

	private Integer quesId;
	
	private Integer blogId;
	
	@Column(name="qid")
	public Integer getQuesId(){
		return quesId;
	}
	
	public void setQuesId(Integer quesId){
		this.quesId = quesId;
	}
	
	@Column(name="blog_id")
	public Integer getBlogId(){
		return blogId;
	}
	
	public void setBlogId(Integer blogId){
		this.blogId = blogId;
	}

}
