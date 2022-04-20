//Local Inner Class는 메서드내에 정의된 클래스로서 정의된 메서드 내부에서만 객체 생성해서 사용할 수 있음
class Outer3 {
  private int member=1;
  public void outerMethod(){  
	  int local = 0;
	  class Inner  {  //Local Inner class
		  int member=100;
		  public  void innerMethod(){
			  System.out.println(member);
			  System.out.println(local);
			  System.out.println(Outer3.this.member);
		  } 
	  }
	  Inner inn = new Inner();
	  inn.innerMethod();
  }
  public void method() {
	 // new Inner();
	  //System.out.println(local);
  }
}
public class InnerEx3 {
	public static void main(String[] args) {
		 //Outer3.Inner inner = new Outer3().new Inner();
		Outer3 outer = new Outer3();
		outer.outerMethod();
	}

}
