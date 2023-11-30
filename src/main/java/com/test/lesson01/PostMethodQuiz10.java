package com.test.lesson01;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz10")
public class PostMethodQuiz10 extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html");
		
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
	}
	
} // public class PostMethodQuiz10