
public class ArrayCopyEx {

	public static void main(String[] args) {
		
		String s1 = new String("java");
		String result = s1.concat(", Hello");
		System.out.println(s1);
		System.out.println(result);
		
		int[] src = new int[] {100,200,300,400,500,600,700,800,900,1000};
		int[] dest = new int[10];
		System.arraycopy(src, 2, dest, 0, 5);
		for (int n: src) {
			System.out.print(n+",");
		}
		System.out.println("\n");
		for (int n: dest) {
			System.out.print(n+",");
		}
	}

}
