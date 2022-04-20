package lab.web.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lab.web.dao.UserManageDAO;
import lab.web.vo.MemberVO;

import java.io.IOException;
import java.io.PrintWriter;

 
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();        
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("/loginform.jsp");
		rd.forward(request, response);		 
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String uid = request.getParameter("userid");
		String upwd = request.getParameter("userpwd");
		String req = request.getParameter("req");
		UserManageDAO dao = new UserManageDAO();
		MemberVO vo = dao.loginProc(uid, upwd);
		RequestDispatcher rd = null;
		HttpSession session = request.getSession();
		if(vo!=null) {			
			session.setAttribute("userid", uid);
			request.setAttribute("user", vo);
			Cookie cookie1 = new Cookie("userid", uid);
			Cookie cookie2 = new Cookie("username",vo.getUsername()  );
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			if(req.equals("viewCart")) {
				response.sendRedirect("./viewCart");				 
			}else {
				rd = request.getRequestDispatcher("/loginSuccess.jsp");
				rd.forward(request, response);
			}
		}else {
			rd = request.getRequestDispatcher("/loginFail.jsp");			 
			rd.forward(request, response);
		}		
		
	}//doPost() end

}




