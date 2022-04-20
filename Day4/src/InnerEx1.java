//컴파일하면 Outer.class와 Outer$Inner.class가 생성되며, 코드에서는 Outer.Inner로 선언합니다.
class Outer {
    private int num=1;   //Outer의 멤버 필드
    protected class Inner {             //Outer의 멤버 중첩 클래스
           private int num=100;
           public void  innerMethod(){
        	   int num =1000;
               System.out.println(num);   
               System.out.println(this.num); 
               System.out.println(Outer.this.num); 
            }
     }
    public void outerMethod(){   //Outer의 멤버 메서드
    	System.out.println(num);   //?
    	Inner inn = new Inner();
    	System.out.println(inn.num);
    	inn.innerMethod();
   }
}
public class InnerEx1 {
	public static void main(String[] args) {
		//Inner클래스 객체 생성 방법 1
		 Outer o = new Outer();
		 o.outerMethod();
		 Outer.Inner inner = o.new Inner();
		//Inner클래스 객체 생성 방법 2
		 //Outer.Inner inner2 = new Outer().new Inner();
         //inner.innerMethod();
	}

}
