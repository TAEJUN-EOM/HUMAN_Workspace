class Parent {
	//private String name ="parent";
	 String name ="parent";
	public void action() {
		System.out.println("Parent.action() called");
	}
}

class Child extends Parent {
	//멤버필드와 멤버메서드가 정의되어 있지 않음
}

public class ExtendsEx1 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.name);
		c.action();		 
	}
}