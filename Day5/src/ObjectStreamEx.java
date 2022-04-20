import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
 

public class ObjectStreamEx {

	public static void main(String[] args) {
		FileOutputStream fos =  null;
		ObjectOutputStream oos = null;
		FileInputStream fis =  null;
		ObjectInputStream ois = null;
		try{
			fos = new FileOutputStream("objects.ser");
		    oos = new ObjectOutputStream(fos);
		    MyFrame frame = new MyFrame();
		    oos.writeObject(frame);//직렬화해서 저장
		    System.out.println("MyFrame을 직렬화 해서 파일에 저장");
		    fis = new FileInputStream("objects.ser");
		    ois = new ObjectInputStream(fis);
		    MyFrame frame2 = (MyFrame)ois.readObject();
		    System.out.println("파일에서 MyFrame 객체를 읽어와서 역직렬화함 ");
		    System.out.println("읽어온 객체는 생성없이 메서드 호출해서 실행 할 수 있음");
		    frame2.setVisible(true);		    
		} catch (Exception  e) { 
			e.printStackTrace(); 
		}  finally { 
			try { 
				if (fis != null) fis.close(); 
				if (ois != null) ois.close(); 
				if (fos != null) fos.close(); 
				if (oos != null) oos.close(); 
			} catch (IOException ioe) { 
				ioe.printStackTrace(); 
			} 
		} 	      
	}//main end
}//class end
