interface Animal {
	public void move();
	public void eat();
}
public class InnerEx4 {
	public static void main(String[] args) {
		Animal dog = new Animal() {
			public void move() {
				System.out.println("¹è ±ò°í ¸¸¼¼ ´¯±â");
			}
			public void eat() {
				System.out.println("»ç°ú ºÏ¾î");
			}
		};
		dog.move();
		dog.eat();
		Animal cat = new Animal() {
			public void move() {
				System.out.println("Á¡ÇÁ");
			}
			public void eat() {
				System.out.println("Ãß¸£");
			}
		};
		cat.move();
		cat.eat();
	}

}
