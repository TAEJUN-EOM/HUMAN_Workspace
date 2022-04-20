import java.util.HashMap; 
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
 
 

public class MapTest {

	public static void main(String[] args) {
		String[] keys = new String[] {  "K7", "K8", "K3", "K9", "K3", "K8", "K5"};
		Integer[]  values = new Integer[] { 500, 600, 300, 1000, 301, 601, 450};
		HashMap<String, Integer> hs = new HashMap ();  
		TreeMap<String, Integer> ts = new TreeMap ();  
		for (int idx=0;idx<keys.length;idx++) {
		    hs.put(keys[idx], values[idx]);
		    ts.put(keys[idx], values[idx]);
		}        
        System.out.println(":::::::::::::요소 추가후::::::::::::::");
        Set<String> hash_keys = hs.keySet();
        Iterator<String> iter = hash_keys.iterator();
        while(iter.hasNext()) {
        	String key =iter.next();
        	System.out.println(key+" : " + hs.get(key) );
        }
        System.out.println();
        Set<String> tree_keys = ts.keySet();
        Iterator<String> iter2 = tree_keys.iterator();
        while(iter2.hasNext()) {
        	String key =iter2.next();
        	System.out.println(key+" : " + ts.get(key) );
        }        
         
        
	}

}
