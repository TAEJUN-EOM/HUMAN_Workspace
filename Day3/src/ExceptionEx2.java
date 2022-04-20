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
		//메서드 처리중 예외가 발생됨을 모의
		if(true) throw new IOException("예외 발생");
	}
	public static void main(String[] args) throws IOException {
		ExceptionEx2 ex = new ExceptionEx2();
		ex.method1();
	}
}
