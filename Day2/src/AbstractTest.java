abstract class Animal {
    int eyes = 2;
    String name ;
    public void setName(String name) {
    	this.name = name;
    }
    //�߻� �޼��� ���� ����:  ���� body�� ����
    public abstract void eat() ;
    //�߻� �޼��尡 ���ǵ� Ŭ������  ���� body�� ���� �޼��� ������ �޸𸮿� ��ü(instance) ���� ����
    //Animal  ani = new Animal(); X
    //������ Ŭ������ ��ü�� ���� ���ϴ� Ŭ������ �����ؾ� �մϴ�. (public abstract class ~ ����)
    public abstract void move() ;
}

class Dog extends Animal{
	@Override
	public void eat() {
		 System.out.println("����̴� ������ �����ؿ�");		
	}

	@Override
	public void move() {		
		System.out.println("����̴� ���翡 �ٴ� �� �����ؿ�");
	}
	
}

public class AbstractTest {
	public static void main(String[] args) {
		//Animal  ani = new Animal();
		Animal  ani = new Dog();
		ani.eat();//override �޼��� ȣ��
	}
}
/*
Quiz1> abstract�޼��� ������ ���� Ŭ������ abstrac class�� ���𰡴��Ѱ���?  YES
Quiz2> abstrac class�� abstract�޼���� 2�� �̻�   ���𰡴��Ѱ���?  YES
Quiz3> abstrac class���� ��� �����Ѱ���? (�θ�, �ڽ� ��� abstract) YES
*/

abstract class Parent9 {
	
}

abstract class Child9 extends Parent9{
	
}





