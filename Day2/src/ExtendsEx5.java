 

class Parent5 {	 
	protected String info(String description) {
		System.out.println("Parent5�� info() ȣ���");
		 return null;
	 }
}

class Child5 extends Parent5 {
	public String info(String description) { //override �޼���
		System.out.println("Child5���� ��ӹ��� info()�� version up��");	
		 return  null;
	 }
	public String info(String description, String title ) {//overload method
		System.out.println("Child5���� ��ӹ��� info()�� version up��");		
		this.info(description);
		return null;
	}
	 void  info(int age ) {//overload method
			System.out.println("Child5���� ��ӹ���info(int )�� �ߺ����� ");	
		 	final String name = "���ѹα�";
			this.info(name);		 
		}
}

public class ExtendsEx5 {
	public static void main(String[] args) {
		Child5 c = new Child5();	
		//c.info("java");
		c.info("java", "bit");
	}
}

