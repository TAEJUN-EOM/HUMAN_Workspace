//객체 비교 ==, equals()

public class EqualsEx {

	public static void main(String[] args) {
		
		String s1 = new String("java");
		String s2 = new String("java"); 
		String s3 =  "java" ;
		String s4 =  "java" ; 
		System.out.println(s1==s2); //? reference type은 주소값 비교
		System.out.println(s4==s3);  //?   String pool 메모리 공간에 생성		 
		System.out.println(s1==s3);  //?
		 
	}

}
