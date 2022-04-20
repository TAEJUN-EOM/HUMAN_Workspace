package exercise.overall.hero;

public abstract class Hero  implements CanFight, CanFly, CanSwim{

	@Override
	public void swim() {	
		System.out.println(this.toString()+"이 헤엄친다");
	}

	@Override
	public void fly() {		
		System.out.println(this.toString()+"이 난다");
	}

	@Override
	public void fight() {		
		System.out.println(this.toString()+"이 싸운다");
	}
	
	public abstract void action();

}
