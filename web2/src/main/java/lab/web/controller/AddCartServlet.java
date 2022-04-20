package lab.web.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lab.web.vo.ProductVO;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

 
public class AddCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
    
    public AddCartServlet() {
        super();        
    }
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	 
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");  
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		ProductVO product = new ProductVO();
		product.setPid(request.getParameter("pid"));
		product.setPname(request.getParameter("pname"));
		product.setPrice(Integer.parseInt(request.getParameter("price")));
		product.setQty(Integer.parseInt(request.getParameter("qty")));
		ArrayList<ProductVO> cart = null;
		cart = (ArrayList)session.getAttribute("cart") ;
		if(cart!=null){
		  cart.add(product);		  
		}else{
			cart = new ArrayList<ProductVO>();
			cart.add(product);
		}
		System.out.println("장바구니에 저장된 상품개수 :" +cart.size());
		session.setAttribute("cart", cart); 
		//response.sendRedirect("./list"); 
		out.println("<script>");
		out.println("window.alert('장바구니에 추가되었습니다.');");
		out.println("location.href='/web2/list'");
		out.println("</script>");
		 
	}

}
