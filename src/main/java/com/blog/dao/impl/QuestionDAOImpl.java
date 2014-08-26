package com.blog.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.blog.dao.QuestionDAO;
import com.blog.entity.Question;

public class QuestionDAOImpl implements QuestionDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void saveQuestion(Question question) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		question.setDescription("test");
		session.saveOrUpdate(question);
		session.getTransaction().commit();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Question> getQuestionList() {
		Session session = sessionFactory.openSession();
		return (List<Question>)session.createCriteria(Question.class).list();
	}
}
