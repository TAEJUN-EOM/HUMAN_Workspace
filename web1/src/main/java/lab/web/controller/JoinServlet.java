package lab.web.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lab.web.dao.MembersDAO;
import lab.web.vo.UserVO;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

 
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
    
    public JoinServlet() {
        super();         
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		response.sendRedirect("./joinform.jsp");
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html; charset=UTF-8");
		 PrintWriter out = response.getWriter();
		 UserVO vo = new UserVO();
		 vo.setUserid(request.getParameter("userid"));
		 vo.setUserpwd(request.getParameter("userpwd"));
		 vo.setUsername(request.getParameter("username"));
		 vo.setEmail(request.getParameter("email"));
		 vo.setPhone(request.getParameter("phone"));
		 vo.setAddress(request.getParameter("address"));
		 vo.setGender(request.getParameter("gender"));
		 String[] languages =  request.getParameterValues("p_lang");
		 StringBuffer sb = new StringBuffer();
		 for(String s : languages) {
			 sb.append(s);
		     sb.append(",");
		 }
		 vo.setP_lang(sb.toString());
		 MembersDAO dao = new MembersDAO();
		 RequestDispatcher rd = null;
		 if(dao.insertMember(vo)>0 ) {
			 System.out.println("insert ¼º°ø");
			 rd = request.getRequestDispatcher("/result.jsp");
			 request.setAttribute("user", vo);
			 rd.forward(request, response);
		 }
		 
		 
		 
	}

}
