interface Animal {
	public void move();
	public void eat();
}
public class InnerEx4 {
	public static void main(String[] args) {
		Animal dog = new Animal() {
			public void move() {
				System.out.println("�� ��� ���� ����");
			}
			public void eat() {
				System.out.println("��� �Ͼ�");
			}
		};
		dog.move();
		dog.eat();
		Animal cat = new Animal() {
			public void move() {
				System.out.println("����");
			}
			public void eat() {
				System.out.println("�߸�");
			}
		};
		cat.move();
		cat.eat();
	}

}
