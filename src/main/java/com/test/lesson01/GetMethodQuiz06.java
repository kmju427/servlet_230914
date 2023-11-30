package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz06")
public class GetMethodQuiz06 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json");
		
		PrintWriter out = response.getWriter();
		
		int number1 = Integer.parseInt(request.getParameter("number1"));
		int number2 = Integer.parseInt(request.getParameter("number2"));
		
		int addtion = number1 + number2;
		int subtraction = number1 - number2;
		int multiplication = number1 * number2;
		int division = number1 / number2;
		
		// 6번 문제
		// 연산 결과 JSON
		// 두 개의 숫자를 parameter로 넘기는 링크를 가진 html 문서를 만드세요.
		out.print("{\"addtion\":" + addtion
				+ ", \"subtraction\":" + subtraction
				+ ", \"multiplication\":" + multiplication
				+ ", \"division\":" + division + "}");
	}
	
} // public class GetMethodQuiz06