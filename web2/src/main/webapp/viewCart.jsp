<%@ page contentType="text/html; charset=utf-8"    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style>
th  { background-color: yellow;}
td {text-align:center;}
</style>
</head>
<body>
<table>
<tr>
<td colspan="3"><a href="./list">목록</a></td> 
<td><a href="./logout">로그아웃</a></td>
</tr>
<tr><th>상품ID</th>
<th>상품명</th>
<th>수량</th>
<th>구매가격</th>
</tr>
<c:forEach  items="${cart}" var="product"> 
<tr>
<tr><td width="100">${product.pid }</td> 
<td width="350" >${product.pname }</td>
<td width="100">${product.qty}</td>
<td width="70"> ${product.qty*product.price } 원</td> 
</tr>	
</c:forEach> 

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


