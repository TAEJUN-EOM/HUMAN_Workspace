import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		FileOutputStream fos = null; 
		try{ 
			File f = new File("d://test.txt");
			fos = new FileOutputStream(f);
			String message = "Hello FileOutputStream!!"; 
			fos.write(message.getBytes());
			message = "안녕하세요? 한글쓰기"; 
			fos.write(message.getBytes());
			
		}catch(FileNotFoundException fnfe){ 
			fnfe.printStackTrace(); 
		}catch(IOException ie){ 
			ie.printStackTrace(); 
		}finally{ 
			try{ 
				if(fos != null) fos.close(); 
			}catch(IOException ioe){ 
				ioe.printStackTrace(); 
			} 
		} 
	}

}
