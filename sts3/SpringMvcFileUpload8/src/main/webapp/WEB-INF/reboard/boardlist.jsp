<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Cute+Font&family=Diphylleia&family=Dokdo&family=Nanum+Brush+Script&family=Nanum+Gothic+Coding&family=Noto+Sans+KR&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div style="margin: 50px 50px;">
		<table class="table table-bordered" style="width: 800px;">
			<caption align="top"><b>스프링 답변형 게시판</b>
				<span style="float: right;">
					<button type="button" class="btn btn-outline-info"
					onclick="location.href='writeform'">글쓰기</button>
				</span>
			</caption>
			
			<tr>
				<th width="60">번호</th>
				<th width="300">제목</th>
				<th width="300">작성자</th>
				<th width="300">작성일</th>
				<th width="300">조회</th>
			</tr>
			
			<c:if test="${totalCount==0 }">
				<tr>
					<td colspan="5" align="center">
						<b>등록된 게시글이 없습니다</b>
					</td>
				</tr>
			</c:if>
			
			<c:if test="${totalCount>0 }">
				<c:forEach var="dto" items="${list }">
					<tr>
						<td align="center">${no }</td>
						<c:set var="no" value="${no-1 }"/> <!-- 출력 후 감소 -->
						<td> <!-- 제목 -->
							<!-- relevel 만큼 공백...보통 2칸씩 -->
							<c:forEach var="s" begin="1" end="${dto.relevel }">
								&nbsp;&nbsp; <!-- 원글은 relevel이 0이라서 안돌음 -->
							</c:forEach>
							
							<!-- 답글인 경우에만 re.png이미지 출력 -->
							<c:if test="${dto.relevel>0 }">
								<img alt="" src="../upload/re.png">
							</c:if>
							
							<!-- 제목...여기 누르면 내용 보기로... -->
							<a href="content?num=${dto.num }&currentPage=${currentPage}">${dto.subject }</a>
							
							<!-- 댓글갯수 -->
							<c:if test="${dto.acount>0 }">
								<a style="color: red;" href="content?num=${dto.num }&currentPage=${currentPage}#answer">[${dto.acount }]</a> <!-- #answer를 추가하면 content내용이 엄청 많아도 이 값을 누를때 바로 댓글창이 화면에 보이게 이동해짐 -->
							</c:if>
							
							<!-- 사진이 있을 경우 아이콘 표시 -->
							<c:if test="${dto.photo!='no' }">
								<i class="bi bi-image-fill"></i>
							</c:if>
						</td>
						<td align="center">${dto.writer }</td>
						<td>
							<fmt:formatDate value="${dto.writeday }" pattern="yyyy-MM-dd"/>
						</td>
						<td align="center">
							${dto.readcount }
						</td>
					</tr>
				</c:forEach>
			</c:if>
		</table>
		
		
		<!-- 페이징 -->
		<c:if test="${totalCount>0 }">
			<div style="width: 800px; text-align: center;">
				<ul class="pagination justify-content-center">
					<!-- 이전 -->
					<c:if test="${startPage>1 }">
						<li><a href="list?currentPage=${startPage-1 }">이전</a></li>
					</c:if>
					
					<c:forEach var="pp" begin="${startPage }" end="${endPage }">
						<c:if test="${currentPage==pp }">
							<li class="page-item active">
								<a class="page-link" href="list?currentPage=${pp }">${pp }</a>
							</li>
						</c:if>
						
						<c:if test="${currentPage!=pp }">
							<li class="page-item">
								<a class="page-link" href="list?currentPage=${pp }">${pp }</a>
							</li>
						</c:if>
					</c:forEach>
					
					<!-- 다음 -->
					<c:if test="${endPage<totalPage }">
			        	<li class="page-item">
			        		<a class="page-link" href="list?currentPage=${endPage+1 }">다음</a>
			            </li>
			        </c:if>
				</ul>
			</div>
		</c:if>
		
	</div>
</body>
</html>