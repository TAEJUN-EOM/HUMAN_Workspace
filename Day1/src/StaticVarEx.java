
public class StaticVarEx {
    static int num = 100;
	public static void main(String[] args) {		
		System.out.println(num); //static����̹Ƿ� ��ü �Ǵ� Ŭ�����̸����� ����/��� ����
		System.out.println(StaticVarEx.num); //��ü ���� ���� Ŭ���� �̸����� ����/��� ����
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























