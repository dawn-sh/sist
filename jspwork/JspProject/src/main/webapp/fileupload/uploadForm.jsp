<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Cute+Font&family=Diphylleia&family=Dokdo&family=Nanum+Brush+Script&family=Nanum+Gothic+Coding&family=Noto+Sans+KR&display=swap" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<body>
	<%-- form자체가 multipart 업로드할 경로/ 업로드할 파일의 크기 등 처리해줌 --%>
	<form action="uploadProc.jsp" method="post" enctype="multipart/form-data">
		<table class="table table-bordered" style="width: 500px">
			<tr>
				<th>글쓴이</th>
				<td>
					<input type="text" name="writer" class="form-control"
					style="width: 150px;">
				</td>
			</tr>
			
			<tr>
				<th>주제</th>
				<td>
					<input type="text" name="subject" class="form-control"
					style="width: 350px;">
				</td>
			</tr>
			
			<tr>
				<%-- 이미지 업로드 필수 코드 --%>
				<th>이미지 업로드</th>
				<td>
					<input type="file" name="uFile" class="form-control">
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="업로드" class="btn btn-success" style="width: 150px;">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>