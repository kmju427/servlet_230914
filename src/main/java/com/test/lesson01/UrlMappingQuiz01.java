package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz01 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		// 1번 문제
		// 오늘 날짜 출력
		// 오늘 날짜를 출력하세요.
		// - web.xml URL Mapping 후 servlet을 이용해서 출력하세요.
		// - Content Type은 text/plain으로 설정하세요.
		// 오늘의 날짜는 202-년 --월 --일
		Date now = new Date();
		// SimpleDateFormat sdf = new SimpleDateFormat("오늘의 날짜는 yyyy년 M월 dd일");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 dd일");
		out.println("오늘의 날짜는 " + sdf.format(now));
	}
	
} // public class UrlMappingQuiz01