<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- bootstrap CDN 주소 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

<style>
	header {height:100px;}
	.content {min-height:500px;}
	footer {height:80px;}
</style>
</head>
<body>
	<div id="wrap" class="container">
		<header class="d-flex align-items-center">
			<div class="col-2">
				<h3><a href="#" class="text-success">Melong</a></h3>
			</div>
			<div class="col-10">
				<div class="input-group">
					<input type="text" class="form-control col-6" name="search">
					<div class="input-group-append">
						<input type="submit" class="btn btn-info" value="검색">
					</div>
				</div>
			</div>
		</header>
		<nav>
			<ul class="nav">
				<li class="nav-item"><a href="#" class="nav-link text-dark font-weight-bold">멜롱차트</a></li>
				<li class="nav-item"><a href="#" class="nav-link text-dark font-weight-bold">최신음악</a></li>
				<li class="nav-item"><a href="#" class="nav-link text-dark font-weight-bold">장르음악</a></li>
				<li class="nav-item"><a href="#" class="nav-link text-dark font-weight-bold">멜롱DJ</a></li>
				<li class="nav-item"><a href="#" class="nav-link text-dark font-weight-bold">뮤직어워드</a></li>
			</ul>
		</nav>
		<section class="content py-4">
			<%-- 가수 정보 --%>
			<div style="border:1px solid green" class="mb-2">
				<div class="d-flex m-2">
					<div class="mr-3">
						<img src="" alt="아이유" width="100">
					</div>
					<div>
						<h2></h2>
						<span></span><br>
						<span></span>
					</div>
				</div>
			</div>
			
			<%-- 곡 목록 영역 --%>
			<h4>곡 목록</h4>
			<table class="table text-center">
				<thead>
					<tr>
						<th>no</th>
						<th>제목</th>
						<th>앨범</th>
					</tr>
				</thead>
				<tbody>
					
				</tbody>
			</table>
		</section>
		<footer>
			<hr>
			<small class="text-secondary">Copyright 2023. melong All Rights Reserved.</small>
		</footer>
	</div>
</body>
</html>