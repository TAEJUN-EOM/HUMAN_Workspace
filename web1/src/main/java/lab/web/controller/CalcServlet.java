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
	
    // POST ��û�� ó���ϱ� ���� �޼���
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int  num1,num2;
		int result;
		String op;
		// Ŭ���̾�Ʈ ����� ���޵� ����Ʈ�� ���� Ÿ�� ������ ĳ���ͼ� ����
		response.setContentType("text/html; charset=UTF-8");
		//Ŭ���̾�Ʈ ������ ���� ��� ��Ʈ�� ��ü ����
		PrintWriter out = response.getWriter();
		// HTML ���� ���� ���޵� num1, num2 �Ķ���� ���� ������ �Ҵ��Ѵ�.
		num1 = Integer.parseInt(request.getParameter("num1"));
		num2 = Integer.parseInt(request.getParameter("num2"));
		op = request.getParameter("operator");
		result = calc(num1,num2,op);
		// ��� ��Ʈ���� ���� ���� ������ ���� ����
		out.println("<HTML>");
		out.println("<HEAD><TITLE>����</TITLE></HEAD>");
		out.println("<BODY><center>");
		out.println("<H2>�����</H2>");
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


















