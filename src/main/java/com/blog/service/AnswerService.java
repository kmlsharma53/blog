package com.blog.service;

import java.util.List;

import com.blog.entity.Answer;

public interface AnswerService {
	void saveAnswer(Answer answer);
	List<Answer> getAnswerList();
}
