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
		//JspContext�� �� �±׸� ����� JSP �������� ���� ������  ��� �ִ�.  
        PageContext context = (PageContext)this.getJspContext();
        
        //�±װ� ȣ��� JSP�� ���� ��û ������ �����´�.
        HttpServletRequest request =  (HttpServletRequest)context.getRequest();
        System.out.println("�±װ� ȣ��� JSP URI : " +  request.getRequestURI());
        
        //Jsp �������� ����� �������� ����� ��½�Ʈ���� ��´�.
        JspWriter out = context.getOut();
        //Ŀ���� �±��� ��ü�� ���� StringWriter
        StringWriter stringWriter = new StringWriter();
         //�±׸� ����Ҷ� ������ �Ӽ�����
        String color = this.getColor();
        int iterNum = this.getIterNum();
        
        //invoke()�� ����Ǹ� StringWriter�� ��ü �ؽ�Ʈ�� ����.
        getJspBody().invoke(stringWriter);
        String bodyText = stringWriter.toString();
        
        out.print("<span style=\" background-color: "+ color + ";  \">");
        for(int i=0; i < iterNum; i++ ) {
        	out.print("�ڡ�" + bodyText + "�ڡ�<br> ");
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
