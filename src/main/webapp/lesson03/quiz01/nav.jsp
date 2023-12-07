<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 자기 자신에게 요청을 해야 페이지가 깨지지 않고 나온다.
	 section.jsp로 요청을 하면 HTML 요소가 없이 테이블만 있는 화면이 나온다. -->
<ul class="nav nav-fill w-100">
	<li class="nav-item"><a href="/lesson03/quiz01/layout.jsp" class="nav-link text-white">전체</a></li>
	<li class="nav-item"><a href="/lesson03/quiz01/layout.jsp?category=지상파" class="nav-link text-white">지상파</a></li>
	<li class="nav-item"><a href="/lesson03/quiz01/layout.jsp?category=드라마" class="nav-link text-white">드라마</a></li>
	<li class="nav-item"><a href="/lesson03/quiz01/layout.jsp?category=예능" class="nav-link text-white">예능</a></li>
	<li class="nav-item"><a href="/lesson03/quiz01/layout.jsp?category=영화" class="nav-link text-white">영화</a></li>
	<li class="nav-item"><a href="/lesson03/quiz01/layout.jsp?category=스포츠" class="nav-link text-white">스포츠</a></li>
</ul>