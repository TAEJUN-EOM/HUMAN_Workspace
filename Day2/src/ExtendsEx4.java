//자식클래스의 객체 생성시에 부모 클래스의 default 생성자가 먼저 실행되어 부모객체가 메모리에 생성됨 
//(부모의 멤버를 상속받으려면 부모 객체가 먼저 메모리에 초기화되어야 하므로)
 

class Parent3 {	 
//	Parent3(){
//		System.out.println("Parent3의 default 생성자 호출됨");
//	}  
	Parent3(int num){
		System.out.println("Parent3(int) 생성자 호출됨");
	}  
}

class Child3 extends Parent3 {
	Child3(){
		//JDK가 컴파일할때 바이트코드로 부모클래스의 default 생성자를 호출하는 코드를 자동 생성함
		super(100);
		System.out.println("Child3의 default 생성자 호출됨");
	}
}

public class ExtendsEx4 {
	public static void main(String[] args) {
		Child3 c = new Child3();	
	}
}

