

public class InterfaceEx1 {

	public static void main(String[] args) {
		//MyInterface my = new MyInterface();
		System.out.println( MyInterface.PORT); //Static������
		//MyInterface.PORT = 9500;
		MyInterface.staticMethod();
		MyInterface  my = new MyInterfaceImpl(); //my�� ������ ��ü
		my.defaultMethod();
		my.method();	 
	}

}
