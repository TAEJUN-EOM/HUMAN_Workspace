
class InstanceVar {
	private int num;  //�������
	public void setNum(int num) { //�Ű����� num�� ���ú���
		//Ŭ���� ���ο����� ��ü �ڽ��� ������ �� �ִ� Ư���� �ڵ麯��(��ü)�� �����˴ϴ�. 
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
