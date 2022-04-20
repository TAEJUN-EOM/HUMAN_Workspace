import java.util.Stack;
import java.util.TreeMap;


public class StackTest {

	public static void main(String[] args) {
		String[] cars = new String[] {  "K7", "K8", "K3", "K9","K5"};
		 
		Stack<String> stacks = new Stack ();  
		 
		for (String car : cars) {
		    stacks.push(car);
		}        
        System.out.println(":::::::::::::요소 추가후::::::::::::::");   
       
        System.out.println("stack요소 개수 :"+stacks.size() );
        System.out.println("가장 마지막에 저장된 객체는? "+ stacks.peek());
        System.out.println("stack요소 개수 :"+stacks.size() );
        System.out.println("가장 마지막에 저장된 객체 :  "+ stacks.pop());
        System.out.println("stack요소 개수 :"+stacks.size() );
        System.out.println();
        for (String car : stacks) {
        	 System.out.println(car+ " ");
		}   
        System.out.println(); 
        System.out.println("stack요소 개수 :"+stacks.size() );
        for (int idx=0;idx<stacks.size(); idx++) { 
    	   System.out.println(idx-- + " "+ stacks.pop());
       }
       System.out.println("stack요소 개수 :"+stacks.size() );
	}

}
