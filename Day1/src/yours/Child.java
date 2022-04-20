package yours;

import my.Parent;

public class Child  extends Parent{
     public void method() {
    	 System.out.println(name);
    	 name = "¼­¿ï";
    	 System.out.println(name);
     }
     public static void main(String[] args) {
    	 Child c = new Child();
    	 c.method();
    	 System.out.println(c.name);
     }
}
