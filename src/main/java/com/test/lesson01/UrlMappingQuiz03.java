package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz03")
public class UrlMappingQuiz03 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// 3번 문제
		// 뉴스 기사 출력
		// 기사 문구를 브라우저에 출력하세요.
		// WebServlet 어노테이션을 이용해서 URL을 Mapping 하세요.
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		out.println("<html><head><title>마론달 뉴스</title></head><body>");
		out.println("<h1>[단독] 고양이가 야옹해</h1>");
		out.println("<p>기사 입력 시간 : " + sdf.format(now) + "</p>");
		// out.println("<p>기사 입력 시간 : " + sdf.format(now) + "</p><hr>끝");
		out.println("<hr>");
		out.println("끝");
		out.println("</body></html>");
	}
	
} // public class UrlMappingQuiz03