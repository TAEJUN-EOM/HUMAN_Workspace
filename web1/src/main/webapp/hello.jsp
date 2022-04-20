<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>hello.jsp</title>
</head>
<body>
안녕하세요? hello.jsp페이지입니다.<br>
JSP페이지에 자바 코드를 넣을 때는 스크립틀릿을 사용합니다.<br>
<% out.print(new Date()); %><br> <!-- 실행코드가 들어가는 스크립틀릿 -->
<%= new Date()  %><br>  <!-- 출력되는 내용이 들어가는 expression -->
</body>
</html>