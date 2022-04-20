
//※ 자식클래스에서 부모클래스를 참조하기 위해 사용하는 참조변수는 super

class Parent2 {	 
	 String name ="parent";	
}

class Child2 extends Parent2 {
	String name ="child";
	public void method() {
		String name="local";
		System.out.println(name);//?
		System.out.println(this.name);
		System.out.println(super.name); 
		//부모와 자식에 정의된 멤버 변수와 멤버메서드 이름이 동일한 경우, 구별해서 사용하려면 super를 이용합니다.
	}
}

public class ExtendsEx3 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();		 
	}
}

