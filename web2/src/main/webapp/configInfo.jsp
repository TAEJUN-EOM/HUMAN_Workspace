<%@page import="java.util.Enumeration"%>
<%@ page  contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
config 내장 객체 [javax.servlet.http.ServletConfig] : <br>
web.xml 에 설정된 초기화 파마라터를 애플리케이션에서 공유할수 있는 초기화 변수 접근<br>
웹 컨텍스트를 의미하는 내장 객체는 application[ServetContext] 객체를 가져옴<br>
web.xml 에 context-param, param-name, param-value는 application내장 객체로 접근<br>
web.xml 에 servlet의 param-name, param-value는 config내장 객체로 접근<br>
<hr>
<%
    //ServetContext sc = config.getServletConfig();
    Enumeration<String> params = application.getInitParameterNames();
    while(params.hasMoreElements()){
    	String name = params.nextElement();
    	String value = application.getInitParameter(name);
    	out.println(name +":"+value+"<br>");    			
    }
   
%>
웹 컨텍스트 Path : <%=  application.getContextPath() %> <br>
웹 컨텍스트 물리적인 Path : <%=  application.getRealPath("/web2/config") %> <br>
ServletContext의 MajorVersion : <%=  application.getMajorVersion()  %> <br>
ServletContext의 MinorVersion : <%=  application.getMinorVersion()  %> <br>
ServerInfo : <%=  application.getServerInfo() %> <br>
SessionTimeout : <%=  application.getSessionTimeout() %> <br>
application.log(String) : WAS 서버의 로그 폴더 아래 로그 파일에 기록<br>
                          로그 파일 위치는 컨테이너에 따라 다름<br>
                          
<br>
<strong>RequestDispatcher방식으로 요청을 forward :</strong><br>
동일 웹서버내에 다른 웹컨텍스트의 JSP 또는 Servlet에 요청을 forward할 수 있음<br>
동일 웹컨텍스트의 JSP 또는 Servlet에 요청을 forward할 수 있음<br>
forward할때 request와 response객체를 전달하기 때문에 request객체 setAttribue(name, valueObject)를 
이용해서 추가 정보도 전달할 수 있음<br>
<br>
<strong>response객체의 sendRedirect방식으로 요청을  forward : </strong>  <br>                     
동일 웹서버내에 다른 웹컨텍스트의 JSP 또는 Servlet에 요청을 forward할 수 있음<br>
동일 웹컨텍스트의 JSP 또는 Servlet에 요청을 forward할 수 있음<br>
다른 웹서버로 요청을 forward할 수 있음<br>                          
request와 response객체를 전달하지 않고 forward된 JSP 또는 Servlet에서 
새로 request와 response객체가 생성됩니다.<br>
url의 querystring으로만 추가 정보를 전달수 있습니다.<br>
<hr>
동일 웹서버내에 다른 웹컨텍스트의 JSP 또는 Servlet 또는 
동일 웹컨텍스트의 JSP 또는 Servlet에 추가 정보를 forward로 전달할 때 <br>
request객체 setAttribute(name, valueObject)<br>
session객체 setAttribute(name, valueObject)<br>
application객체 setAttribute(name, valueObject)<br>
getAttribute(name), removeAttribute(name) <br>
<hr>
DB연동을 위해서 WAS에서 제공되는 Connection Pool에 WAS시작할때<br>
DataSource타입의 객체를 일정개수 생성해놓도록 설정<br>
</body>
</html>



















 