abstract class Animal {
    int eyes = 2;
    String name ;
    public void setName(String name) {
    	this.name = name;
    }
    //추상 메서드 선언 문법:  구현 body가 없음
    public abstract void eat() ;
    //추상 메서드가 정의된 클래스는  구현 body가 없는 메서드 때문에 메모리에 객체(instance) 생성 못함
    //Animal  ani = new Animal(); X
    //때문에 클래스에 객체를 생성 못하는 클래스로 선언해야 합니다. (public abstract class ~ 선언)
    public abstract void move() ;
}

class Dog extends Animal{
	@Override
	public void eat() {
		 System.out.println("댕댕이는 육포를 좋아해요");		
	}

	@Override
	public void move() {		
		System.out.println("댕댕이는 눈밭에 뛰는 걸 좋아해요");
	}
	
}

public class AbstractTest {
	public static void main(String[] args) {
		//Animal  ani = new Animal();
		Animal  ani = new Dog();
		ani.eat();//override 메서드 호출
	}
}
/*
Quiz1> abstract메서드 선언이 없는 클래스를 abstrac class로 선언가능한가요?  YES
Quiz2> abstrac class에 abstract메서드는 2개 이상   선언가능한가요?  YES
Quiz3> abstrac class간에 상속 가능한가요? (부모, 자식 모두 abstract) YES
*/

abstract class Parent9 {
	
}

abstract class Child9 extends Parent9{
	
}





