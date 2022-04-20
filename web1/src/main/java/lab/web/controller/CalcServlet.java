package lab.web.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

 
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
     
    public CalcServlet() {
        super();        
    }
	
    // POST 요청을 처리하기 위한 메서드
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int  num1,num2;
		int result;
		String op;
		// 클라이언트 응답시 전달될 컨텐트에 대한 타입 설정과 캐릿터셋 지정
		response.setContentType("text/html; charset=UTF-8");
		//클라이언트 응답을 위한 출력 스트림 객체 생성
		PrintWriter out = response.getWriter();
		// HTML 폼을 통해 전달된 num1, num2 파라미터 값을 변수에 할당한다.
		num1 = Integer.parseInt(request.getParameter("num1"));
		num2 = Integer.parseInt(request.getParameter("num2"));
		op = request.getParameter("operator");
		result = calc(num1,num2,op);
		// 출력 스트림을 통해 응답 페이지 내용 구성
		out.println("<HTML>");
		out.println("<HEAD><TITLE>계산기</TITLE></HEAD>");
		out.println("<BODY><center>");
		out.println("<H2>계산결과</H2>");
		out.println("<HR>");
		out.println(num1+" "+op+" "+num2+" = "+result);
		out.println("</BODY></HTML>");
	}
	public int calc(int num1, int num2, String op) {
		int result = 0;
		switch(op) {
		case "+" : result = num1 + num2; break;
		case "-" : result = num1 - num2; break;
		case "*" : result = num1 * num2; break;
		case "/" : result = num1 / num2; break;
		}
		return result;
	}

}


















