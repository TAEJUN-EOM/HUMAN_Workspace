class My {
	public void methodA() {
		System.out.println("A");
		methodB();
	}

	public void methodB() {
		System.out.println("B");
		methodC();
	}

	public void methodC() {
		System.out.println("C");
	}
}

public class CallEx {
	public static void main(String[] args) {
		 My  m = new My();
		 m.methodA();

	}

}
