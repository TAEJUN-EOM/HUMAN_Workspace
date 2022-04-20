package lab.web.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

 
public class ResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
    
    public ResponseServlet() {
        super();        
    }
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("application/vnd.ms-word;charset=UTF-8");		
		response.setContentType("text/html;charset=UTF-8");		 
		PrintWriter out = response.getWriter();
		out.println("Å×½ºÆ®");
		response.sendRedirect("http://www.naver.com");		 
	}

}


