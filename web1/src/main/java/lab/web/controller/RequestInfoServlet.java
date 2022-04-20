package lab.web.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

 
public class RequestInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
     
    public RequestInfoServlet() {
        super();        
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 클라이언트 응답시 전달될 컨텐트에 대한 타입 설정과 캐릿터셋 지정
		response.setContentType("text/html; charset=UTF-8");
		//클라이언트 응답을 위한 출력 스트림 객체 생성
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>계산기</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H2>Cookie</H2>");
//		Cookie[] cookies = request.getCookies();		
//		for (Cookie c : cookies) {
//			 out.println(c.getName()+ ":" +c.getValue()+"<br>");
//		}
		out.println("<hr>");
		HttpSession session = request.getSession();
		out.println("Session ID :"+session.getId()+"<br>");
		out.println("client ip address :" +request.getRemoteAddr()+"<br>");
		out.println("ContextPath : "+request.getContextPath()+"<br>");
		out.println("요청 방식 : " +request.getMethod()+"<br>");
		out.println("<hr>");
		out.println("요청 http 헤더 정보");
		Enumeration<String> headers =  request.getHeaderNames();
		while(headers.hasMoreElements()) {
			String name = headers.nextElement();
			String value = request.getHeader(name);
			out.println(name+" : "+value+"<br>");
		}		
		out.println("</body></html>");		
	}
}
