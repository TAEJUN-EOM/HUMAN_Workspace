class Emp {
	private String empno;
	private String name;	 
	public Emp() {
		System.out.println("Emp() called");
	}
	public Emp(String empno ) { //overload			
		this("200", "Hong");
		System.out.println("Emp(empno) called");		
		this.empno = empno;			
	}
	public Emp(String empno, String name) { //overload
		System.out.println("Emp(empno, name) called");
		this.empno = empno;
		this.name = name;
	}
}
public class ConstructorCallEx {
	public static void main(String[] args) {
		//Emp  u = new Emp();
		Emp  u2 = new Emp("100");
	}

}
