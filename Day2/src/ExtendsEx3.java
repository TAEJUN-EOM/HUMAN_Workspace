
//�� �ڽ�Ŭ�������� �θ�Ŭ������ �����ϱ� ���� ����ϴ� ���������� super

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
		//�θ�� �ڽĿ� ���ǵ� ��� ������ ����޼��� �̸��� ������ ���, �����ؼ� ����Ϸ��� super�� �̿��մϴ�.
	}
}

public class ExtendsEx3 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();		 
	}
}

