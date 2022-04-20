

public class InterfaceEx1 {

	public static void main(String[] args) {
		//MyInterface my = new MyInterface();
		System.out.println( MyInterface.PORT); //Static변수임
		//MyInterface.PORT = 9500;
		MyInterface.staticMethod();
		MyInterface  my = new MyInterfaceImpl(); //my는 다형성 객체
		my.defaultMethod();
		my.method();	 
	}

}
