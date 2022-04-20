<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>에러 처리 페이지</title>
</head>
<body>
내장객체는 JSP페이지에서 new로 객체를 생성하지 않고 사용할 수 있는 객체 <br>
내장 객체는 컨테이너가 미리 생성해둠 <br>
exception 내장 객체는 타입이 java.lang.Throwable<br>
<%= exception.getMessage() %>
</body>
</html>