
public class PolyTest2 {
	public void method(Object o) {
		System.out.println(o.getClass().getName());
		// System.out.println(o.length());
		if (o.getClass().getName().equals("java.lang.String")) {
			System.out.println(((String) o).length());
		} else {
			System.out.println(((int[]) o).length);
		}
	}

	public static void main(String[] args) {
		PolyTest2 test = new PolyTest2();
		//test.method(new String("korea")); // �޼��忡 ���޵ɶ� Upcasting��
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 8 };
		test.method(nums); // ��� reference type�� �θ� Object
	}
}
