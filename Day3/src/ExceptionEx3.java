/*
���� ���л� Ű �Է°����κ��� ��ȿ������ üũ�ؼ� 130~180�� ����� OutOfRangeValueException ���ܸ� �߻���ŵ�ϴ�.
���� �߻���ų�� �޽����� "��ȿ�������� �����ϴ�." , "��ȿ�������� �����ϴ�." �� �����մϴ�
���ܰ� �߻��Ǹ� OutOfRangeValueException����Ŭ������ ����� �۳⵵ Ű������ �����մϴ�.
������ ���л� ��� Ű�� ����մϴ�.
 */
public class ExceptionEx3 {
	public void checkTall(double tall) throws OutOfRangeValueException{
		//��ȿ������ üũ�ؼ� 130~180�� ����� ���� RangeBoundsException �߻���ŵ�ϴ�.
		//���� �߻���ų�� �޽����� "��ȿ�������� �����ϴ�." , "��ȿ�������� �����ϴ�." �� ����
		 if (tall>180 ) 
			 throw new OutOfRangeValueException("��ȿ�������� �����ϴ�.");
		 if (tall<130)
			 throw new OutOfRangeValueException("��ȿ�������� �����ϴ�.");
		}

	public double averageTall(double[] talls){
		 //������ ���л� ��� Ű�� ����ؼ� ����
		double total = 0;
		 for (double t : talls) {
			 total += t;
		 }
		 return total/talls.length;
		}
		
	public static void main(String[] args){
		double[]  middle_talls = new double[] { 
				152,155.5,148.5,192,160,162,165,168,115,159,157,170,171
				};
		//�迭�� ����� Ű����  ��ȿ������ üũ�ؼ� ���ܰ� �߻��Ǹ� ����ó��
		//������ ���л� ��� Ű ���
		ExceptionEx3 ex = new ExceptionEx3();
		for (int i=0;i<middle_talls.length;i++) {
			try {
			ex.checkTall(middle_talls[i]);
			}catch(OutOfRangeValueException e) {
				System.err.println(e.getMessage());
				middle_talls[i] = e.getMiddleAvgTall();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}//for end
		System.out.printf("������ ���л� ��� Ű : %1$.2f" , ex.averageTall(middle_talls));
		}
 
}
