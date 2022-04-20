package lab.web.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

 
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
    
    public LogoutServlet() {
        super();        
    }
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");  
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		Cookie[] cookies = request.getCookies();
		session.invalidate(); //���� �����Ŵ
		for(Cookie c : cookies) {
			c.setMaxAge(0); //��Ű ����
			response.addCookie(c);
		}
		out.println("<script>");
		out.println("window.alert('�α� �ƿ� �Ǿ����ϴ�.');");
		out.println("location.href='/web2/login'");
		out.println("</script>");
		 
	}

}





