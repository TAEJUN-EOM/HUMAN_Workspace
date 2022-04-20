import java.util.Iterator;
import java.util.Vector;

public class VectorTest2 {

	public static void main(String[] args) {
		String[] strings = new String[] { "K3", "K5", "K7", "K3", "K8", "K9"};
		
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
        for(int idx =0 ;idx < v.size(); idx++) {
        	 System.out.print(v.get(idx)+" " );
        }
        System.out.println( );
        System.out.println( );
        Iterator<String> iter = v.iterator();
        while(iter.hasNext()) {
        	 System.out.print(iter.next()+" " );
        }
        
	}

}
