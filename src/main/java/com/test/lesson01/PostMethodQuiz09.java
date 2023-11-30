package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz09")
public class PostMethodQuiz09 extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 응답 헤더 - contentType
		response.setContentType("text/html");
		
		// request param
		String name = request.getParameter("name");
		String introduction = request.getParameter("introduction");
		
		// 9번 문제
		// 입사 지원
		// 이름과 자기소개서를 입력 받아서 submit 할 수 있는 html 문서를 작성하세요.
		// 자기소개서 입력은 textarea 태그를 이용하세요.
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>입사지원서</title></head><body>");
		out.print("<b>" + name + "</b>" + "님 지원이 완료되었습니다.");
		out.print("<h3>지원 내용</h3>");
		out.print(introduction);
		out.print("</body></html>");
	}
	
} // public class PostMethodQuiz09