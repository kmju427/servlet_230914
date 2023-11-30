package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz05")
public class GetMethodQuiz05 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		int number = Integer.parseInt(request.getParameter("number"));
		
		// 5번 문제
		// 구구단 링크
		// a 태그를 활용해서 number 파라미터로 입력된 단수를 출력하세요.
		// HTML 문서로 만드세요.
		out.print("<html><head><title>구구단</title></head><body><ul>");
		
		for (int i = 1; i <= 9; i++) {
			out.print("<li>" + number + " X " + i + " = " + (number * i) + "</li>");
		}
		
		out.print("</ul></body></html>");
	}
	
} // public class GetMethodQuiz05