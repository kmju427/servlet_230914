package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/ex03")
public class GetMethodEx03 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		// response.setContentType("text/plain");
		response.setContentType("text/json");
		
		// add comment
		
		// Request Parameter
		String userId = request.getParameter("user_id");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		// 나이가 안 들어가는 부분은 Integer.parseInt(null) 형태로 넘어가기 때문에 에러가 발생한다.
		
		PrintWriter out = response.getWriter();
//		out.println("결과");
//		out.println("user_id : " + userId);
//		out.println("name : " + name);
//		out.println("age : " + age);
		
		// json 
		// {"user_id":"kmju427", "name":"김민주", "age":31}
		out.print("{\"user_id\":\"" + userId + "\", \"name\":\"" + name
				+ "\", \"age\":" + age + "}");
	}
	
} // public class GetMethodEx03