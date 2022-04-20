package excercise.overall.processor;

public class ProcessorTest {
	public static void main(String[] args) {
		Processor[]  proc = new Processor[] {
				new LowerCase(),
				new Splitter(),
				new UpperCase()
		};
		process(proc, "I'm so sorry, but I  love you. ´Ù °ÅÁþ¸»");
	}
	private static void process(Processor[] processors, String s) {		
		for (Processor p : processors) {
			System.out.println("Processor¸í : "+ p.name());
 			if( p.name().equals("Splitter") ){ 	
 				Splitter splitter = (Splitter)p;
 				String[] strings = splitter.process(s);
 				for (String n : strings) {
 					System.out.print(n+", ");
 				}
 				System.out.println();
 					
 			}else {			
			System.out.println(p.process(s));
 			}
		 }
	}
}


