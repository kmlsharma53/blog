package com.blog.service;

import java.util.List;

import com.blog.entity.Question;

public interface QuestionService {	
	void saveQuestion(Question question);
	List<Question> getQuestionList();
}
