package lab.web.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import lab.web.vo.Member; 
import java.util.ArrayList;
 
public class JstlExServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
    
    public JstlExServlet() {
        super();         
    }
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=utf-8");
		 PrintWriter out = response.getWriter();
		 ArrayList<Member> list = new ArrayList<Member>();
		 list.add(new  Member("È«±æµ¿", "hong@korea.com"));
		 list.add(new Member("¹Ú¹®¼ö", "park@korea.com"));
		 list.add(new Member("ÀÌ¸ù·æ", "lee@korea.com"));
		 RequestDispatcher rd = request.getRequestDispatcher("/jstlTest.jsp");
		 request.setAttribute("members", list);
		 request.setAttribute("size", list.size());
		 rd.forward(request, response);		 
	}

}

