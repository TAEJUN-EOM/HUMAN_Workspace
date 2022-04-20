import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableEx {

	public static void main(String[] args) {
		FileOutputStream fos =  null;
		ObjectOutputStream oos = null;
		FileInputStream fis =  null;
		ObjectInputStream ois = null;
		try{
			fos = new FileOutputStream("objects.ser");
		    oos = new ObjectOutputStream(fos);
		    MyFrame2 frame = new MyFrame2();
		    oos.writeObject(frame);//����ȭ�ؼ� ����
		    System.out.println("MyFrame�� ����ȭ �ؼ� ���Ͽ� ����");
		    fis = new FileInputStream("objects.ser");
		    ois = new ObjectInputStream(fis);
		    MyFrame2 frame2 = (MyFrame2)ois.readObject();
		    System.out.println("���Ͽ��� MyFrame ��ü�� �о�ͼ� ������ȭ�� ");
		    System.out.println("�о�� ��ü�� �������� �޼��� ȣ���ؼ� ���� �� �� ����");
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

	}

}
