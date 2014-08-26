package com.blog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="QUESTION")
public class Question {
	
	private Integer quesId;
	
	private Integer userId;
	
	private String description;
	
	private Integer categoryId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="qid")
	public Integer getQuesId(){
		return quesId;
	}
	
	public void setQuesId(Integer quesId){
		this.quesId = quesId;
	}
	
	@Column(name="catid")
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	
	@Column(name="user_id")
	public Integer getUserId(){
		return userId;
	}
	
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
	@Column(name="Description")
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}

}
