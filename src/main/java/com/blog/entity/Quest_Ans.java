package com.blog.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="QUEST_ANS")
public class Quest_Ans {

	@EmbeddedId
	private QuestAnsId questAnsId;

	public QuestAnsId getQuestAnsId() {
		return questAnsId;
	}

	public void setQuestAnsId(QuestAnsId questAnsId) {
		this.questAnsId = questAnsId;
	}
	
}
