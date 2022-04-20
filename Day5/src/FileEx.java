import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException{
		String filePath = "d:\\";
		File f1 = new File(filePath); 
//		String list[] = f1.list(); 
//		for(int i=0;i<list.length;i++){ 
//			File f2 = new File(filePath , list[i]); 
//			if(f2.isDirectory()){ 
//				System.out.printf("%s : 디렉토리 %n",list[i]); 
//			}else{ 
//				System.out.printf("%s : 파일(%,dbyte)%n", list[i],f2.length()); 
//			}
//		}
		File f2 = new File(filePath, "test.txt");
		System.out.println(f2.createNewFile());
		File f3 = new File(filePath, "movies");
		System.out.println(f3.mkdir());
		f2.renameTo(new File("d:\\excercise.txt"));
		//System.out.println(f2.delete());
	}
}


