package com.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.blog.dao.QuestionDAO;
import com.blog.entity.Question;
import com.blog.service.QuestionService;

public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	QuestionDAO questionDAO;
	
	@Override
	@Transactional(readOnly = false)
	public void saveQuestion(Question question) {
		questionDAO.saveQuestion(question);
	}

	@Override
	@Transactional(readOnly = true,noRollbackFor = RuntimeException.class)
	public List<Question> getQuestionList() {
		return questionDAO.getQuestionList();
	}

}
