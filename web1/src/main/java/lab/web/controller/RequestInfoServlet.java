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
		// Ŭ���̾�Ʈ ����� ���޵� ����Ʈ�� ���� Ÿ�� ������ ĳ���ͼ� ����
		response.setContentType("text/html; charset=UTF-8");
		//Ŭ���̾�Ʈ ������ ���� ��� ��Ʈ�� ��ü ����
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>����</TITLE></HEAD>");
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
		out.println("��û ��� : " +request.getMethod()+"<br>");
		out.println("<hr>");
		out.println("��û http ��� ����");
		Enumeration<String> headers =  request.getHeaderNames();
		while(headers.hasMoreElements()) {
			String name = headers.nextElement();
			String value = request.getHeader(name);
			out.println(name+" : "+value+"<br>");
		}		
		out.println("</body></html>");		
	}
}
