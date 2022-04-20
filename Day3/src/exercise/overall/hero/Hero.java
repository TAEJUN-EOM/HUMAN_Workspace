package exercise.overall.hero;

public abstract class Hero  implements CanFight, CanFly, CanSwim{

	@Override
	public void swim() {	
		System.out.println(this.toString()+"�� ���ģ��");
	}

	@Override
	public void fly() {		
		System.out.println(this.toString()+"�� ����");
	}

	@Override
	public void fight() {		
		System.out.println(this.toString()+"�� �ο��");
	}
	
	public abstract void action();

}
