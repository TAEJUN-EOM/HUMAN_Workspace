//�ڽ�Ŭ������ ��ü �����ÿ� �θ� Ŭ������ default �����ڰ� ���� ����Ǿ� �θ�ü�� �޸𸮿� ������ 
//(�θ��� ����� ��ӹ������� �θ� ��ü�� ���� �޸𸮿� �ʱ�ȭ�Ǿ�� �ϹǷ�)
 

class Parent3 {	 
//	Parent3(){
//		System.out.println("Parent3�� default ������ ȣ���");
//	}  
	Parent3(int num){
		System.out.println("Parent3(int) ������ ȣ���");
	}  
}

class Child3 extends Parent3 {
	Child3(){
		//JDK�� �������Ҷ� ����Ʈ�ڵ�� �θ�Ŭ������ default �����ڸ� ȣ���ϴ� �ڵ带 �ڵ� ������
		super(100);
		System.out.println("Child3�� default ������ ȣ���");
	}
}

public class ExtendsEx4 {
	public static void main(String[] args) {
		Child3 c = new Child3();	
	}
}

