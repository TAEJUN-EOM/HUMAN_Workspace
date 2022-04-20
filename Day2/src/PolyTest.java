class Parent8 {
	int  num = 1;
	int  age = 1;
	
	public void method() {
		System.out.println("parent's method() called");
	}
	public void sound() {
		System.out.println("parent's sound() called");
	}
	
}
class Child8 extends Parent8 {
	int  num = 100;
	int phone = 0;
	public void method() {//override 메서드
		System.out.println("child's method() called");
	}
	public void dance() {
		System.out.println("child's dance() called");
	}
}
public class PolyTest {

	public static void main(String[] args) {
		Parent8 p = new Parent8();
		System.out.println(p.num);
		p.method();
		p.sound();
		
		Child8 c = new Child8();
		System.out.println(c.num);
		c.method(); //override 메서드 호출
		c.sound();
		c.dance();
		
		Parent8 p2 = new Child8();  //UpCasting
		System.out.println(p2.num);// 선언자 우선
		System.out.println(p2.age);
		//System.out.println(p2.phone);
		System.out.println(((Child8)p2).phone);//DownCasting
		//객체의 형변환은 UpCasting된 객체만 DownCasting이 가능합니다.
		p2.method();// override 메서드 호출
		p2.sound();
		//p2.dance();  //선언자인 부모 클래스에 없기 때문에 호출 불가
		((Child8)p2).dance();
		Object o = new String("java");		 
		o = new Integer(100);	 
	}
}
