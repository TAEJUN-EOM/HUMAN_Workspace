 

class Parent5 {	 
	protected String info(String description) {
		System.out.println("Parent5의 info() 호출됨");
		 return null;
	 }
}

class Child5 extends Parent5 {
	public String info(String description) { //override 메서드
		System.out.println("Child5에서 상속받은 info()를 version up함");	
		 return  null;
	 }
	public String info(String description, String title ) {//overload method
		System.out.println("Child5에서 상속받은 info()를 version up함");		
		this.info(description);
		return null;
	}
	 void  info(int age ) {//overload method
			System.out.println("Child5에서 상속받은info(int )를 중복정의 ");	
		 	final String name = "대한민국";
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

