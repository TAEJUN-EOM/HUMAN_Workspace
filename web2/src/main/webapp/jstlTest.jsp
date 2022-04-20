<%@page import="lab.web.vo.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page   contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib    uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
변수 선언 <br>
<c:set value="korea" var="msg" />
msg 변수에 저장된 내용 :  ${msg} <br>
<c:if test="${msg == 'korea'}" var="result">
	test result :  "${result}"    <br>
</c:if>

<c:forTokens items="123-456-789" delims="-" var="sel">
	 ${sel} <BR>
</c:forTokens>
 <%
 ArrayList<Member> list = (ArrayList<Member>)request.getAttribute("members");
 out.print(list.size());
 %><br>
 <%=((ArrayList<Member>)request.getAttribute("members")).size()  %><br>
 
<c:forEach var="i" items="${members}"  varStatus="status" >
     ${status.index}  (  ${status.count}/ ${size} ):  <br>
      name:  ${i.name} ,   email: ${i.email} <br>
</c:forEach>      








변수 삭제<br>
<c:remove var="msg" />
삭제후 msg변수 내용 : ${msg} <br>
 

</body>
</html>