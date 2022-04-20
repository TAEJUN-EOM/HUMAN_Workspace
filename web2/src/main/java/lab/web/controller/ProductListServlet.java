package lab.web.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lab.web.dao.ProductDAO;
import lab.web.vo.ProductVO;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

 
public class ProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
    public ProductListServlet() {
        super();        
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");  
		PrintWriter out = response.getWriter();
		ProductDAO dao = new ProductDAO();
		List<ProductVO> productList =dao.getPRoductList();
		 
		if(productList!=null) {
			RequestDispatcher rd = request.getRequestDispatcher("/productList.jsp");
			request.setAttribute("products", productList);
			rd.forward(request, response);
		} 
		
	}//doGet end
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
