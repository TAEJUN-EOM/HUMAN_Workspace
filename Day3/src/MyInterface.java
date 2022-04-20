

public interface MyInterface {
   int PORT =9000; 
   public void method()  ;
   
   public default void defaultMethod() {
	   System.out.println("인터페이스의 defaultMethod called");
   }
   public static void staticMethod() {
	   System.out.println("인터페이스의 staticMethod called");
   }
}
