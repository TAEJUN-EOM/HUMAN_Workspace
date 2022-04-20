package exercise.overall.hero;

public class HeroTest {

	public static void main(String[] args) {
		Hero[] heros = new Hero[] {
				new SuperMan(),
				new BatMan(),
				new SpiderMan()
		};
		System.out.print("Hero ¸ñ·Ï :[");
		for(int idx=0 ; idx< heros.length;idx++) {
			if(idx!=0) {
			System.out.print( ",");
			}
			System.out.print(heros[idx] );
		}
		System.out.print("]");
        System.out.println("\n");
        for(Hero h: heros)
        	 h.action() ;		
	}
}
