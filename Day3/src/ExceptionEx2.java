import java.io.IOException;

public class ExceptionEx2 {
	public void method1() throws IOException {
		System.out.println("method1() called");
	       method2();
	}
	public void method2() throws IOException {
		System.out.println("method2() called");
		method3();
	}
	public void method3() throws IOException {
		System.out.println("method3() called");
		//�޼��� ó���� ���ܰ� �߻����� ����
		if(true) throw new IOException("���� �߻�");
	}
	public static void main(String[] args) throws IOException {
		ExceptionEx2 ex = new ExceptionEx2();
		ex.method1();
	}
}
