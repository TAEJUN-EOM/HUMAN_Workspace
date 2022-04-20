
public class LamdbaEx1 {

	public static void main(String[] args) {
		Runnable run1 = new Runnable() {
			public void run() {
				System.out.println("run~~~");
			}
		};
		run1.run();
		
		Runnable run2 = () -> System.out.println("run2~~~");
		run2.run();
	}

}
