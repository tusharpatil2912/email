package com.slksoft.service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.slksoft.dao.MessagesDao;
import com.slksoft.entity.Message;

public class MessageService {

	SqlSessionFactory factory;
	
	public void init() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		factory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	public void sendNewMsg(Message message) {
		try(SqlSession session = factory.openSession(true)) {
			MessagesDao dao = session.getMapper(MessagesDao.class);
			dao.sendNewMsg(message);
		}
	}
	public Message inbox(String msgTo, String msgCc){
		try(SqlSession session = factory.openSession(true)) {
			MessagesDao dao = session.getMapper(MessagesDao.class);
			return dao.inbox(msgTo, msgCc);
		}
	}
}
