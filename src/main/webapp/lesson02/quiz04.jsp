<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>길이 변환</title>
<!-- bootstrap CDN 주소 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<h1>길이 변환</h1>
		<form method="get" action="/lesson02/quiz04_1.jsp">
			<div class="d-flex align-items-end mr-1 mb-1">
				<input type="text" class="form-control col-3 mr-1" name="length">
				<div>cm</div>
			</div>
			
			<label for="in">인치</label>
			<input type="checkbox" id="in" name="lengthChange" value="in">
			<label for="yd">야드</label>
			<input type="checkbox" id="yd" name="lengthChange" value="yd">
			<label for="ft">피트</label>
			<input type="checkbox" id="ft" name="lengthChange" value="ft">
			<label for="m">미터</label>
			<input type="checkbox" id="m" name="lengthChange" value="m">
			<br>
			
			<button type="submit" class="btn btn-success">변환하기</button>
		</form>
	</div>
</body>
</html>