package lab.web.tag;

import java.io.IOException;
import java.io.StringWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.PageContext;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class CustomTag extends SimpleTagSupport{
	private String color;
	private int iterNum;
	@Override
	public void doTag() throws JspException, IOException {
		//JspContext는 이 태그를 사용한 JSP 페이지에 대한 정보를  담고 있다.  
        PageContext context = (PageContext)this.getJspContext();
        
        //태그가 호출된 JSP에 대해 요청 정보를 가져온다.
        HttpServletRequest request =  (HttpServletRequest)context.getRequest();
        System.out.println("태그가 호출된 JSP URI : " +  request.getRequestURI());
        
        //Jsp 페이지의 결과를 브라우저로 출력할 출력스트림를 얻는다.
        JspWriter out = context.getOut();
        //커스텀 태그의 몸체를 담을 StringWriter
        StringWriter stringWriter = new StringWriter();
         //태그를 사용할때 지정한 속성값들
        String color = this.getColor();
        int iterNum = this.getIterNum();
        
        //invoke()가 실행되면 StringWriter의 몸체 텍스트가 담긴다.
        getJspBody().invoke(stringWriter);
        String bodyText = stringWriter.toString();
        
        out.print("<span style=\" background-color: "+ color + ";  \">");
        for(int i=0; i < iterNum; i++ ) {
        	out.print("★★" + bodyText + "★★<br> ");
        }
        out.print("</span>");
        
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getIterNum() {
		return iterNum;
	}
	public void setIterNum(int iterNum) {
		this.iterNum = iterNum;
	}
	
	
}
