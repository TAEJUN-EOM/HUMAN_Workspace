package exercise.overall.orchestra;

public class Percussion implements Instrument {
	@Override
	public void playStart() {
		System.out.println(this.toString() +" ���ֽ��� ");
		
	}

	@Override
	public void playStop() {
		System.out.println(this.toString() +" ���� ���� ");
		
	}

	@Override
	public String toString() {
		return "Ÿ�Ǳ�";
	}

}
