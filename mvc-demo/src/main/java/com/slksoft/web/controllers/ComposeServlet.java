package com.slksoft.web.controllers;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slksoft.entity.Message;
import com.slksoft.entity.User;
import com.slksoft.service.MessageService;

@WebServlet("/compose")
public class ComposeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user =(User) req.getSession().getAttribute("user");
		if(user!=null){
			req.getRequestDispatcher("/WEB-INF/jsp/compose.jsp")
			.forward(req, resp);
		}
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Message message=new Message();
		User user =(User) req.getSession().getAttribute("user");
		message.setMsgFrom(user.getEmail());
		message.setMsgTo(req.getParameter("msgTo"));
		message.setMsgCc(req.getParameter("msgCc"));
		message.setMsgSubject(req.getParameter("msgSubject"));
		message.setMsgBody(req.getParameter("msgBody"));
		message.setSentAt(new Date());
		
		MessageService service=new MessageService();
		service.init();
		service.sendNewMsg(message);
		req.setAttribute("msgSent", "Message Sent !");
		req.getRequestDispatcher("/WEB-INF/jsp/compose.jsp")
		.forward(req, resp);
	}

}
