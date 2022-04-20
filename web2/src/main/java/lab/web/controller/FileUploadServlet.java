package lab.web.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part; 


@WebServlet(name = "FileUploadServlet", urlPatterns = {"/upload"})
@MultipartConfig (
		fileSizeThreshold = 1024 * 1024 * 1,
		maxFileSize = 1024 * 1024 * 10, 
		maxRequestSize = 1024 * 1024 * 100
		)
public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
     
    public FileUploadServlet() {
        super();         
    }
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
    	 
    	  response.setContentType("text/html;charset=UTF-8");    	   
          final String title = request.getParameter("title");
          final String userid = request.getParameter("userid");
          final Part filePart = request.getPart("file");
          final String fileName = getFileName(filePart);
          OutputStream out = null;
          InputStream filecontent = null;
          final PrintWriter writer = response.getWriter();
          try {
        	File f =  new File("d://upload//" + fileName);
          	out = new FileOutputStream(f);
          	filecontent = filePart.getInputStream();
          	int read = 0;
              final byte[] bytes = new byte[1024];
              while ((read = filecontent.read(bytes)) != -1) {
                  out.write(bytes, 0, read);
              }
               
              writer.println("New file " + fileName + " created at " + f +"<br>");
              writer.println("제목 :  " +  title  +"<br>");
              writer.println("작성자 :  " +  userid  +"<br>");
          }catch (FileNotFoundException fne) {
          	 writer.println("업로드할 파일을 선택하지 않았거나 업로드할 대상 디렉토리가 존재하지 않습니다.");
          	 
               writer.println("<br/> ERROR: " + fne.getMessage());
          }finally {
              if (out != null) {
                  out.close();
              }
              if (filecontent != null) {
                  filecontent.close();
              }
              if (writer != null) {
                  writer.close();
              }
          }
    }
    
    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
      
        
        
        
        
    }
    private String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");
         
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }

}
