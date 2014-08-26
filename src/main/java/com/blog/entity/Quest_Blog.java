package com.blog.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="QUEST_BLOG")
public class Quest_Blog {
	
	@EmbeddedId
	private QuestBlogId questBlogId;
	
	private Integer userId;
	
	public QuestBlogId getQuestBlogId() {
		return questBlogId;
	}

	public void setQuestBlogId(QuestBlogId questBlogId) {
		this.questBlogId = questBlogId;
	}

	@Column(name="user_id")
	public Integer getUserId(){
		return userId;
	}
	
	public void setUserId(Integer userId){
		this.userId = userId;
	}

}
