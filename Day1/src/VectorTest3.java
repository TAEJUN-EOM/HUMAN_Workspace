import java.util.Iterator;
import java.util.Vector;

public class VectorTest3 {

	public static void main(String[] args) {
		String[] strings = new String[] { "K3", "K5", "K7", "K8", "K9"};
		
		Vector<String> v = new Vector<String>();  
		for (String s : strings) {
		    v.add(s);
		}        
        System.out.println(":::::::::::::요소 추가후::::::::::::::");
        for(String car : v) {        	
        System.out.print(car +" " );
        }
        System.out.println( );
        System.out.println( );
        v.insertElementAt("Audi", 0);        
        v.set(3, "Bentz");
        for(String car : v) {        	
            System.out.print(car +" " );
            }
        
	}

}
