package com.slksoft.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slksoft.entity.Message;
import com.slksoft.entity.User;
import com.slksoft.service.MessageService;

@WebServlet("/inbox")
public class InboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user =(User) req.getSession().getAttribute("user");
		Message message=new Message();
		String msgTo=user.getEmail();
		String msgCc=user.getEmail();
		MessageService service=new MessageService();
		
		service.init();
		req.setAttribute("message", service.inbox(msgTo, msgCc));
		
		if(user!=null){
			req.getRequestDispatcher("/WEB-INF/jsp/inbox.jsp")
			.forward(req, resp);
		}
		
		
	}
}
