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
import java.util.Date;

 
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
    
    public AdminLoginServlet() {
        super();        
    }	
	 
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String uid = request.getParameter("userid");
		String upwd = request.getParameter("userpwd");
		out.println(uid+" 로그인 시각 :" +new Date());		
	}//doPost() end

}




