package lab.web.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.io.PrintWriter;
 

 
public class LoggingFilter extends HttpFilter {       
	FilterConfig   filterConfig  = null;
    public LoggingFilter() {
        super();       
    }

    public void init(FilterConfig fConfig) throws ServletException {
		 System.out.println("���� �ʱ�ȭ...���Ͱ� � ����� ������ �ʿ䰡 ���� ������ ȣ��");
		 filterConfig  = fConfig;
	}
	 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("jsp�Ǵ� servlet ��û ���� ���� ���ͷ� ��ó�� �۾� ����");
		System.out.println("ServletRequest ��ü�� ü���� ���� �����ϴ� ��û");
		System.out.println("ServletResponse ��ü�� ü���� ���� �����ϴ� ����");
		System.out.println("FilterChain ��ü�� ü�ο��� ���� ���͸� ȣ���ϴ� �� ���");
		String userid=request.getParameter("userid");
		String userpwd=request.getParameter("userpwd");
		String param1 = filterConfig.getInitParameter("uid");
		String param2 = filterConfig.getInitParameter("upwd");
		String message ;
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();
		if(userid.equals(param1)  && userpwd.equals(param2)) {
			message ="������ ���� ����! �α��� �Ϸ�";
		}else {
			message ="������ ���� ����!  ";
		}
		writer.println(message);
		chain.doFilter(request, response);		
		System.out.println("jsp(view)�� ���� ���� ���� ���ͷ� ��ó�� �۾� ����"); 
	}

	public void destroy() {
		System.out.println("���Ͱ� �޸𸮿��� �Ҹ�ɶ�...�ѹ��� �����"); 
	} 
	

}
