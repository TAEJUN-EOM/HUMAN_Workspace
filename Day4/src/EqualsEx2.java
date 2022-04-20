//��ü �� ==, equals()
class Student implements Cloneable{
	private String sno;
	private String name;
	public Student(String sno,  String name) {
		this.sno = sno;
		this.name =name;
	}
	
	public void setSno(String sno) {
		this.sno = sno;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {		
		 if(obj instanceof Student) { //Ÿ�� ��
			 Student s = (Student)obj;  //DownCasting
			 if(this.name.equals(s.name) && this.sno.equals(s.sno) ) {
					// && obj.hashCode()==this.hashCode()) {
				 return true;
			 }
		 }
		 
		 return false;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
	
	public Student getStudent()   {//Student��ü�� �����ؼ� ����
		Student cloned = null;
		 try {
		cloned = (Student)(super.clone());
		 }catch(CloneNotSupportedException e) {
			 
		 }
		 return cloned;	  
	}	
	
}
public class EqualsEx2 {

	public static void main(String[] args) {
		Student s1 = new Student("a01","Kim");
		Student s2 = new Student("a01","Kim");
        System.out.println(s1==s2);//�ּҰ� ��
        System.out.println(s1.hashCode()); //�ּҰ��� hash��
        System.out.println(s2.hashCode()); //�ּҰ��� hash��
        System.out.println(s1); //Ŭ�����̸�@�ּҰ��� ���� hash��(16�ؼ�)
        System.out.println(s2);
        System.out.println(s2.equals(s1)); //���� ��
        Student s3 =s1.getStudent(); //s1��ü �����ؼ� ����
        System.out.println(s1.hashCode() );
        System.out.println(s3.hashCode() );
        Student s4 =s1 ;//���� ����
        s1.setName("Lee");
        System.out.println(s1); 
        System.out.println(s3); //���� ����� ��ü
        System.out.println(s4); //���� ����� ��ü
        
        
        
	}

}
