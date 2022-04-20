import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class StreamTokenizerEx {

	public static void main(String[] args) {
		BufferedReader br = null; 
		StreamTokenizer st = null; 
		FileWriter fw = null; 
		BufferedWriter bw = null; 
		PrintWriter pw = null; 
		try { 
			fw = new FileWriter("d:\\streamToken.txt" );
			bw = new BufferedWriter(fw); 
			pw = new PrintWriter(bw, true); 
			pw.println(10000); 
			pw.println("안녕하세요" ); 
			pw.println("akasha.park@gmail.com" ); 
			pw.println("I am Happy" ); 
			pw.println("~!@#" ); 
			System.out.println("체이닝된 객체를 이용해서 파일에 문자 스트림으로 기록");
			br = new BufferedReader(new FileReader("d:\\streamToken.txt"));
			st = new StreamTokenizer(br); 
			while (st.nextToken() != StreamTokenizer.TT_EOF) { 
				switch (st.ttype) { 
				case StreamTokenizer.TT_WORD: 
					System.out.println("Word => " + st.sval); 
					break; 
				case StreamTokenizer.TT_NUMBER: 
					System.out.println("Number => " + (int) st.nval); 
					break; 
				default: 
					System.out.println("No word, No number =>"+ (char) st.ttype);  
				}
			}
		} catch (IOException ioe) { 
			ioe.printStackTrace(); 
		} finally { 
			try { 
				if (fw != null) fw.close(); 
				if (bw != null) bw.close(); 
				if (pw != null) pw.close(); 
				if (br != null) br.close(); 
			} catch (IOException ioe) { 
				ioe.printStackTrace(); 
			} 
		} 
			
	}

}
