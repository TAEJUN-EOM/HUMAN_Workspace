//Local Inner Class�� �޼��峻�� ���ǵ� Ŭ�����μ� ���ǵ� �޼��� ���ο����� ��ü �����ؼ� ����� �� ����
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
