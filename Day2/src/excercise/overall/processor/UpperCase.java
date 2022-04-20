package excercise.overall.processor;

public class UpperCase extends Processor {

	@Override
	public String process(Object input) {		 
		return ((String)input).toUpperCase();
	}

}
