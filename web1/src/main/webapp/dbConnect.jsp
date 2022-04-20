<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page   contentType="text/html; charset=UTF-8" errorPage="error/errorHandle.jsp"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta  charset="UTF-8">
<title>dbConnect.jsp</title>
</head>
<body>
<%
try{
//WAS 의 디렉토리 네이밍 컨텍스트를 사용하기 위한 객체 생성
Context initCtx = new InitialContext();
//톰캣의 디렉토리 네이밍 컨텍스트를 Access할 수 있는 Context객체를 받아옴
Context envCtx = (Context) initCtx.lookup("java:comp/env");
//톰캣의 디렉토리 네이밍 컨텍스트에 등록된 DataSource 객체를 받아옴( pool에서 꺼내옴)
DataSource ds = (DataSource) envCtx.lookup("jdbc/oracle");
//DB 연결
Connection conn = ds.getConnection();
Statement stat = conn.createStatement();
String sql = "select * from dept ";
ResultSet rs = stat.executeQuery(sql);
out.print("부서번호&nbsp;&nbsp;부서명&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;위치<br>");
while(rs.next()){
	out.print(rs.getInt(1)+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
	out.print(rs.getString(2)+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
	out.print(rs.getString(3)+"<br>");
}
rs.close();
stat.close();
conn.close();
}catch(Exception e){
	e.printStackTrace();
}

%> 
</body>
</html>