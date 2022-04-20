package exercise.overall.orchestra;

public class MusicTest {
    //인터페이스로 선언된 배열에  인터페이스를 구현 클래스를 요소로 저장할 수 있습니다. 
	public static void main(String[] args) {
		Instrument[] instruments = new Instrument[] {
				new Piano(), new Flute(), new Drum(), new Timpani(), new Trumpet()
		};
		playAll(instruments);
		summary(instruments);
	}
	private static void playAll(Instrument[] e) {
		System.out.println("======== 연주 시작 ========");
		for (Instrument instrue  : e) {
			instrue.playStart();
		}
		System.out.println( );
		System.out.println("======== 연주 종료 ========");
		for (Instrument instrue  : e) {
			instrue.playStop();
		}
		System.out.println( );
	}
	
    private static void summary(Instrument[] e) {
    	int keyboard=0, wind=0, percussion=0;
    	System.out.println("======== 연주 악기 목록 ========");
    	for (Instrument instrue  : e) {
    		if (instrue instanceof Keyboard) {
    			keyboard+=1;
    		}else if (instrue instanceof Percussion) {
    			percussion+=1;
    		}else if (instrue instanceof Wind) {
    			wind+=1;
    		}
			 System.out.println(instrue); //  instrue.toString()와 동일
		}
    	
    	System.out.println("======== 연주 악기 수========");
    	System.out.println("##건반악기 수:"+keyboard);
    	System.out.println("##관악기 수:"+ wind);
    	System.out.println("##타악기 수:"+percussion );
    	   
    }
}
