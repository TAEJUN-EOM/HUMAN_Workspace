<%@ page   contentType="text/html; charset=UTF-8" errorPage="error/errorHandle.jsp"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta  charset="UTF-8">
<title>JSP 내장 객체</title>
</head>
<body>
 JSP에서 선언과 생성(new)없이 사용할 수 있는 객체 <br>
 컨테이너에 의해 미리 선언된 자바클래스의 참조 변수 <br>
 스크립트릿이나 표현식에서 사용할 수 있음 <br>
 request [javax.servlet.http.HttpServletRequest] :   HTML폼에서 입력한 값을 가지고 올 때  <br>
 HTML Form 요소 선택 값과 같은 사용자 입력 정보를 읽어올 때 사용
 <br>
 session [javax.servlet.http.HttpSession] : 세션 관련 작업을 처리할 때 <br>
 스크립트릿에서 브라우저 출력이 필요할 때 out<br>
 response[javax.servlet.http.HttpServletResponse] : 사용자 요청을 다른페이지로 전달할 때 
  사용자 요청에 대한 응답을 처리할 때 사용  <br>
 <br>
 pageContext [javax.servlet.jsp.PageContext] : 현재 JSP에 대한 각종 정보를 알고자 할 때 <br>
 application [javax.servlet.ServletContext] : 웹 서버의 애플리케이션 처리와 관련된 정보를 참조하기 위해 사용<br>
 out [javax.servlet.jsp.JspWriter] : 사용자에게 전달하기 위한 output 스트림 처리하기 위해 사용
 config [javax.servlet.ServletConfig ] : 현재 JSP에 대한 초기화 환경을 처리하기 위해 사용
 <br>
 page [java.lang.Object] : 현재 JSP 페이지에 대한 클래스 정보
 exception [java.lang.Throwable]  : 예외처리를 위해 사용
 <hr>
 HttpSession주요 메서드 <br>
 getID() : 각 접속에 대한 세션 고유의 ID를 문자열 형태로 반환<br>
 getCreatingTime( ) : 세션이 생성된 시간을 January 1, 1970 GMT.부터 long형 밀리세컨트 값으로 반환<br>
 getLastAccessedTime( ) : 현재 세션으로 마지막 작업한 시간을 long형 밀리세컨드 값으로 반환
 getMaxInactiveInterval( ) : 세션 유지 시간을 초로 반환, 세션 유효 시간을 알수 있다.
 setMaxInactiveInterval(t) : 세션 유효 시간을 t에 설정된 초 값으로 설정
 invalidate( ) : 현재 세션을 종료. 세션과 관련한 값을 모두 지운다.
 setAttribute(name,  attr) : 세션에 key, value 형태로 객체를 저장할 때 
 getAttribute(name)  : 세션에 저장된 key name으로 value 객체를 반환
 
 <br>
 1. WEB-INF아래 lib 폴더에 driver클래스.jar파일 저장<br>
 C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar<br>
 2. WAS 마다 db연결객체를 pooling형태로 관리함 <br>
 pool에 저장된 객체를 요청할때마다 WAS의 Directory Name Server 등록된 이름으로 요청해야 함 : JNDI 방식<br>
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
  
  
 <br>
</body>
</html>