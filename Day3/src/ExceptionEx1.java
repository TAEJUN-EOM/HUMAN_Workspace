import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionEx1 {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print ("�̸��� �Է��ϼ���>>");
		String line  = null;
		try {
		 line = br.readLine(); //checked Exception
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(line);
	}

}
