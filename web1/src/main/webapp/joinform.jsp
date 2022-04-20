<%@ page   contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>I회원가입</title>
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
			<td bgcolor="f4f4f4" height="22">&nbsp;&nbsp;<b>사용자 관리 - 회원 가입</b></td>
		  </tr>
	  </table>  
	  <br>
	  
	  <!-- write Form  -->
	  <form name="f" method="post" action="join">
	  
	  <table border="0" cellpadding="0" cellspacing="1" width="590" bgcolor="BBBBBB">
		  <tr>
			<td width=200 align=center bgcolor="E6ECDE" height="22">사용자 아이디</td>
			<td width=390 bgcolor="ffffff" style="padding-left:10">
				<input type="text" style="width:150" name="userid"  >
			</td>
		  </tr>
		  <tr>
			<td width=200 align=center bgcolor="E6ECDE" height="22">비밀번호</td>
			<td width=390 bgcolor="ffffff" style="padding-left:20">
				<input type="password" style="width:150" name="userpwd">
			</td>
		  </tr>
		  
		  <tr>
			<td width=200 align=center bgcolor="E6ECDE" height="22">이름</td>
			<td width=390 bgcolor="ffffff" style="padding-left:20">
				<input type="text" style="width:240" name="username">
			</td>
		  </tr>
		  
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">이름</td>
			<td width=490 bgcolor="ffffff" style="padding-left:20">
				<input type="radio" style="width:240" name="gender" value="여자">여자
				<input type="radio" style="width:240" name="gender" value="남자">남자
			</td>
		  </tr>
		  
		  <tr>
			<td width=200 align=center bgcolor="E6ECDE" height="22">이메일 주소</td>
			<td width=390 bgcolor="ffffff" style="padding-left:20">
				<input type="text" style="width:240" name="email">
			</td>
		  </tr>		
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">전화 번호</td>
			<td width=390 bgcolor="ffffff" style="padding-left:20">
				<input type="text" style="width:240" name="phone">
			</td>
		  </tr>		
		  <tr>
			<td width=200 align=center bgcolor="E6ECDE" height="22">주    소</td>
			<td width=390 bgcolor="ffffff" style="padding-left:20">
				<input type="text" style="width:240" name="address">
			</td>
		  </tr>	
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">가능 프로그래밍언어</td>
			<td width=390 bgcolor="ffffff" style="padding-left:20">
				<input type="checkbox" style="width:240" name="p_lang" value="java">JAVA
				<input type="checkbox" style="width:240" name="p_lang" value="pytho">PYTHON
				<input type="checkbox" style="width:240" name="p_lang" value="html">HTML
				<input type="checkbox" style="width:240" name="p_lang" value="javascript">JAVASCRIPT
				<input type="checkbox" style="width:240" name="p_lang" value="sql">SQL
			</td>
		  </tr>			
	  </table>

	  <br>
	  
	  <table width=590 border=0 cellpadding=0 cellspacing=0>
		  <tr>
			<td align=center>
			<input type="submit" value="회원 가입"  > &nbsp;
			<input type="reset" value="취소"  >
			</td>
		  </tr>
	  </table>

	  </td>
	</tr>
</table>  
	  </form>
</body>
</html>