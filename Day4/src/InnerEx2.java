class Outer2 {
    private int num=1;   //Outer�� ��� �ʵ�
    public static int staticNum = 100;
    static class Inner2 {            //Outer�� ��� ��ø Ŭ����           
           public void  innerMethod(){
        	   System.out.println(staticNum);
        	   //System.out.println(num);                
            }
           public static void  inner2() {
        	   System.out.println("static inner2() called");
           }
     }
    public void outerMethod(){   //Outer�� ��� �޼���
    	//��ü ���� ���� Ŭ�����̸����� �޼��� ȣ��
    	 Inner2.inner2();    	 
   }
}
public class InnerEx2 {
	public static void main(String[] args) {
		//��ü ���� ���� Ŭ�����̸����� �޼��� ȣ��
		 Outer2.Inner2.inner2();
		 Outer2 outer = new Outer2();
		 outer.outerMethod();
	}

}
