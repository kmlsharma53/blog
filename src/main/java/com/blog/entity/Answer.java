package com.blog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ANSWER")
public class Answer {
	
	private Integer ansId;
	
	private Integer userId;
	
	private String description;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="aid")
	public Integer getAnsId(){
		return ansId;
	}
	
	public void setAnsId(Integer ansId){
		this.ansId = ansId;
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
