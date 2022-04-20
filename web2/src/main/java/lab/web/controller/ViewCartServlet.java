package lab.web.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class ViewCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ViewCartServlet() {
        super();         
    }
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");  
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		RequestDispatcher rd = null;
		if(session.getAttribute("userid")!=null) {
			rd = request.getRequestDispatcher("/viewCart.jsp");
			rd.forward(request, response);
		}else {
			 response.sendRedirect("./loginform.jsp?req=viewCart");
		}
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	}

}






