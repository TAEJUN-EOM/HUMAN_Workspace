<%@page import="lab.web.ajax.LoginDAO"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.Connection"%>
<%@ page   contentType="text/xml; charset=utf-8"     %>
<%
Connection con = null;
String outString = "";
int result = 0 ;
String id = request.getParameter("userid"); 
String passwd = request.getParameter("userpwd"); 
System.out.println(id);
System.out.println(passwd);
LoginDAO dao = new LoginDAO();
result = dao.loginProc(id, passwd);	
 
outString="<response><result>"+ result + "</result><id>"+ id 
			+"</id></response>";
 
out.println(outString); 

%>
 