package exercise.overall.orchestra;

public class MusicTest {
    //�������̽��� ����� �迭��  �������̽��� ���� Ŭ������ ��ҷ� ������ �� �ֽ��ϴ�. 
	public static void main(String[] args) {
		Instrument[] instruments = new Instrument[] {
				new Piano(), new Flute(), new Drum(), new Timpani(), new Trumpet()
		};
		playAll(instruments);
		summary(instruments);
	}
	private static void playAll(Instrument[] e) {
		System.out.println("======== ���� ���� ========");
		for (Instrument instrue  : e) {
			instrue.playStart();
		}
		System.out.println( );
		System.out.println("======== ���� ���� ========");
		for (Instrument instrue  : e) {
			instrue.playStop();
		}
		System.out.println( );
	}
	
    private static void summary(Instrument[] e) {
    	int keyboard=0, wind=0, percussion=0;
    	System.out.println("======== ���� �Ǳ� ��� ========");
    	for (Instrument instrue  : e) {
    		if (instrue instanceof Keyboard) {
    			keyboard+=1;
    		}else if (instrue instanceof Percussion) {
    			percussion+=1;
    		}else if (instrue instanceof Wind) {
    			wind+=1;
    		}
			 System.out.println(instrue); //  instrue.toString()�� ����
		}
    	
    	System.out.println("======== ���� �Ǳ� ��========");
    	System.out.println("##�ǹݾǱ� ��:"+keyboard);
    	System.out.println("##���Ǳ� ��:"+ wind);
    	System.out.println("##Ÿ�Ǳ� ��:"+percussion );
    	   
    }
}
