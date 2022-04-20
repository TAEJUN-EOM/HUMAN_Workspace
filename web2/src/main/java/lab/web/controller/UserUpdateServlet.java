package lab.web.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lab.web.dao.UserManageDAO;
import lab.web.vo.MemberVO;

import java.io.IOException;
import java.io.PrintWriter;

 
public class UserUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
     
    public UserUpdateServlet() {
        super();        
    }
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //userid 파라미터를 DAO 전달해서 user정보 조회해서 updateform.jsp로 전달
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String uid = request.getParameter("userid");		 
		UserManageDAO dao = new UserManageDAO();
		MemberVO vo = dao.getUserInfo(uid );
		RequestDispatcher rd = null;
		if(vo!=null) {
			rd = request.getRequestDispatcher("/updateform.jsp");
			request.setAttribute("user", vo);
			rd.forward(request, response);
		}		
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		MemberVO vo = new MemberVO();
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
		 UserManageDAO dao = new UserManageDAO();
		 RequestDispatcher rd = null;
		 if(dao.updateUser(vo)>0){
			 MemberVO user = dao.getUserInfo(vo.getUserid());
			 rd = request.getRequestDispatcher("/loginSuccess.jsp");
			 request.setAttribute("user", user);
			 rd.forward(request, response);
		 }		
	}
}
