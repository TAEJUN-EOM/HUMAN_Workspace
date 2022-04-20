import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessEx {

	public static void main(String[] args) {
		RandomAccessFile ra = null; 
		try { 
			ra = new RandomAccessFile("d://random.txt", "rw");
			String message = " hello" ; 
			ra.seek(ra.length()); 
			ra.write(message.getBytes()); 
			byte[] buf = new byte[(int) ra.length()]; 
			ra.seek(0); 
			ra.read(buf); 
			System.out.print(" ó�� ���� ���� : " ); 
			System.out.println(new String(buf)); 
			message = " ���ѹα� ������!!!" ; 
			ra.seek(ra.length()); 
			ra.write(message.getBytes()); 
			buf = new byte[(int) ra.length()]; 
			ra.seek(0); 
			ra.read(buf); 
			System.out.print(" �ι�° ���� ���� : " ); 
			System.out.println(new String(buf));
			message = " ������ ������ ���� �̻��ϳ׿� " ;
			ra.seek(0); 
			ra.write(message.getBytes()); 
			buf = new byte[(int) ra.length()]; 
			ra.seek(0); 
			ra.read(buf); 
			System.out.print(" ����° ���� ���� : " ); 
			System.out.println(new String(buf));
			}catch (IOException ioe) { 
				ioe.printStackTrace(); 
			} finally { 
				try { 
					if (ra != null) ra.close(); 
				} catch (IOException ioe) { 
					ioe.printStackTrace(); 
				} 
			} 
	}

}
