package com.blog.dao;

import java.util.List;

import com.blog.entity.Answer;

public interface AnswerDAO {
	void saveAnswer(Answer answer);
	List<Answer> getAnswerList();
}
