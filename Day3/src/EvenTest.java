
public class EvenTest {
	public static void main(String[] args) {
		System.out.println("start");
		int num = 0;
		try {
		     num = Integer.parseInt(args[0]);
		   System.err.println("try");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch1");
		}catch(NumberFormatException e) {
			System.out.println("catch2");
		}finally {
			System.out.println("finally");
		}
		if(num%2==0 && num!=0) {
			System.out.println(num+"짝수");
		}else if(num%2==1 && num!=0){
			System.out.println(num+"홀수");
		}
		System.out.println("end");
	}
}
//1.정상 수행
//2.ArrayIndexOutOfBoundsException 예외 발생
//3. NumberFormatException 예외 발생