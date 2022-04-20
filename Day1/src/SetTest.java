import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
 

public class SetTest {

	public static void main(String[] args) {
		String[] strings = new String[] {  "K7", "K8", "K3", "K9", "K3", "K8", "K5",};
		
		HashSet<String> hs = new HashSet<String>();  
		TreeSet<String> ts = new TreeSet<String>();  
		for (String s : strings) {
		    hs.add(s);
		    ts.add(s);
		}        
        System.out.println(":::::::::::::요소 추가후::::::::::::::");
        
        for(String car : hs) {        	
        System.out.print(car +" " );
        }
        System.out.println( );
        System.out.println( );
        
        for(String car : ts) {        	
            System.out.print(car +" " );
         }
        
        System.out.println( );
        System.out.println( );
        Iterator<String> iter = hs.iterator();
        while(iter.hasNext()) {
        	System.out.print(iter.next() +" " );
        }
        
	}

}
