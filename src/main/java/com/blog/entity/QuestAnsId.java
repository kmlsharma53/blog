package com.blog.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class QuestAnsId implements Serializable{
	private static final long serialVersionUID = -1843814074292965704L;

	private Integer quesId;
	
	private Integer ansId;
	
	@Column(name="qid")
	public Integer getQuesId(){
		return quesId;
	}
	
	public void setQuesId(Integer quesId){
		this.quesId = quesId;
	}
	
	@Column(name="aid")
	public Integer getAnsId(){
		return ansId;
	}
	
	public void setAnsId(Integer ansId){
		this.ansId = ansId;
	}
	
}
