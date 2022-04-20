class Outer2 {
    private int num=1;   //Outer의 멤버 필드
    public static int staticNum = 100;
    static class Inner2 {            //Outer의 멤버 중첩 클래스           
           public void  innerMethod(){
        	   System.out.println(staticNum);
        	   //System.out.println(num);                
            }
           public static void  inner2() {
        	   System.out.println("static inner2() called");
           }
     }
    public void outerMethod(){   //Outer의 멤버 메서드
    	//객체 생성 없이 클래스이름으로 메서드 호출
    	 Inner2.inner2();    	 
   }
}
public class InnerEx2 {
	public static void main(String[] args) {
		//객체 생성 없이 클래스이름으로 메서드 호출
		 Outer2.Inner2.inner2();
		 Outer2 outer = new Outer2();
		 outer.outerMethod();
	}

}
