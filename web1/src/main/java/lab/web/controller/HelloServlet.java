package lab.web.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

 
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
   
    public HelloServlet() {
    	super();        
    }	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html> <head>");
		out.print("<meta charset=\"utf-8\">");
		out.print("<title>Insert title here</title>");
		out.print("</head> <body>");
		out.print("안녕하세요? HelloServlet입니다^^");
		out.print("</body></html>");
	}

}
