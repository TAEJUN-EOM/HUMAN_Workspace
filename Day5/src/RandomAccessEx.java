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
			System.out.print(" 처음 읽은 내용 : " ); 
			System.out.println(new String(buf)); 
			message = " 대한민국 파이팅!!!" ; 
			ra.seek(ra.length()); 
			ra.write(message.getBytes()); 
			buf = new byte[(int) ra.length()]; 
			ra.seek(0); 
			ra.read(buf); 
			System.out.print(" 두번째 읽은 내용 : " ); 
			System.out.println(new String(buf));
			message = " 오늘은 날씨가 정말 이상하네요 " ;
			ra.seek(0); 
			ra.write(message.getBytes()); 
			buf = new byte[(int) ra.length()]; 
			ra.seek(0); 
			ra.read(buf); 
			System.out.print(" 세번째 읽은 내용 : " ); 
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
