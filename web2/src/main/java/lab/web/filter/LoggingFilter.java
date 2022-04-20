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
		 System.out.println("필터 초기화...필터가 어떤 기능을 수행할 필요가 있을 때마다 호출");
		 filterConfig  = fConfig;
	}
	 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("jsp또는 servlet 요청 전달 전에 필터로 전처리 작업 수행");
		System.out.println("ServletRequest 객체는 체인을 따라 전달하는 요청");
		System.out.println("ServletResponse 객체는 체인을 따라 전달하는 응답");
		System.out.println("FilterChain 객체는 체인에서 다음 필터를 호출하는 데 사용");
		String userid=request.getParameter("userid");
		String userpwd=request.getParameter("userpwd");
		String param1 = filterConfig.getInitParameter("uid");
		String param2 = filterConfig.getInitParameter("upwd");
		String message ;
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();
		if(userid.equals(param1)  && userpwd.equals(param2)) {
			message ="관리자 인증 성공! 로그인 완료";
		}else {
			message ="관리자 인증 실패!  ";
		}
		writer.println(message);
		chain.doFilter(request, response);		
		System.out.println("jsp(view)로 응답 전달 전에 필터로 후처리 작업 수행"); 
	}

	public void destroy() {
		System.out.println("필터가 메모리에서 소멸될때...한번만 수행됨"); 
	} 
	

}
