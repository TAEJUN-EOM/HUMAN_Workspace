<%@page import="lab.web.vo.MemberVO"%>
<%@ page   contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>loginSuccess.jsp</title>
<script>
function sendform(){
	 var uid = document.getElementById("userid").value;
	 location.href="./update?userid="+uid;
}
</script>
</head>
<body>
<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0 marginwidth=0 marginheight=0>
<br>
<table width=780 border=0 cellpadding=0 cellspacing=0>
	<tr>
	  <td width="20"></td>
	  <td>
  <!--contents-->
	  <table width=590 border=0 cellpadding=0 cellspacing=0>
		  <tr>
			<td bgcolor="f4f4f4" height="22">&nbsp;&nbsp;<b>사용자 관리 - 회원 정보 변경 및 확인</b></td>
		  </tr>
	  </table>  
	  <br>
	  
	  <!-- write Form  -->
 로그인 성공하였습니다.<br>
	  <%
	   MemberVO vo = (MemberVO)request.getAttribute("user");
	  %>
	  <table border="0" cellpadding="0" cellspacing="1" width="590" bgcolor="BBBBBB">
		  <tr>
			<td width=200 align=center bgcolor="E6ECDE" height="22">사용자 아이디</td>
			<td width=390 bgcolor="ffffff" style="padding-left:10">
			<input type="hidden" id="userid" name="userid" value="<%=vo.getUserid() %>">
				<%=vo.getUserid() %>
			</td>
		  </tr>
		  <tr>
			<td width=200 align=center bgcolor="E6ECDE" height="22">비밀번호</td>
			<td width=390 bgcolor="ffffff" style="padding-left:20">
				<input type="password" style="width:150" name="userpwd" value="<%=vo.getUserpwd() %>">
			</td>
		  </tr>
		  
		  <tr>
			<td width=200 align=center bgcolor="E6ECDE" height="22">이름</td>
			<td width=390 bgcolor="ffffff" style="padding-left:20">
				<%=vo.getUsername() %>
			</td>
		  </tr>
		  
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">이름</td>
			<td width=490 bgcolor="ffffff" style="padding-left:20">
				<%=vo.getGender() %>
			</td>
		  </tr>
		  
		  <tr>
			<td width=200 align=center bgcolor="E6ECDE" height="22">이메일 주소</td>
			<td width=390 bgcolor="ffffff" style="padding-left:20">
				<%=vo.getEmail() %>
			</td>
		  </tr>		
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">전화 번호</td>
			<td width=390 bgcolor="ffffff" style="padding-left:20">
				<%=vo.getPhone() %>
			</td>
		  </tr>		
		  <tr>
			<td width=200 align=center bgcolor="E6ECDE" height="22">주    소</td>
			<td width=390 bgcolor="ffffff" style="padding-left:20">
				<%=vo.getAddress() %>
			</td>
		  </tr>	
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">가능 프로그래밍언어</td>
			<td width=390 bgcolor="ffffff" style="padding-left:20">
				<%=vo.getP_lang() %>
			</td>
		  </tr>			
	  </table>

	  <br>
	  
	  <table width=590 border=0 cellpadding=0 cellspacing=0>
		  <tr>
			<td align=center>
			<input type="button" value="회원 정보 수정" id="updateInfo" 
			onclick="sendform()" > &nbsp;
			 
			</td>
		  </tr>
	  </table>

	  </td>
	</tr>
</table>  
 
 <hr>
 쿠키 정보 : <br>
 <%
    Cookie[] cookies = request.getCookies();
    for (Cookie c : cookies){
    	 out.print(c.getName()+":" + c.getValue()+"<br>");
    }
   %>
${cookie.userid.name} :${cookie.userid.value} <br>
${cookie.username.name} : ${cookie.username.value}<br>  
 
</body>
</html>