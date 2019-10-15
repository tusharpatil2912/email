package com.slksoft.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.slksoft.entity.Message;

public interface MessagesDao {

	// CRUD OPERATIONS
	
		@Insert("insert into messages(msg_from,msg_to,msg_cc,msg_subject,msg_body,sent_at) values(#{msgFrom}, #{msgTo}, #{msgCc}, #{msgSubject}, #{msgBody}, #{sentAt})")
		public void sendNewMsg(Message message);
		
		// QUERIES
		
		@Select("select * from messages where msg_to=#{msgTo} or msg_cc=#{msgCc}")
		public Message inbox(String msgTo, String msgCc);
		
}
