package com.slksoft.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slksoft.entity.User;
import com.slksoft.service.UserService;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		User user=new User();
		String email=req.getParameter("email");
		UserService service = new UserService();
		req.setAttribute("email", email);
		User u =(User) req.getSession().getAttribute("user");
		if(u!=null){
		req.getRequestDispatcher("/WEB-INF/jsp/dashboard.jsp")
		.forward(req, resp);
		return;
		}else{
			resp.sendRedirect("./login");
			return;
		}
	}

}
