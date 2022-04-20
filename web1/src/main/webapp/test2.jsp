<%@ page   contentType="text/html; charset=UTF-8" errorPage="error/errorHandle.jsp"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta  charset="UTF-8">
<title>jsp의 스크립트</title>
</head>
<body>
<%-- JSP주석...html소스 보기에서 보이지 않음 --%>
<!-- html주석은  html소스 보기에서 보임-->
멤버변수 선언, 멤버메서드 정의는 선언 스크립트릿을 사용합니다.<br>
<%!
   String name ="korea";
   public String action(){
	   return "이근...왜?...정신세계가 궁금";
   }
%>
자바 실행 문장은 스크립트릿에서 사용합니다.(반드시 문장끝에 ; 잊지말것 )<br>
out은 내장객체로서 JSPWriter 타입입니다.<br>
<%
   out.write(name +"<br>");
   out.write(action() +"<br>");
%>
<hr>
표현 스크립트릿은 웹 페이지에  출력을 합니다.<br> 
 <%=   name  %><br>
 <%=   action()  %><br>
 
 
 
 
 
 
 
 
 
 
</body>
</html>