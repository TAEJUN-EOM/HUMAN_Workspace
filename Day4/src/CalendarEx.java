import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); 
		int week_yy = now.get(Calendar.WEEK_OF_YEAR); 
		int yy = now.get(Calendar.YEAR); 
		int mm = now.get(Calendar.MONTH)+1;//1���� 0�� ����Ѵ�. 
		int dd = now.get(Calendar.DAY_OF_MONTH); 
		
		StringBuffer sb = new StringBuffer("���� "); 
		sb.append(week_yy); 
		sb.append("��°�� "); 
		sb.append(yy); 
		sb.append("�� "); 
		sb.append(mm); 
		sb.append("�� "); 
		sb.append(dd); 
		sb.append("��"); 
		System.out.println(sb.toString());
	}

}
