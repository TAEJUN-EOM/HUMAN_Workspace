class Calc2 {
	public void add(int a, int b) {
		System.out.println("1");
	}
	protected int add (double x, double y) { //overload
		System.out.println("2");
		return 0;
	}
    public void add( int a, int b,int...c ) { //overload, c는 가변파라미터
    	System.out.println(c.length);
    	int hap = 0;
    	for (int n : c)
    		hap +=n;
    	System.out.println(hap);
	}
     void add(String a, String b) { //overload
    	 System.out.println("4");
	}
    double add (double x, int y) { //overload
    	System.out.println("5");
 		return 0;
 	}	
}
public class OverloadTest {
	public static void main(String[] args) {
		 Calc2  ex = new Calc2();
		 ex.add('A', 0.5f);//?
		 ex.add(1,  2,3,4,5,6,7,8,9,10);
         int[] nums = new int[] {100, 10, 20, 30, 40, 50};
         ex.add(1, 2, nums);
	}

}










