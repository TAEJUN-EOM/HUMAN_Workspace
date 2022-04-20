package exercise.overall.orchestra;

public class Percussion implements Instrument {
	@Override
	public void playStart() {
		System.out.println(this.toString() +" 연주시작 ");
		
	}

	@Override
	public void playStop() {
		System.out.println(this.toString() +" 연주 종료 ");
		
	}

	@Override
	public String toString() {
		return "타악기";
	}

}
