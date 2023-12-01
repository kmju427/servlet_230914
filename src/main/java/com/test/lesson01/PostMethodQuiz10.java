package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz10")
public class PostMethodQuiz10 extends HttpServlet {

	// doPost 메소드 바깥쪽에 위치
	private final Map<String, String> userMap =  new HashMap<>() {
	    {
	        put("id", "marobiana");
	        put("password", "qwerty1234");
	        put("name", "신보람");
	    }
	};
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// 10번 문제
		// 사용자 정보 확인
		// id와 password를 입력 받고, submit 할 수 있는 html 문서를 작성하세요.
		// id가 일치하지 않는 경우 'id가 일치하지 않습니다.'를 출력하세요.
		// password가 일치하지 않는 경우 'password가 일치하지 않습니다.'를 출력하세요.
		// 일치하는 경우 아래와 같이 출력하세요. (HTML 화면)
		// 신보람님 환영합니다!
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><title>결과</title></head><body>");
		
		if (userMap.get("id").equals(id) == false) {
			out.print("id가 일치하지 않습니다.");
		} else if (userMap.get("password").equals(password) == false) {
			out.print("password가 일치하지 않습니다.");
		} else {
			out.print(userMap.get("name") + "님 환영합니다!");
		}
		
		out.print("</body></html>");
	}
	
} // public class PostMethodQuiz10