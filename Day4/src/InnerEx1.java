//�������ϸ� Outer.class�� Outer$Inner.class�� �����Ǹ�, �ڵ忡���� Outer.Inner�� �����մϴ�.
class Outer {
    private int num=1;   //Outer�� ��� �ʵ�
    protected class Inner {             //Outer�� ��� ��ø Ŭ����
           private int num=100;
           public void  innerMethod(){
        	   int num =1000;
               System.out.println(num);   
               System.out.println(this.num); 
               System.out.println(Outer.this.num); 
            }
     }
    public void outerMethod(){   //Outer�� ��� �޼���
    	System.out.println(num);   //?
    	Inner inn = new Inner();
    	System.out.println(inn.num);
    	inn.innerMethod();
   }
}
public class InnerEx1 {
	public static void main(String[] args) {
		//InnerŬ���� ��ü ���� ��� 1
		 Outer o = new Outer();
		 o.outerMethod();
		 Outer.Inner inner = o.new Inner();
		//InnerŬ���� ��ü ���� ��� 2
		 //Outer.Inner inner2 = new Outer().new Inner();
         //inner.innerMethod();
	}

}
