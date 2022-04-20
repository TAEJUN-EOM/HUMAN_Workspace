package yours;

import my.Parent;

public class Other {
     public void method() {
    	 Parent p = new Parent();     
    	 System.out.println(p.name);
    	 p.name = "¥Î«—πŒ±π";
    	 System.out.println(p.name);
     }
	public static void main(String[] args) {
		Other o = new Other();
		o.method();

	}

}
