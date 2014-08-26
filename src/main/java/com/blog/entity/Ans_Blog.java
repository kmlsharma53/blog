package com.blog.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ANS_BLOG")
public class Ans_Blog {
	
	@EmbeddedId
	private AnsBlogId ansBlogId;
	
	private Integer userId;
	
	public AnsBlogId getAnsBlogId() {
		return ansBlogId;
	}

	public void setAnsBlogId(AnsBlogId ansBlogId) {
		this.ansBlogId = ansBlogId;
	}

	@Column(name="user_id")
	public Integer getUserId(){
		return userId;
	}
	
	public void setUserId(Integer userId){
		this.userId = userId;
	}

}
