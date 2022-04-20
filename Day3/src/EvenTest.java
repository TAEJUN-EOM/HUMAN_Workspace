
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
			System.out.println(num+"¦��");
		}else if(num%2==1 && num!=0){
			System.out.println(num+"Ȧ��");
		}
		System.out.println("end");
	}
}
//1.���� ����
//2.ArrayIndexOutOfBoundsException ���� �߻�
//3. NumberFormatException ���� �߻�