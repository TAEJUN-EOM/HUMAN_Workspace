//객체 비교 ==, equals()
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
		 if(obj instanceof Student) { //타입 비교
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
	
	public Student getStudent()   {//Student객체를 복제해서 리턴
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
        System.out.println(s1==s2);//주소값 비교
        System.out.println(s1.hashCode()); //주소값의 hash값
        System.out.println(s2.hashCode()); //주소값의 hash값
        System.out.println(s1); //클래스이름@주소값에 대한 hash값(16준수)
        System.out.println(s2);
        System.out.println(s2.equals(s1)); //내용 비교
        Student s3 =s1.getStudent(); //s1객체 복제해서 리턴
        System.out.println(s1.hashCode() );
        System.out.println(s3.hashCode() );
        Student s4 =s1 ;//얕은 복사
        s1.setName("Lee");
        System.out.println(s1); 
        System.out.println(s3); //깊은 복사된 객체
        System.out.println(s4); //얕은 복사된 객체
        
        
        
	}

}
