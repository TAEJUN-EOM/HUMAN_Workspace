

public interface MyInterface {
   int PORT =9000; 
   public void method()  ;
   
   public default void defaultMethod() {
	   System.out.println("�������̽��� defaultMethod called");
   }
   public static void staticMethod() {
	   System.out.println("�������̽��� staticMethod called");
   }
}
