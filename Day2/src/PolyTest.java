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
	public void method() {//override �޼���
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
		c.method(); //override �޼��� ȣ��
		c.sound();
		c.dance();
		
		Parent8 p2 = new Child8();  //UpCasting
		System.out.println(p2.num);// ������ �켱
		System.out.println(p2.age);
		//System.out.println(p2.phone);
		System.out.println(((Child8)p2).phone);//DownCasting
		//��ü�� ����ȯ�� UpCasting�� ��ü�� DownCasting�� �����մϴ�.
		p2.method();// override �޼��� ȣ��
		p2.sound();
		//p2.dance();  //�������� �θ� Ŭ������ ���� ������ ȣ�� �Ұ�
		((Child8)p2).dance();
		Object o = new String("java");		 
		o = new Integer(100);	 
	}
}
