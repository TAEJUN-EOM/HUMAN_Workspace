package lab.web.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

 
public class ConfigInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;       
     
    public ConfigInfo() {
        super();         
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=utf-8");
		 PrintWriter out = response.getWriter();
		 ServletConfig config = this.getServletConfig();
		 ServletContext sc = request.getServletContext();
		 out.print("<html>");
		 out.print("<head>");
		 out.print("<meta charset=\"utf-8\">");
		 out.print("<title>초기화 정보 web.xml에서 읽어오기</title>");
		 out.print("</head>");
	     out.print("<body>");
	     out.print("ConfigInfo 서블릿 초기화 정보 web.xml에서 읽어오기 <br>");
	     Enumeration<String> params = config.getInitParameterNames();
	     while(params.hasMoreElements()){
	     	String name = params.nextElement();
	     	String value = config.getInitParameter(name);
	     	out.println(name +":"+value+"<br>");    			
	     }
	     out.print("<hr>");
	     out.print("web2 웹컨텍스트의  초기화 정보 web.xml에서 읽어오기 <br>");
	     params = sc.getInitParameterNames();
	     while(params.hasMoreElements()){
	     	String name = params.nextElement();
	     	String value = sc.getInitParameter(name);
	     	out.println(name +":"+value+"<br>");    			
	     }
	     
	     out.print("</body>");
	     out.print("</html>");
	     
	}

}
