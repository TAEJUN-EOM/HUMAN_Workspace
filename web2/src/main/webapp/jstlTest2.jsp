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
<form>
<select name="sel">
	<option>-</option>
	<option>a</option>
	<option>b</option>
	<option>c</option>
	<option>d</option>
</select>
<input type=submit value="선택">
</form>

<HR>
<c:choose>
	<c:when test="${param.sel == 'a'}" >
		a 를 선택
	</c:when>
	<c:when test="${param.sel == 'b'}" >
		b 를 선택
	</c:when>
	<c:when test="${param.sel == 'c'}" >
		c 를 선택
	</c:when>
	<c:otherwise>
		a,b,c 이외의 것을 선택
	</c:otherwise>
</c:choose>
<br>
 
${header.accept-language} <br>
${header.accept-encoding} <br>









</body>
</html>