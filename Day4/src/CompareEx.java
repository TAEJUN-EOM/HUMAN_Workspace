import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

class Able {
	String empno;
	int java, db, web, python, total;

	public Able(String empno, int java, int db, int web, int python) {
		super();
		this.empno = empno;
		this.java = java;
		this.db = db;
		this.web = web;
		this.python = python;
		total = java + db + web + python;
	}

	public int getTotal() {
		return total;
	}
}

class AbleCompare implements Comparator<Able>{
	public int compare(Able obj1, Able obj2){
		int var = 0;
		if(obj1.getTotal() > obj2.getTotal()) {
			var = 1;
		}
		else if(obj1.getTotal() < obj2.getTotal()) {
			var = -1;
		}
		return var;
	}
}


public class CompareEx {
	public static void main(String[] args) {
		Vector<Able> v = new Vector<Able>(2,5);
		Able a1 = new Able("B123",70,75,70,70); 
		Able a2 = new Able("T723",90,90,90,85); 
		Able a3 = new Able("A427",85,80,80,90); 
		Able a4 = new Able("G533",90,70,60,75); 
		v.addElement(a1); 
		v.addElement(a2); 
		v.addElement(a3); 
		v.addElement(a4); 
		
		System.out.println("------ Sort Àü ------");		
		Able[] a = new Able[v.size()]; 
		v.copyInto(a); 
		for(Able n : a) 
			System.out.println(n.empno+","+n.getTotal()); 
		AbleCompare comp = new AbleCompare();
		Arrays.sort(a, comp);
		System.out.println("------ Sort ÈÄ ------");	
		for(Able n : a) 
			System.out.println(n.empno+","+n.getTotal()); 
	}

}
