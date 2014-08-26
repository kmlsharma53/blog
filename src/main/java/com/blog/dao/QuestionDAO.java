package com.blog.dao;

import java.util.List;

import com.blog.entity.Question;

public interface QuestionDAO {
	void saveQuestion(Question question);
	List<Question> getQuestionList();
}
