package excercise.overall.processor;

public class Splitter extends Processor {

	@Override
	public  String[] process(Object input) {		
		return ((String)input).split(" ");
	}

}
