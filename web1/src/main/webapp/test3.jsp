<%@ page   contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta  charset="UTF-8">
<title>jsp 정적 지시자</title>
</head>
<body>
 jsp 정적 지시자 : <br>
 page 지시자 &lt;%@ page  %&gt;<br>
 include 지시자 &lt;%@ include  file= %&gt;  컴파일 시점에 include<br>
 forward 지시자 &lt;%@ forward  file= %&gt; (예전 버전에서는 지원했으나....지원하지 않음)<br>
 tag 지시자 &lt;%@ tag  uri=  prefix= %&gt;<br>
 tag 지시자는 JSP 페이지에 사용할 커스텀 태그 라이브러리를 지정합니다<br>
 <br>
 Action Tag : <br>
 JSP 페이지간 흐름 제어 <br>
 자바 빈즈 컴포넌트와 상호작용 지원<br>
 자바 applet 지원<br>
&lt; jsp:include  page= &gt; <br>
include 액션 태그는 include 지시자와 유사하며, 실행 시점에 import함, 파라미터 전달 가능<br>
&lt; jsp:forward  page= &gt; <br>
&lt; jsp:useBean scope= class=   &gt; <br>
   &lt; jsp:setProperty name=  property=   &gt; <br>
   &lt; jsp:getProperty name=  property=   &gt;
 <hr>
 
 <%@ include file="footer.jsp" %>
  <hr>
  <%-- 
 <jsp:include page="footer2.jsp">
   <jsp:param name="email" value="test@test.net" />
   <jsp:param name="phone" value="000-0000-0000" />
 </jsp:include>

 --%>
  <jsp:forward page="footer2.jsp">
   <jsp:param name="email" value="test@test.net" />
   <jsp:param name="phone" value="000-0000-0000" />
 </jsp:forward>
 
</body>
</html>











