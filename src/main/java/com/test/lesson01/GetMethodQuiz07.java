package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz07")
public class GetMethodQuiz07 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 한글 깨짐 방지
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		// request param
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		String price = request.getParameter("price");
		
		// 7번 문제
		// 주문하기
		// 아래와 같이 입력을 받는 input을 만들고, form을 통해 값을 submit 할 수 있는 html 문서를 만드세요.
		// 출력 화면도 HTML 문서로 만드세요.
		// 전달받은 주소에 '서울시'가 포함되어 있지 않으면, '배달 불가 지역입니다.'를 출력하세요.
		// 전달받은 결제 카드가 '신한카드'인 경우 '결제 불가 카드입니다.'를 출력하세요.
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>주문 결과</title></head><body>");
		
		if (address.startsWith("서울시") == false) {
			out.print("배달 불가 지역입니다.");
		} else if (card.equals("신한카드")) {
			out.print("결제 불가 카드입니다.");
		} else {
			out.print(address + " " + "<b>배달 준비 중</b><br>");
			out.print("결제금액 : " + price + "원");
		}
		
		out.print("</body></html>");
	}
	
} // public class GetMethodQuiz07 