package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz08")
public class GetMethodQuiz08 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 한글 깨짐 방지
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		// request param
		String keyword = request.getParameter("keyword");
		
		// 비교할 리스트
		List<String> list = new ArrayList<>(Arrays.asList(
		        "강남역 최고 맛집 소개 합니다.", 
		        "오늘 기분 좋은 일이 있었네요.", 
		        "역시 맛집 데이트가 제일 좋네요.", 
		        "집에 가는 길에 동네 맛집 가서 안주 사갑니다.",
		        "자축 저 오늘 생일 이에요."));
		
		// 8번 문제
		// 검색하기
		// 검색어를 입력받고 submit 할 수 있는 html 문서를 작성하세요.
		// 전달받은 검색어를 아래 주어진 리스트에서 찾아서 일치하는 경우에 출력하세요. 예) 맛집
		// 추가 기능) 검색된 단어를 <b> 태그를 통해서 강조하세요.
		PrintWriter out = response.getWriter();
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String line = iter.next();
			
			if (line.contains(keyword)) {
				out.print(line + "<br>");
			}
		}
	}
	
} // public class GetMethodQuiz08