<%@page import="org.json.simple.JSONObject"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="db.ajaxboard.AjaxBoardDto"%>
<%@page import="db.ajaxboard.AjaxBoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
AjaxBoardDao dao=new AjaxBoardDao();

String num=request.getParameter("num");

AjaxBoardDto dto=dao.getData(num);

SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");

JSONObject ob=new JSONObject();


//""안에 있는 값으로 form으로 띄워야 해당 값을 가져와서 그대로 입력되게 할 수 있다
ob.put("num",dto.getNum());
ob.put("writer",dto.getWriter());
ob.put("subject", dto.getSubject());
ob.put("story",dto.getStory());
ob.put("avata",dto.getAvata());
ob.put("writeday",sdf.format(dto.getWriteday()));
%>

<%=ob.toString()%>