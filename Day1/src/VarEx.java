
class InstanceVar {
	private int num;  //멤버변수
	public void setNum(int num) { //매개변수 num은 로컬변수
		//클래스 내부에서는 객체 자신을 참조할 수 있는 특별한 핸들변수(객체)가 생성됩니다. 
		this.num = num;
	}
	public int getNum() {
    	return num;
    }
}


public class VarEx {
	public static void main(String[] args) {
		InstanceVar test = new InstanceVar();
		System.out.println(test.getNum());
		test.setNum(100);
		System.out.println(test.getNum());
	}
	
}
