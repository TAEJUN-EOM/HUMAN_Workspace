package lab.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

 


@WebServlet(name = "UploadServlet", urlPatterns = {"/upload.do"})
@MultipartConfig
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
     
    public UploadServlet() {
        super();         
    }
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {    	 
    	Part filePart = request.getPart("file");
    	String writer  = request.getParameter("userid");
    	String fileName = filePart.getSubmittedFileName();
    	filePart.write("d://upload//"+fileName);
    	response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("file upload success<br>");
		out.print("ÀÛ¼ºÀÚ :"+ writer);
    }    

}
