<%@ page contentType="text/html; charset=utf-8"    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<br>
<br>
<br>
<br> 
<table>
<tr><td colspan="5" align="right"><a href="./viewCart">장바구니</a></td>
<td align="right"><a href="./logout">로그아웃</a></td></tr>
<tr><th>번호</th>
<th>상품이미지</th>
<th>상품내용</th>
<th>상품가격</th>
<th>수량</th>
<th>장바구니</th>
</tr>
<c:forEach items="${products}"  var="product" varStatus="status">
<form action="addCart.do" method="post">
<input type="hidden" id="pid" name="pid" value="${product.pid}">
<input type="hidden" id="pname" name="pname" value="${product.pname}">
<input type="hidden" id="price" name="price" value="${product.price}">
<tr><td>${status.count}</td>
<td width="100"><img src="${product.pimg}" width="70" height="70"></td>
<td width="250">${product.pname}</td>
<td width="100">${product.price} 원</td>
<td width="70"><select id="qty" name="qty">
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
 </select></td>
 <td width="150"><button id="addCart">장바구니 담기</button></td>
 </tr>
</form>
</c:forEach>
</table>
</body>
</html>