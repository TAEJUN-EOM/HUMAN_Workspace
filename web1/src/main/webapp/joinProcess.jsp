<%@page import="lab.web.vo.MemberVO"%>
<%@ page   contentType="text/html; charset=UTF-8" errorPage="error/errorHandle.jsp"
    pageEncoding="UTF-8"%>
<%--
  UserVO vo = new UserVO();
  vo.setUserid(request.getParameter("userid"));
  
  request.setAttribute("vo", vo);
--%>
<jsp:useBean id="vo" class="lab.web.vo.MemberVO" scope="request">
  <jsp:setProperty  name="vo"   property="*" />
</jsp:useBean>
 

<hr>
아이디  : <jsp:getProperty property="userid" name="vo" /> <br>
이름  :   <jsp:getProperty property="username" name="vo" /> <br>
비밀번호  :   <jsp:getProperty property="userpwd" name="vo" /> <br>   
이메일  :   <jsp:getProperty property="email" name="vo" /> <br> 
전화번호  :   <jsp:getProperty property="phone" name="vo" /> <br>
주소  :   <jsp:getProperty property="address" name="vo" /> <br>
성별  :   <jsp:getProperty property="gender" name="vo" /> <br>
가능 프로그래밍언어 :  <jsp:getProperty property="p_lang" name="vo" /> <br>
 
 
 
 
 
 
 
 
 
 
 
 
 