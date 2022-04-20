<%@page import="lab.web.vo.MemberVO"%>
<%@ page   contentType="text/html; charset=UTF-8" errorPage="error/errorHandle.jsp"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta  charset="UTF-8">
<title>회원가입 정보 확인</title>
</head>
<body>
회원가입이 완료되었습니다.<br>
<hr>
<%
MemberVO user = (MemberVO)request.getAttribute("user");
%>
 아이디  : <%=user.getUserid() %><br>
 이름  :   <%=user.getUsername() %>  <br>
 비밀번호  :  <%=user.getUserpwd() %>   <br>
 손편지  :   <%=user.getEmail() %> <br>
 손전화  :   <%=user.getPhone() %> <br>
 주소  :   <%=user.getAddress() %><br>
 성별  :   <%=user.getGender() %><br>
 가능한 프로그래밍 언어  :   <%=user.getP_lang() %> <br>
</body>
</html>












