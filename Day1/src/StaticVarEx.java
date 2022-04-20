
public class StaticVarEx {
    static int num = 100;
	public static void main(String[] args) {		
		System.out.println(num); //static멤버이므로 객체 또는 클래스이름없이 참조/사용 가능
		System.out.println(StaticVarEx.num); //객체 생성 없이 클래스 이름으로 참조/사용 가능
		StaticVarEx ex = new StaticVarEx();
		System.out.println(ex.num);
		ex.num+=100;
		System.out.println(ex.num);
		StaticVarEx ex2 = new StaticVarEx();
		System.out.println(ex2.num);
		ex2.num*=3;
		System.out.println(ex2.num);
		ex = new StaticVarEx();
		System.out.println(ex.num);
		ex.num+=100;
		System.out.println(ex.num);
		System.out.println(ex2.num);
		System.out.println(num);
		System.out.println(StaticVarEx.num); 
	}

}























