package my;

 

public class Other {
	public void method() {
   	 Parent p = new Parent();     
   	 System.out.println(p.name);
   	 p.name = "seoul";
   	 System.out.println(p.name);
    }
	public static void main(String[] args) {
		Other o = new Other();
		o.method();

	}
}
