<%@page import="model.sinsang.SinsangDto"%>
<%@page import="model.sinsang.SinsangDao"%>
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
<%
	//삭제메서드 호출
	//getParameter로 얻어온 num은 list.jsp의 삭제 버튼에 있는 onclick에 ?옆에 있는 num
	String num=request.getParameter("num");
	SinsangDao dao=new SinsangDao();
	dao.deleteSinsang(num);
	//리스트로 이동
	response.sendRedirect("list.jsp");
%>
</body>
</html>