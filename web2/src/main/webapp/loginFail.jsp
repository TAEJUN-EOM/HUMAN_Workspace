<%@page import="lab.web.vo.MemberVO"%>
<%@ page   contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>loginFail.jsp</title>
</head>
<body>
<font color="red">
<%=request.getParameter("userid") %> 
아이디가 존재하지 않거나, 비밀번호 오류 입니다. <br>
</font>
</body>
</html>